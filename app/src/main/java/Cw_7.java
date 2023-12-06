
import java.util.Scanner;


public class Cw_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
    }
    public static int ciag(int a){
        int x = 0, y = 1;
        int resultOfSum;
        for (int i = 2; i <= a; i++ ){
             resultOfSum = x + y;
             x = y;
             y = resultOfSum;
        }
        System.out.print(y);
        return y;
    }
}

//TODO coś mi się nie kompiluje- po kobinowaniu ze zmianą nawiasów też nie 