import java.util.Scanner;
//Program ShipCostCalculator
//class ShipCostCalculator
    //main()
        //double itemPrice = 0.00
        //double SHIPPING_RATE = .02
        //double shippingCost = 0.00
        //double totalPrice = 0.00
        //output "Enter the item price: "
        //input itemPrice
        //if itemPrice >= 100.00 then
                //shippingCost = 0.00
                //totalPrice = itemPrice + shippingCost
                //output “Your shipping cost is “+shippingCost+”, bringing your total cost to “+totalPrice+”.”
            //else
                //shippingCost = itemPrice * SHIPPING_RATE
                //totalPrice = itemPrice + shippingCost
                //output “Your shipping cost is “+shippingCost+”, bringing your total cost to “+totalPrice+”.”
            //endif
    //return
//endClass
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.00;
        double SHIPPING_RATE = .02;
        double shippingCost = 0.00;
        double totalPrice = 0.00;
        String trash = "";

        System.out.print("Enter the item price: ");//remove the "ln" for prompts to keep the curser on the same line.
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();// this clears the stored value in buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid number not " + trash);
            System.out.println("Try again!");
            System.exit(0);
        }
        if (itemPrice >= 100.00)
        {
            shippingCost = 0.00;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is " + shippingCost + ", bringing your total cost to " + totalPrice + ".");
        } else
        {
            shippingCost = itemPrice * SHIPPING_RATE;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping cost is " + shippingCost + ", bringing your total cost to " + totalPrice + ".");
        }
    }
}