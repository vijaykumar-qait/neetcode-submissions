class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if ( sentence1.length != sentence2.length ) {
            return false;
        }

         Map<String, Set<String>> map = new HashMap<>();

        // Build bidirectional similarity map
        for (List<String> pair : similarPairs) {
            String word1 = pair.get(0);
            String word2 = pair.get(1);

            map.computeIfAbsent(word1, k -> new HashSet<>()).add(word2);
            map.computeIfAbsent(word2, k -> new HashSet<>()).add(word1);
        }

        // Check each word
        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            if (word1.equals(word2)) {
                continue;
            }

            if (!map.getOrDefault(word1, Collections.emptySet()).contains(word2)) {
                return false;
            }
        }

        return true;
    }
}
