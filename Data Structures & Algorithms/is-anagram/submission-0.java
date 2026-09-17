class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for ( Character ch : s.toCharArray() ) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for ( Character ch : t.toCharArray() ) {
            if ( !map.containsKey(ch) ) {
                return false;
            }
            else {
                if ( map.get(ch) > 1 ) {
                    map.put(ch, map.get(ch)-1);
                }
                else {
                    map.remove(ch);
                }
            }
        }

        return map.isEmpty() ? true : false;
    }
}
