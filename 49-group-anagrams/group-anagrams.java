class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map:
        //sorted chars : List of corresponding unsorted words
        Map<String, List<String>> nmap = new HashMap<>();
        List<List<String>> toRet = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String sorted = new String(chArr);
            if(nmap.containsKey(sorted)){
                nmap.get(sorted).add(strs[i]);
            }
            else{
                List<String> aList = new ArrayList<>();
                aList.add(strs[i]);
                nmap.put(sorted, aList);
            }
        }

        for(String sortedKey: nmap.keySet()){
            toRet.add(nmap.get(sortedKey));
        }

        return toRet;
}
}