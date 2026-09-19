class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] comp = path.split("/");

        for (String c : comp) {
            if (c.equals(".") || c.equals("")) {
                continue;
            }
            if (c.equals("..")) {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }

        StringBuilder str = new StringBuilder();

        for(String s:stack){
            str.append("/").append(s);
        }

        return str.toString();
    }
}