import net.dnaware.ProductAuthorization;
import org.junit.Assert;
import org.junit.Test;

/**
 * User: Dave
 * Date: 23/08/13
 * Time: 02:05
 * Project: VendingMachine
 */
public class ProductAuthTest {

    @Test
    public void ClassShouldExist ()
    {
        ProductAuthorization userInput = new ProductAuthorization();
    }

    @Test
    public void ClassShouldHaveConstructor ()
    {
        ProductAuthorization userInput = new ProductAuthorization("A4", 50);
    }

    @Test
    public void ShouldRunAuthorization ()
    {
        ProductAuthorization userInput = new ProductAuthorization("A4", 50);

        userInput.authPurchase();
    }

    @Test
    public void ShouldReturnFalseValue()
    {
        ProductAuthorization userInput = new ProductAuthorization("A3", 49);

        boolean expectedResult = false;
        boolean actualResult = userInput.authPurchase();

        Assert.assertEquals("Result should of returned false", expectedResult, actualResult);
    }

    @Test
    public void ShouldReturnTrueValue()
    {
        ProductAuthorization userInput = new ProductAuthorization("A4", 50);

        boolean expectedResult = true;
        boolean actualResult = userInput.authPurchase();

        Assert.assertEquals("Result should of returned true", expectedResult, actualResult);
    }

}
