class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int sum=i+j;
                    if(sum<minSum){
                        minSum=sum;
                        ans.clear();
                        ans.add(list1[i]);
                    }
                    else if(sum==minSum){
                       ans.add(list1[i]);
                    }
                }
            }
        }
    return ans.toArray(new String[0]);
    }
}