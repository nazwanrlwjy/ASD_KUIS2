import java.util.ArrayList;

public class MahasiswaCollection23 {
    ArrayList<Mahasiswa23> mahasiswas;

    public MahasiswaCollection23() {
        mahasiswas = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa23 mahasiswa) {
        mahasiswas.add(mahasiswa);
    }

    public void deleteMahasiswa(String nim) {
        mahasiswas.removeIf(mahasiswa -> mahasiswa.getNim().equals(nim));
    }

    public Mahasiswa23 getMahasiswa(String nim) {
        for (Mahasiswa23 mahasiswa : mahasiswas) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    public void printAllMahasiswas() {
        for (Mahasiswa23 mahasiswa : mahasiswas) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama() + ", Tgl Lahir: " + mahasiswa.getTglLahir());
        }
    }
}
