import java.util.Scanner;

public class ShipCost
{
    public static void main(String[] args)
    {
        double itemPrice;
        double shipCost;
        double totalCost;

        Scanner in = new Scanner (System.in);
        IO.print("Enter your item price: $");
        itemPrice = in.nextDouble();

        shipCost = itemPrice * .02;

        if (itemPrice < 100){
            totalCost = shipCost + itemPrice;
            IO.println("Your item is less than $100. Your shipping cost is $" + shipCost);
            IO.println("Your total cost is $" + totalCost);
        }
        else{
            totalCost = itemPrice;
            IO.println("Your item price of $" + itemPrice + " was greater than $100, so no shipping cost is added.");
            IO.println("Your total cost is $" + totalCost);
        }
    }
}
