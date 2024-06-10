class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for(int a : arr){
            temp.add(a);
        }
        for(int i=0; i<arr.length; i++){
            int a = temp.get(i);
            if((temp.contains(2*a) && a!=2*a)){
                int id = temp.indexOf(2*a);
                if(i != id){
                    return true;
                }
                
            }
            if(a==0){
                int index = temp.lastIndexOf(a);
                if(index != i){
                    return true;
                }
            }
        }
        return false;
    }
}
