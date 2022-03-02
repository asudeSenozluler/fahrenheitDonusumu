import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double derece;

        System.out.println("Celcius değerini girin: ");
        derece=scanner.nextInt();
        double fahrenheit=((derece*9)/5)+32;
        System.out.println("Fahrenheit değeri: "+fahrenheit);
	// write your code here
    }
}
