class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() != 1) {
            q2.add(q1.remove());
        } 
        int result = q1.remove();
        while(q2.size() != 0) {
            q1.add(q2.remove());
        } 
        return result;
    }
    
    public int top() {
        while(q1.size() != 1) {
            q2.add(q1.remove());
        }
        int result = q1.remove();
        q2.add(result);
        while(q2.size() != 0) {
            q1.add(q2.remove());
        } 
        return result;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}