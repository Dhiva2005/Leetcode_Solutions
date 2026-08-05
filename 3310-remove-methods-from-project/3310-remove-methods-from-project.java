class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adjL = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjL.add(new ArrayList<>());
        }
        for(int[]edge:invocations){
            adjL.get(edge[0]).add(edge[1]);
        }


        boolean[] isSus = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(k); 
        isSus[k] = true;
        while(!stack.isEmpty()){
            int currMethod = stack.pop();   
            for(int calledMethod:adjL.get(currMethod)){
                if(!isSus[calledMethod]){
                    isSus[calledMethod] = true;
                    stack.push(calledMethod);
                }
            }
        }

        
        for(int[] edge:invocations){
            int caller = edge[0];
            int called = edge[1];

            if(!isSus[caller] && isSus[called]){
                List all = new ArrayList<>();
                for(int m=0;m<n;m++){
                    all.add(m);
                }
                return all;
            }
        }

        List res = new ArrayList<>();
        for(int m=0;m<n;m++){
            if(!isSus[m]){
                res.add(m);
            }
        }
        return res;
    }
}