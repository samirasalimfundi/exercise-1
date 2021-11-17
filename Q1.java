import java.util.Scanner;
  class Q1{
      public static void main(String [] args){
          Scanner keyboard = new Scanner(System.in);
            //NAME
             System.out.println("Enter your name");
              String name = keyboard.nextLine();

               //AGE
               System.out.println("Enter your age");
                int age = keyboard.nextInt();

                  //ADDRESS
                    System.out.println("Enter your ADDRESS");
                     String address = keyboard.nextLine();
                     
                     //PhoneNumber
                     System.out.println("Enter phoneNumber");
                     int PhoneNumber = keyboard.nextInt();

                 System.out.print("your name is " + name );
                 System.out.print(" who lived in " + address) ;
                 System.out.print(".At the age of " + age);
                 System.out.print("your phoneNumber "+PhoneNumber);

         }



  }