package PilhaFila;

public class FilaArray {
    private String[] array;
    private int front;
    private int rear;
    private int capacity;

    public FilaArray(int size) {
        capacity = size;
        array = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(String item) {
        if (isFull()) {
            return;
        }
        array[++rear] = item;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        return array[front++];
    }

    public int size() {
        return rear - front + 1;
    }
}
