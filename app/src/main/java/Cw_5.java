
import java.util.Scanner;


public class Cw_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= input; i++ ){
            System.out.print(i);
        }
    }
}
