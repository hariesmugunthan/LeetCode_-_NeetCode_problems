class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList();

        
        int[][] arr=new int[strs.length][26];
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            for(int j=0;j<s.length();j++){
            arr[i][s.charAt(j)-'a']++;

        }
        }
        // for(int i=0;i<arr.length;i++)
        // System.out.println(Arrays.toString(arr[i]));
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==-1) continue;
            List<String>li=new ArrayList();
            int[] t=arr[i].clone();
            li.add(strs[i]);
            arr[i][0]=-1;
            for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                 if(arr[j][0]==-1) continue;
                if(Arrays.equals(t,arr[j])){li.add(strs[j]);arr[j][0]=-1;} 
            }
            ans.add(li);

        }
        return ans;
        
    }
  //main function
   public static void main(String[] args) {
        Solution obj = new Solution();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = obj.groupAnagrams(strs);

        
        for(List<String> group : result) {
            System.out.println(group);
        }
    }
}
