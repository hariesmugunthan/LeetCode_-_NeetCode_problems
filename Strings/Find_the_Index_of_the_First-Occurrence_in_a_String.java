class Solution {
    public int strStr(String haystack, String needle) {
        int sn = needle.length();
        int sh = haystack.length() - sn;
        for (int i = 0; i <= sh; i++) {
            if (needle.equals(haystack.substring(i, i + sn))) {
                return i;
            }
        }
        return -1;
    }

    /
    public static void main(String[] args) {
        Solution sol = new Solution();
        String haystack = "hello";
        String needle = "ll";
        int result = sol.strStr(haystack, needle);
        System.out.println("Index of substring: " + result);
    }
}
