import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        MahasiswaCollection23 mahasiswaCollection = new MahasiswaCollection23();
        MahasiswaLinkedList23 mahasiswaLinkedList = new MahasiswaLinkedList23();
        Scanner scanner = new Scanner(System.in);

        Mahasiswa23[] initialData = {
            new Mahasiswa23("234176001", "Aulia De Amalia", "2001-01-01"),
            new Mahasiswa23("234176002", "Shocyria Putra", "2002-02-02"),
            new Mahasiswa23("234176003", "Rayhananda Pranama", "2001-03-03"),
            new Mahasiswa23("234176004", "Indira Zurya Sitta", "2005-04-04")
        };

        for (Mahasiswa23 mhs : initialData) {
            mahasiswaCollection.addMahasiswa(mhs);
            mahasiswaLinkedList.addMahasiswa(mhs);
        }

        while (true) {
            System.out.println("===============================================");
            System.out.println("                    Menu:");
            System.out.println("===============================================");
            System.out.println("1. Tambah Mahasiswa ke Collection");
            System.out.println("2. Hapus Mahasiswa dari Collection");
            System.out.println("3. Cari Mahasiswa di Collection");
            System.out.println("4. Cetak Semua Mahasiswa di Collection");
            System.out.println("5. Tambah Mahasiswa ke LinkedList");
            System.out.println("6. Hapus Mahasiswa dari LinkedList");
            System.out.println("7. Cari Mahasiswa di LinkedList");
            System.out.println("8. Cetak Semua Mahasiswa di LinkedList");
            System.out.println("9. Keluar");
            System.out.println("===============================================");
            System.out.print("Pilih opsi: ");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("===============================================");
                    System.out.println("Tambah Mahasiswa ke Collection");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM: ");
                    String nim1 = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama1 = scanner.nextLine();
                    System.out.print("Masukkan Tgl Lahir (yyyy-mm-dd): ");
                    String tglLahir1 = scanner.nextLine();
                    mahasiswaCollection.addMahasiswa(new Mahasiswa23(nim1, nama1, tglLahir1));
                    System.out.println("Mahasiswa berhasil ditambahkan ke Collection.");
                    break;
                case 2:
                    System.out.println("===============================================");
                    System.out.println("Hapus Mahasiswa dari Collection");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM untuk dihapus: ");
                    String deleteNim1 = scanner.nextLine();
                    mahasiswaCollection.deleteMahasiswa(deleteNim1);
                    System.out.println("Mahasiswa berhasil dihapus dari Collection.");
                    break;
                case 3:
                    System.out.println("===============================================");
                    System.out.println("Cari Mahasiswa di Collection");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM untuk dicari: ");
                    String getNim1 = scanner.nextLine();
                    Mahasiswa23 mhs1 = mahasiswaCollection.getMahasiswa(getNim1);
                    if (mhs1 != null) {
                        System.out.println("Detail Mahasiswa:");
                        printMahasiswa(mhs1);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan di Collection.");
                    }
                    break;
                case 4:
                    System.out.println("===============================================");
                    System.out.println("Cetak Semua Mahasiswa di Collection");
                    System.out.println("===============================================");
                    System.out.println("Daftar Mahasiswa di Collection:");
                    System.out.println("===============================================");
                    mahasiswaCollection.printAllMahasiswas();
                    break;
                case 5:
                    System.out.println("===============================================");
                    System.out.println("Tambah Mahasiswa ke LinkedList");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM: ");
                    String nim2 = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama2 = scanner.nextLine();
                    System.out.print("Masukkan Tgl Lahir (yyyy-mm-dd): ");
                    String tglLahir2 = scanner.nextLine();
                    mahasiswaLinkedList.addMahasiswa(new Mahasiswa23(nim2, nama2, tglLahir2));
                    System.out.println("Mahasiswa berhasil ditambahkan ke LinkedList.");
                    break;
                case 6:
                    System.out.println("===============================================");
                    System.out.println("Hapus Mahasiswa dari LinkedList");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM untuk dihapus: ");
                    String deleteNim2 = scanner.nextLine();
                    mahasiswaLinkedList.deleteMahasiswa(deleteNim2);
                    System.out.println("Mahasiswa berhasil dihapus dari LinkedList.");
                    break;
                case 7:
                    System.out.println("===============================================");
                    System.out.println("Cari Mahasiswa di LinkedList");
                    System.out.println("===============================================");
                    System.out.print("Masukkan NIM untuk dicari: ");
                    String getNim2 = scanner.nextLine();
                    Mahasiswa23 mhs2 = mahasiswaLinkedList.getMahasiswa(getNim2);
                    if (mhs2 != null) {
                        System.out.println("Detail Mahasiswa:");
                        printMahasiswa(mhs2);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan di LinkedList.");
                    }
                    break;
                case 8:
                    System.out.println("===============================================");
                    System.out.println("Cetak Semua Mahasiswa di LinkedList");
                    System.out.println("===============================================");
                    System.out.println("Daftar Mahasiswa di LinkedList:");
                    System.out.println("===============================================");
                    mahasiswaLinkedList.printAllMahasiswas();
                    break;
                case 9:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void printMahasiswa(Mahasiswa23 mahasiswa) {
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Tgl Lahir: " + mahasiswa.getTglLahir());
        System.out.println("===============================================");
    }
}
