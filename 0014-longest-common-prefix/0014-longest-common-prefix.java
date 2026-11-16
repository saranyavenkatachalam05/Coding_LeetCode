class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p=strs[0];
        for(int ind=1;ind<strs.length;ind++){
            int j=0;
            while(j<strs[ind].length()&&j<p.length()&& p.charAt(j)==strs[ind].charAt(j)){
                j++;
            }p=p.substring(0,j);
            if(p.isEmpty()){
                break;
            }
        }return p;
    }
}