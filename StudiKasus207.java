import java.util.Scanner;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahDokumen, peringkatJuara;
        String nama, jenisKegiatan;
        int statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            if (jumlahDokumen < 4) {
                System.out.println("Jumlah dokumen kurang, Dana penghargaan tidak diberikan");
                return;
            }
            System.out.print("Peringkat juara (1/2/3/0): ");
            peringkatJuara = sc.nextInt();
            if (peringkatJuara > 3 || peringkatJuara == 0) {
                System.out.println("Bukan juara, Dana penghargaan tidak diberikan");
                return;
            }
            System.out.println("Dana penghargaan diberikan");

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            if (jumlahDokumen < 4) {
                System.out.println("Jumlah dokumen kurang, Dana penghargaan tidak diberikan");
                return;
            }
            System.out.print("Status pendanaan PKM (1/0): ");
            statusPendanaan = sc.nextInt();
            if (statusPendanaan == 0) {
                System.out.println("Status pendanaan tidak lolos, Dana penghargaan tidak diberikan");
                return;
            }
            System.out.println("Dana penghargaan diberikan");

        } else {
            System.out.println("Kegiatan lainnya tidak mendapat dana penghargaan");

        }


    }
}
