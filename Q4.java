import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        double iterm1;
        double iterm2;
        double iterm3;
        double iterm4;
        double iterm5;

        Scanner input =new Scanner(System.in);
       // iterm1 
       System.out.print("Enter the price of iterm1 ");
       iterm1 = input.nextDouble();
       //iterm2
       System.out.print("Enter the price of iterm2 ");
       iterm2 = input.nextDouble();
       //iterm3
       System.out.print("Enter the price of iterm3 ");
       iterm3 = input.nextDouble();
       //iterm4
       System.out.print("Enter the price of iterm4 ");
       iterm4 = input.nextDouble();
       //iterm5
       System.out.print("ENTER THE price of iterm5 ");
       iterm5 = input.nextDouble();
       System.out.print("Calculate the subtotal of all iterms");
       double SubTotal = iterm1 + iterm2 + iterm3 + iterm4 + iterm5;
       double SalesTax = SubTotal * 0.06;
       double Total = SubTotal + SalesTax;

       System.out.println("subtotal is "+SubTotal);
       System.out.println("SalesTax "+SalesTax);
       System.out.println("Total "+Total);      
    }
}