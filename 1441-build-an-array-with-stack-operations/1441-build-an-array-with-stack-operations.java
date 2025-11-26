class Solution {
    public List<String> buildArray(int[] target, int n) {
        int pointer = 0;
        Stack<Integer> st = new Stack<>();
        int num = 1;

        List<String> list = new ArrayList<>();
        while(pointer<target.length && num<=n) {
            st.push(num);
            num++;
            list.add("Push");
            int val = st.peek();
            if(val == target[pointer]) {
                pointer++;
            } else {
                st.pop();
                list.add("Pop");
            }
        }

        return list;
    }
}