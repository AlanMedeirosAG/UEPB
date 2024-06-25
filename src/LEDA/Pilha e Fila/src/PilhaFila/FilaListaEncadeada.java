package PilhaFila;

public class FilaListaEncadeada {
    private No front;
    private No rear;

    public FilaListaEncadeada() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int item) {
        No newNode = new No(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public int size() {
        int count = 0;
        No current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
