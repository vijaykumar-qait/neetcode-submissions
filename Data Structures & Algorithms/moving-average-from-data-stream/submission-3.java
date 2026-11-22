class MovingAverage {
    int windowSum = 0;
    Queue<Integer> queue = new ArrayDeque<>();;
    int maxSize = 0;

    public MovingAverage(int size) {
        maxSize = size;
    }
    
    public double next(int val) {
        queue.add(val);
        windowSum += val;
        if (queue.size() > maxSize) {
            windowSum -= queue.poll();
        }

        return (windowSum*1.0)/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
