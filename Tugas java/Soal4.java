import java.util.Scanner;

public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
       System.out.print("masukkan bilangan N : ");

       int N = input.nextInt();
       int [] hasil=new int[N];
       
       for (int i=0; i<hasil.length; i++) {
            System.out.print("Angka ke-" + (i+1) + " = ");
            hasil [i] = input.nextInt();


        if (hasil[i]%2==0){
                System.out.println(" adalah bilangan GENAP");
            }else {
                System.out.println(" adalah bilangan GANJIL");
            }
        }
    }
}