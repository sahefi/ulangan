import java.util.Scanner;
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int angka;

        System.out.print("Masukan Bilangan = ");
        angka=input.nextInt();
        
        if (angka%2==0){
            System.out.println(angka+" adalah bilangan GENAP");
        }else {
             System.out.println(angka+" adalah bilangan GANJIL");
        }
    
    }
    
}