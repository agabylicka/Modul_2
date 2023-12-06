
import java.util.Scanner;


public class Cw_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
        
        int resultOfSum = factorion(input);
        System.out.println(resultOfSum);
    }
    public static int factorion(int a){
        int resultOfSum = 1;
        for (int i = 1; i <= a; i++ ){
             resultOfSum = resultOfSum * i;
        }
    
        return resultOfSum;
    
    }
}
