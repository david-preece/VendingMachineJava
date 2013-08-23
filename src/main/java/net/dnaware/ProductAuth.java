package net.dnaware;

/**
 * User: Dave
 * Date: 23/08/13
 * Time: 02:16
 * Project: VendingMachine
 */
public class ProductAuth {

    private String product;
    private int money;

    public ProductAuth(String productchoice, int change) {
        this.product = productchoice;
        this.money = change;
    }

    public ProductAuth() {
        this.product = "";
        this.money = 0;
    }

    public boolean authPurchase() {

        if (product.equals("") || money == 0 || product.length() < 2)
            return false;

        if (this.testRow() && this.testCol())
            return this.testMoney();

        return false;

    }

    private boolean testMoney() {
        if (money < 50)
            return false;

        return true;
    }

    private boolean testCol() {
        char col = Character.toLowerCase(product.charAt(1));

        switch(col)
        {
            case '1':
            case '2':
            case '3':
            case '4':
                return true;
        }

        return false;
    }

    private boolean testRow() {
        char row = Character.toLowerCase(product.charAt(0));

        switch (row)
        {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
                return true;
        }

        return false;
    }
}
