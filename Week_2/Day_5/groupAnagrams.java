class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length ==0 ){
            return new ArrayList<>();
        }
        HashMap<String , List<String>> map = new HashMap<>();
        for(int i=0 ; i<strs.length ; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted= new String(arr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted , list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
