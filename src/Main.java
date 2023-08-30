import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        double vat = 0.10;
        double seniorDiscount = 0.20;



        System.out.println ("How many apples? ");
        int apples = sc.nextInt();
        System.out.println ("How many grapes? ");
        int grapes = sc.nextInt();
        System.out.println ("How many oranges? ");
        int oranges = sc.nextInt();


        double unitApples = 30;
       double unitGrapes = 100;
       double unitOranges = 50;


        double totalApple = apples * unitApples;
        double totalGrapes = grapes * unitGrapes;
        double totalOranges = oranges * unitOranges;

        double totalpriceAll = totalApple + totalGrapes + totalOranges;



        System.out.println ("How much money would you pay?");
        double money = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        System.out.println ("Are you a senior citizen? YES or NO");
        String Citizen = sc.nextLine();

        if (Citizen.equalsIgnoreCase("yes")) {

            double discount = totalpriceAll * seniorDiscount; //senior discount

          double discountedTotal = totalpriceAll - discount;
          double vat1 = discountedTotal * vat;
          double totalAmountDue = discountedTotal + vat1;


            double changes = money - totalAmountDue;
            System.out.println (" ");
          System.out.println ("Total amount to pay is: "+totalAmountDue);
          System.out.println ("Change: "+changes);
          System.out.println ("Senior Citizen Discount: 20%");
          System.out.println ("VAT: 10%");



        } else if (Citizen.equalsIgnoreCase("no")){


            double vatvat = totalpriceAll * vat;
            double finalPrice = totalpriceAll + vatvat;
            double changes = money - finalPrice;
            System.out.println ("Total amount to pay is: "+finalPrice);
            System.out.println ("Change: "+changes);
            System.out.println ("VAT: 10%");





        }










    }



}