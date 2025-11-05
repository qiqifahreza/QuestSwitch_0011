
import java.util.Scanner;

public class QuestSwitch {
    public static void main(String[] args) {

        Scanner nScan = new Scanner(System.in);
            int sData;
            int pbObjek;
            int bData;
            int algodPem;
            int rpLunak;
            double tNilai;
            double rRata;
            double rRIPK;
            String predikat;

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
        
    }
}