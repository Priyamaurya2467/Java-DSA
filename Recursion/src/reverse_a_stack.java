import java.util.Stack;

public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);

        st.push(7);
        st.push(6);
        reverse(st);
        System.out.println(st);

    }
    public static void reverse(Stack<Integer> st) {
        if (st.empty()) {
            return ;
        }
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);

    }
    public static void insertAtBottom(Stack<Integer> st,int top) {
        if (st.empty()) {
            st.push(top);
            return;
        }
        int x= st.pop();
        insertAtBottom(st,xhow );
        st.push(top);
    }
}
