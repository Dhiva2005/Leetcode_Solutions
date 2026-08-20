class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        int count1 = 0;
        int count2 = 0;

        arr1[count1++] = nums[0];
        arr2[count2++] = nums[1];

        for(int i = 2;i<n;i++){
            if(arr1[count1-1]>arr2[count2-1]){
                arr1[count1++] = nums[i];
            }
            else{
                arr2[count2++] = nums[i];
            }
        }

        int k =0;

        for(int i=0;i<count1;i++){
            arr3[k++] = arr1[i];
        }

        for(int i=0;i<count2;i++){
            arr3[k++] = arr2[i];
        }

        return arr3;
    }
}