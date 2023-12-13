
import java.util.Scanner;


public class Cw_3 {
    public void three(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give third number:");
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println("Give fourth number:");
        int fourth = Integer.parseInt(scanner.nextLine());
        System.out.println("Give fifth number:");
        int fifth = Integer.parseInt(scanner.nextLine());
        
        if ((first < second) && (first < third) && (first < fourth) && (first < fifth)) {
            System.out.println(first);
        }else if((second < first) && (second < third) && (second < fourth) && (second < fifth)) {
            System.out.println(second);
        }else if((third < first) && (third < second) && (third < fourth) && (third < fifth)) {
            System.out.println(third);
        }else if((fourth < first) && (fourth < third) && (fourth < second) && (fourth < fifth)) {
            System.out.println(second);
        }else {
            System.out.println(fifth);
        }
    }
}
