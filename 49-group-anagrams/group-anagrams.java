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
            System.out.println("1" + wordArr);
            String wordStr = new String(wordArr);
            System.out.println("2" + wordStr);
            List<String> group = anagramGroup.get(wordStr);
            if(group == null){
                group = new ArrayList<>();
            }
            group.add(word);
            anagramGroup.put(wordStr,group);
        }
        List<List<String>> out = new ArrayList<>();
        for(String anList : anagramGroup.keySet()){
            out.add(anagramGroup.get(anList));
        }

        return out;
    }
}