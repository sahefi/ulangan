import java.util.Scanner;

public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int angka1, angka2, maks;
        
        System.out.print("Masukan Bilangan = ");
        angka1=input.nextInt();
        
        System.out.print("Masukan Bilangan = ");
        angka2=input.nextInt();
        
  
        
        if (angka1>angka2) {
            maks = angka1;
        } 
        else {
            maks = angka2;
        }
        
        System.out.println("Angka yang lebih besar = "+maks);
    }
}