class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for ( int ele : arr ) {
            set.add(ele);
        }

        for ( int ele : arr ) {
            if ( set.contains( ele + 1 ) ) {
                count++;
            }
        }
        return count;
    }
}
