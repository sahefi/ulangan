import java.util.Scanner;

public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int maks, jumlah, i = 1, array[];
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan = ");
        jumlah = scan.nextInt();

        array = new int[jumlah];
        System.out.println("Terdapat " + jumlah + " bilangan, yaitu :");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        maks = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
        }
        System.out.println("Nilai makasimumnya  " + maks);
    }
}