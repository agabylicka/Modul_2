import java.util.Scanner;

public class Cw_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++ ){
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
 
}
