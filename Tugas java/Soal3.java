import java.util.Scanner;
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
System.out.print("masukkan bilangan N : ");

int N = input.nextInt();
int hasil = 0;

for (int i=1; i<=N; i++) {
    
   if(i==N) {
       System.out.println(i+ "");
   }else{
        System.out.print(i+ "+");
   }


    
hasil += i;
    }

System.out.println("penjumlahan dari angka 1 sampai "+ N +" = " + hasil);
    }
}