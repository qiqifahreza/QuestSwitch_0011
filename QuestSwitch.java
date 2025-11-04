
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
        
    }
}