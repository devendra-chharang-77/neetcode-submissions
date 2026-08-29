class MedianFinder {
    private PriorityQueue<Integer> left;  // max-heap, chote half
    private PriorityQueue<Integer> right; // min-heap, bade half
    
    public MedianFinder() {
        left = new PriorityQueue<>((a, b) -> b - a);  // max-heap
        right = new PriorityQueue<>();                 // min-heap (default)
    }
    
    public void addNum(int num) {
        left.add(num);
        
        // left ka max, right mein bhej do (safety check ke liye)
        right.add(left.poll());
        
        // agar right, left se bada ho gaya, ek wapas left mein bhej do
        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        } else {
            return (left.peek() + right.peek()) / 2.0;
        }
    }
}