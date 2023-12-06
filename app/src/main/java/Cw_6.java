
import java.util.Scanner;


public class Cw_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= input; i++ ){
            System.out.print(i);
        }
        
        int resultOfSum = sum(input);
        System.out.println(resultOfSum);
    }
    public static int sum(int a){
        int resultOfSum = 0;
        for (int i = 0; i <= a; i++ ){
             resultOfSum = resultOfSum + i;
        }
    
        System.out.print(resultOfSum);
        return resultOfSum;
    
    }
}
