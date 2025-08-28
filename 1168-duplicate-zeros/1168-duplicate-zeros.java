class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0; 
        int j = 0;
        int[] temp = new int[arr.length];
        while(j < arr.length){
            if(arr[i] == 0 && j < arr.length - 1){
                temp[j++] = arr[i++];
                temp[j++] = 0;
            }
            else{
                temp[j++] = arr[i++];
            }
        }
        for(i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }
}