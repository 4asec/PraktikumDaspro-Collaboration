import java.util.Scanner;

public class StudiKasus2_Collab {
    public static void main(String[] args) {
        Scanner Raffa = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jmlDokumen, peringkat, statusDana;

        System.out.print("Nama mahasiswa : ");
        nama = Raffa.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = Raffa.nextLine().trim();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen (0-4): ");
            jmlDokumen = Raffa.nextInt();

            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan): ");
                peringkat = Raffa.nextInt();

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (Juara " + peringkat + ").");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen (0-4): ");
            jmlDokumen = Raffa.nextInt();

            if (jmlDokumen < 4) {
                int kurang = 4 - jmlDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                statusDana = Raffa.nextInt();

                if (statusDana == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }
        Raffa.close();
    }
}