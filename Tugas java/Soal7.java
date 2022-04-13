import java.util.Scanner;

public class Soal7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,9};        
        System.out.println(duplicate(numbers));
    }
    
        public static boolean duplicate(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
}