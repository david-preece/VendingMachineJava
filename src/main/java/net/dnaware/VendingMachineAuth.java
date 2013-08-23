package net.dnaware;

/**
 * User: Dave
 * Date: 23/08/13
 * Time: 03:02
 * Project: VendingMachine
 */
public class VendingMachineAuth {

    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            System.out.println("Usage: :Product: :Change:\nPlease try again.");
            System.exit(1);
        }

        ProductAuth input = new ProductAuth(args[0], Integer.parseInt(args[1]));
        if (input.authPurchase())
            System.out.println("Purchase Authorised.");
        else
            System.out.println("Purchase NOT Authorised.");

        System.exit(0);
    }
}
