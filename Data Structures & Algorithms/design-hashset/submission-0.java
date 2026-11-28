class MyHashSet {

    LinkedList<Integer> set;

    public MyHashSet() {
        set = new LinkedList<>();
    }
    
    public void add(int key) {
        if (!contains(key)) {
            set.add(key);
        }
    }
    
    public void remove(int key) {
       set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for ( int i=0; i<set.size(); i++ ) {
            if ( set.get(i).intValue() == key ) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */