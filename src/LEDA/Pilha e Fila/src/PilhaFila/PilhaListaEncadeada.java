package PilhaFila;

public class PilhaListaEncadeada {
    private No top;

    public PilhaListaEncadeada() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        No current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void push(String item) {
        No newNode = new No(item);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String item = top.data2;
        top = top.next2;
        return item;
    }
}

