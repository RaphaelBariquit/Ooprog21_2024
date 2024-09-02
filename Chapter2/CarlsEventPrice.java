import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("* Carly's makes the food that makes it a party *");
         System.out.println("*               it a party.                    *");
        System.out.println("*************************************************");

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests attending the event: ");
        int numGuests = scanner.nextInt();

    
        final int PRICE_PER_GUEST = 35;
        int totalPrice = PRICE_PER_GUEST * numGuests;

      
        System.out.println("Number of Guests: " + numGuests);
        System.out.println("Price per Guest: $" + PRICE_PER_GUEST);
        System.out.println("Total Price: $" + totalPrice);

        boolean isLargeEvent = numGuests >= 50;
        System.out.println("Is it a large event? " + isLargeEvent);
    }
}
