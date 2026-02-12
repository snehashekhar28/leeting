class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c: s.toCharArray()){
            Integer cCount = freqMap.get(c);
            if(cCount == null) cCount = 0;
            freqMap.put(c, ++cCount);
        }
        List<Map.Entry<Character, Integer>> entries = new ArrayList<> (freqMap.entrySet());
        entries.sort((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: entries){
            for(int i = 0; i < entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}