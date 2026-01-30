import java.util.*;

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return top;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
