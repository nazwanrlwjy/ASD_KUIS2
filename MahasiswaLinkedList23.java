public class MahasiswaLinkedList23 {
    Node23 head;

    public MahasiswaLinkedList23() {
        head = null;
    }

    public void addMahasiswa(Mahasiswa23 mahasiswa) {
        Node23 newNode23 = new Node23(mahasiswa);
        if (head == null) {
            head = newNode23;
        } else {
            Node23 current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode23);
        }
    }

    public void deleteMahasiswa(String nim) {
        Node23 current = head;
        Node23 previous = null;
        while (current != null) {
            if (current.getMahasiswa().getNim().equals(nim)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public Mahasiswa23 getMahasiswa(String nim) {
        Node23 current = head;
        while (current != null) {
            if (current.getMahasiswa().getNim().equals(nim)) {
                return current.getMahasiswa();
            }
            current = current.getNext();
        }
        return null;
    }

    public void printAllMahasiswas() {
        Node23 current = head;
        while (current != null) {
            System.out.println("NIM: " + current.getMahasiswa().getNim() + ", Nama: " + current.getMahasiswa().getNama() + ", Tgl Lahir: " + current.getMahasiswa().getTglLahir());
            current = current.getNext();
        }
    }
}
