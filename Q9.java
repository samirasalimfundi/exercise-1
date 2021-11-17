import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        //Temperature
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Temperature in Calcius ");
        double Calcius = keyboard.nextDouble();
        double F = (9/5) * Calcius+32;
        System.out.println("Temperature in Fahrenheit is "+F);
    }
}