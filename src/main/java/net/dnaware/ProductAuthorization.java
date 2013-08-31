package net.dnaware;

/**
 * User: Dave
 * Date: 23/08/13
 * Time: 02:16
 * Project: VendingMachine
 */
public class ProductAuthorization {

    private String selectedProduct;
    private int changeEntered;

    public ProductAuthorization(String productChoice, int change) {
        this.selectedProduct = productChoice;
        this.changeEntered = change;
    }

    public ProductAuthorization() {
        this.selectedProduct = "";
        this.changeEntered = 0;
    }

    public boolean authPurchase() {

        if (selectedProduct.equals("") || changeEntered == 0 || selectedProduct.length() < 2)
            return false;

        if (this.testRow() && this.testCol())
            return this.testMoney();

        return false;

    }

    private boolean testMoney() {
        return changeEntered >= 50;

    }

    private boolean testCol() {
        char col = Character.toLowerCase(selectedProduct.charAt(1));

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
        char row = Character.toLowerCase(selectedProduct.charAt(0));

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
