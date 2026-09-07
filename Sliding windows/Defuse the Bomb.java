class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        if(k==0) return new int[code.length];
        else if(k<0){
            k*=-1;
            int c=0;
            int t=0;
            int idx=code.length-1;
            for(int i=code.length-1;i>=(code.length-k);i--){
                t+=code[i];
            }
            arr[0]=t;
            int r=0;
            int l=code.length-k;
            System.out.println(l+" "+r +" "+k) ;
            for(int i=1;i<code.length;i++){
                
                l=l%code.length;
                r=r%code.length;
                t=t-code[l]+code[r];
               arr[i]=t;
                l++;r++;

            }
            return arr;
        }
        else{

        
        int idx=1;
        int c=0;
        int t=0;
        while(c<k){
        int ix=idx%code.length;
        t+=code[ix];
        c++;
        idx++;
        
        }
        arr[0]=t;
        int r=idx;
        
        //System.out.println(t+" "+idx-1);
        
        for(int i=1;i<code.length;i++){
        int v=r%code.length;
        t=t-code[i]+code[v];
        System.out.println(t);
        r++;
        arr[i]=t;
        }
        return arr;}
    }
}
