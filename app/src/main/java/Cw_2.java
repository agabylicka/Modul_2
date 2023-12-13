
import java.util.Scanner;


public class Cw_2 {
    public void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give second number:");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give third number:");
        int third = Integer.parseInt(scanner.nextLine());
        Cw_2 obiekt = new Cw_2();
        obiekt.checkWith0(first);
        obiekt.checkWith0(second);
        obiekt.checkWith0(third);
        //checkWith0(first);
        //checkWith0(second);
        //checkWith0(third);

        int srednia = avg(first, second, third);
        System.out.println(srednia);
    }

    private void checkWith0(int first) {
        if (first > 0) {
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    public static int avg(int a, int b, int c){
        return (a + b + c)/3;
    }    
    
}
