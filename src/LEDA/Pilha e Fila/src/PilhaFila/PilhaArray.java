package PilhaFila;

public class PilhaArray {
    private int[] array;
    private int top;
    private int capacity;

    public PilhaArray(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int item) {
        if (isFull()) {
            return;
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return array[top--];
    }

    public int size() {
        return top + 1;
    }

    public int intValue() {
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += array[i];
        }
        return sum;
    }
}
