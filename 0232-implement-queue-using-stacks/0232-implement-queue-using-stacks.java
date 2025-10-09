class MyQueue {

    private Stack<Integer> q1;
    private Stack<Integer> q2;

    public MyQueue() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        while(q1.size() != 1) {
            q2.push(q1.pop());
        }
        int result = q1.pop();
        while(q2.size() != 0) {
            q1.push(q2.pop());
        }
        return result;
    }
    
    public int peek() {
        while(q1.size() != 1) {
            q2.push(q1.pop());
        }
        int result = q1.pop();
        q1.push(result);
        while(q2.size() != 0) {
            q1.push(q2.pop());
        }
        return result;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}