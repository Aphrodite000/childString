public class Solution {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] bool =new boolean[p.length];
        for(int i=0;i<p.length;i++){
            if(s.contains(p[i])){
                bool[i]=true;
            }else{
                bool[i]=false;
            }
        }
        return bool;
    }
}
