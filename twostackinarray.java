import java.util.ArrayList;
import java.util.Arrays;

public class twostackinarray {

    ArrayList<Integer> list = new ArrayList<>();
    int top1;
    int top2;
    int size;

    public twostackinarray(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
        top1 = -1;
        top2 = size;

    }

    public void push1(int data) {
        if (top1 + 1 == top2) {
            System.out.println("stack overflow");
        } else {
            list.set(++top1, data);
        }
    }

    public void push2(int data) {
        if (top1 == top2 - 1) {
            System.out.println("stack overflow");
        } else {
            list.set(--top2, data);
        }
    }

    public int pop1() {
        if (top1 < 0) {
            System.out.println("stack underflow");
            return -1;
        } else {
            int value = list.get(top1);
            list.set(top1--, null);

            return value;
        }
    }

    public int pop2() {
        if (top2 == size) {
            System.out.println("stack underflow");
            return -1;
        } else {
            int value = list.get(top2);
            list.set(top1++, null);

            return value;
        }
    }

    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {

        twostackinarray stack = new twostackinarray(10);
        stack.push1(10);
        stack.push2(100);
        stack.push1(20);
        stack.push2(200);
        stack.push1(30);
        stack.push2(300);
        stack.push1(40);
        stack.push2(400);
        stack.display();
    }
}
