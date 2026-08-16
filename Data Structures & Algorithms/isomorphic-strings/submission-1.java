class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for ( int i=0; i<s.length(); i++ ) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if ( (sMap.containsKey(sCh) && sMap.get(sCh) != tCh) || 
            (tMap.containsKey(tCh) && tMap.get(tCh) != sCh) ) {
                return false;
            }

            sMap.put(sCh, tCh);
            tMap.put(tCh, sCh);
        }
        return true;
    }
}