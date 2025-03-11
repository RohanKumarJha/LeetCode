import java.util.Stack;

class MinStack {
    private Stack<Integer> st;       // Main stack to store elements
    private Stack<Integer> minStack; // Auxiliary stack to track minimum values

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        // Push to minStack if it's empty or the current value is less than or equal to the top of minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        int removed = st.pop();
        // If the popped value is the current minimum, remove it from minStack too
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        if (st.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return st.peek();
    }
    
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */