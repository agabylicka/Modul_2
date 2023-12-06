import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String input = scanner.nextLine();
        Integer number = Integer.parseInt(input);
        if (number > 0) {
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        
    }
}
