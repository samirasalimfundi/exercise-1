import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        double profit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter total amount of sales: ");
        double TotalSales = keyboard.nextDouble();
        profit = TotalSales* 0.23;
        System.out.println("Profit is: " + profit);

    }
}