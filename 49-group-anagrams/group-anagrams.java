class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //return everything together that are made up of same core letters
        //use hashmap to track core letters?
        // 'nat' -> ['a','n','t']
        // 'tan' -> ['a','n','t']
        //^^ same, so put in one list...

        // 'ant'/ ['a','n','t'] -> List (tan, nat)
        Map <String , List<String>> anagramGroup = new HashMap<>();
        for(String word: strs){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String wordStr = new String(wordArr);
            List<String> group = anagramGroup.get(wordStr);
            if(group == null){
                group = new ArrayList<>();
            }
            group.add(word);
            anagramGroup.put(wordStr,group);
        }

        return new ArrayList<> (anagramGroup.values());
    }
}