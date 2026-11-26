class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            num.add(0,1);
        
            for(int j=1;j<num.size()-1;j++){
                num.set(j,num.get(j)+num.get(j+1));
            }
        }
            return num;
    }
}