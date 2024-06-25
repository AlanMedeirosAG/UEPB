package PilhaFila;
public class No {
    int data;
    String data2;
    No next;

    No next2;

    public No(int data) {
        this.data = data;
        this.next = null;

    }

    public No(String data2) {
        this.data2 = data2;
        this.next2 = null;
    }
}
