class Solution {
    public int pivotInteger(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = 1; i < n; i++) {
            a[i] = a[i] + a[i - 1];
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (a[i] == (a[n - 1] - a[i - 1])) {
                return i + 1;
            }
        }
        return -1;
    }

   
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 8;  // you can test with any value
        int result = obj.pivotInteger(n);
        System.out.println("Pivot Integer: " + result);
    }
}
