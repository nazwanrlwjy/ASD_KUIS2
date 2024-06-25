public class Node23 {
    Mahasiswa23 mahasiswa;
    Node23 next;

    public Node23(Mahasiswa23 mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.next = null;
    }

    public Mahasiswa23 getMahasiswa() {
        return mahasiswa;
    }

    public Node23 getNext() {
        return next;
    }

    public void setNext(Node23 next) {
        this.next = next;
    }
}
