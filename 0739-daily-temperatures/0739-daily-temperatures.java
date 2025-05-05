class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] arr = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i=len-1; i>=0; i--) {
            if(st.isEmpty()) {
                arr[i] = 0;
                st.push(i);
            } else {
                if(temperatures[i] < temperatures[st.peek()]) {
                    arr[i] = st.peek()-i;
                    st.push(i);
                } else {
                    while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                        st.pop();
                    }
                    if(st.isEmpty()) {
                        arr[i] = 0;
                    } else {
                        arr[i] = st.peek()-i;
                    } st.push(i);
                }
            }
        } return arr;
    }
}