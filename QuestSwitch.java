
import java.util.Scanner;

public class QuestSwitch {
    public static void main(String[] args) {

        Scanner nScan = new Scanner(System.in);
            int sData;
            int pbObjek;
            int bData;
            int algodPem;
            int rpLunak;
            int pilihan;
            int nPilihan = 0;
            double tNilai;
            double rRata;
            double rRIPK;
            String predikat, mk1, mk2, mk3, mk4, mk5, matKul = null;

        System.out.println("masukkan nilai struktur data:");
            sData = nScan.nextInt();

            System.out.println("masukkan nilai pemrograman objek:");
            pbObjek = nScan.nextInt();

            System.out.println("masukkan nilai basis data:");
            bData = nScan.nextInt();

            System.out.println("masukkan nilai algoritma dan pemrograman:");
            algodPem = nScan.nextInt();

            System.out.println("masukkan nilai rekayasa perangkat lunak:");
            rpLunak = nScan.nextInt();

            tNilai = sData + pbObjek + bData + algodPem + rpLunak;
            rRata = tNilai / 5.0;
            rRIPK = rRata / 100 * 4;
            System.out.println("total nilai adalah: " + tNilai);

             if (rRIPK >= 3.75) {
                predikat = "A (Sangat Baik)";
            } 
            else if (rRIPK >= 3.50) {
                predikat = "AB (Baik Sekali)";
            } 
            else if (rRIPK >= 3.00) {
                predikat = "B (Baik)";
            } 
            else if (rRIPK >= 2.50) {
                predikat = "BC (Cukup)";
            } 
            else {
                predikat = "C (Kurang)";
            }

            System.out.println("predikat nilai adalah: " + predikat);
            System.out.println("rata-rata IPK nilai adalah: " + rRIPK);
            if (predikat.equals("A (Sangat Baik)") || predikat.equals("AB (Baik Sekali)")) {
                System.out.println("Anda memenuhi syarat untuk mendaftar sebagai Asisten Dosen.");
                System.out.println("Pilih mata kuliah yang ingin diajukan sebagai Asisten Dosen:");
                System.out.println("\n 1. Struktur Data \n 2. Pemrograman  Berorientasi Objek \n 3. Basis Data \n 4. Algoritma dan Pemrograman \n 5. Rekayasa Perangkat Lunak" );
                mk1 = "Struktur Data";
                mk2 = "Pemrograman  Berorientasi Objek";
                mk3 = "Basis Data";
                mk4 = "Algoritma dan Pemrograman";
                mk5 = "Rekayasa Perangkat Lunak";
                
                pilihan = nScan.nextInt();
                switch (pilihan) {
                    case 1:
                        nPilihan = sData;
                        matKul = mk1;
                        break;
                    case 2:
                        nPilihan = pbObjek;
                        matKul = mk2;
                        break;
                    case 3:
                        nPilihan = bData;
                        matKul = mk3;
                        break;
                    case 4:
                        nPilihan = algodPem;
                        matKul = mk4;
                        break;
                    case 5:
                        nPilihan = rpLunak;
                        matKul = mk5;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        System.exit(0);
                }
        
        }
    }
}