class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapAna = new HashMap<>();
        for(String n: strs){
            char[] srtd = n.toCharArray();
            Arrays.sort(srtd);
            String srtdS = new String(srtd);
            System.out.println(n + " " + srtdS);
            List<String> p = mapAna.get(srtdS);
            if (p == null){
                p = new ArrayList<>();
            }
            p.add(n);
            mapAna.put(srtdS,p);
        }
        return new ArrayList<>(mapAna.values());
    }
}