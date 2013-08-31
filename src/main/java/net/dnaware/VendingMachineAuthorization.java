package net.dnaware;

/**
 * User: Dave
 * Date: 23/08/13
 * Time: 03:02
 * Project: VendingMachine
 */
public class VendingMachineAuthorization {

    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Usage: :Product: :Change:\nPlease try again.");
            System.exit(1);
        }

        ProductAuthorization input = new ProductAuthorization(args[0], Integer.parseInt(args[1]));
        String outputMessage = (input.authPurchase()) ? "Purchase Authorised." : "Purchase NOT Authorised.";

        System.out.println(outputMessage);

        System.exit(0);
    }
}
