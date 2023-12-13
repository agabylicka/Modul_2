
import java.util.Scanner;

public class Cw_7 {

    public void seven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Your number:");
        int input = Integer.parseInt(scanner.nextLine());
        ciag(input);
    }

    public static int ciag(int a) {
        if (a <= 0) {
            System.out.println("Please, give number > 0.");
            return 0;
        } else {
            int x = 0, y = 1;
            int resultOfSum;
            for (int i = 2; i <= a; i++) {
                resultOfSum = x + y;
                x = y;
                y = resultOfSum;
            }
            System.out.print(y);
            return y;
        }
    }
}
