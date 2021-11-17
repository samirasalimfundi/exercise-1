import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //calculate the total amount of meal purchase at a restaurant
        System.out.println("Enter Charge of Food");
        double ChargeOfFood = input.nextDouble();
        double Tip = ChargeOfFood * 0.15;
        System.out.println("Tip is: " + Tip);
        double Tax = ChargeOfFood * 0.07;
        System.out.println("tax is: " + Tax);
        double total =  Tip + Tax;
        System.out.println("Total is amount of meal purchase at restaurant: " + total);
    }
}