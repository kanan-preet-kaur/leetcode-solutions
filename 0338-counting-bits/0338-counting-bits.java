class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 1;i < n + 1;i++) {
            int num = i;
            int count = 0;
            while(num > 0) {
                if((num & 1) != 0){
                    count++;
                }
                num >>= 1;
            }
            arr[i] = count;
        }
        return arr;
    }
}