import java.util.Scanner;

class ShopItems {
    int totalCount;
    int iceCreamCount;
    int shakeCount;
    int smoothieCount;
    int slushieCount;
}

public class IceCreamShop {

    public static void main(String[] args) {
        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName = null;

        ShopItems shopItems = new ShopItems();

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order. For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4. If you are done ordering type 0.");

        while (orderType != 0) {
            orderType = input.nextInt();

            switch (orderType) {
                case 1:
                    itemName = "ice cream";
                    shopItems.iceCreamCount += itemCount;
                    break;
                case 2:
                    itemName = "shake";
                    shopItems.shakeCount += itemCount;
                    break;
                case 3:
                    itemName = "smoothie";
                    shopItems.smoothieCount += itemCount;
                    break;
                case 4:
                    itemName = "slushie";
                    shopItems.slushieCount += itemCount;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid order type. Please enter a valid order type.");
                    continue;
            }

            System.out.println("How many items of " + itemName + " would you like to order?");
            itemCount = input.nextInt();

            System.out.println("Adding " + itemCount + " of the item " + itemName + " to your order!");

            System.out.println("Type a number for the next item in your order:\n1: Ice cream\n2: Shake\n3: Smoothie\n4: Slushie\n");
        }

        System.out.println("Your order summary:");
        System.out.println("Ice cream: " + shopItems.iceCreamCount);
        System.out.println("Shake: " + shopItems.shakeCount);
        System.out.println("Smoothie: " + shopItems.smoothieCount);
        System.out.println("Slushie: " + shopItems.slushieCount);

        input.close();
    }
}
