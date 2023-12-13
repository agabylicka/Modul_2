import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Cw_2 srednia = new Cw_2();
        srednia.average();
        
        Cw_3 obiekt = new Cw_3();
        obiekt.three();
        
        Cw_4 trojkat = new Cw_4();
        trojkat.four();
        
        Cw_5 cwiczenie = new Cw_5();
        cwiczenie.five();
        
        Cw_6 suma = new Cw_6();
        suma.count();
        
        Cw_7 fibonacci = new Cw_7();
        fibonacci.seven();
        
        Cw_8 liczenie = new Cw_8();
        liczenie.factorion();
        
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
