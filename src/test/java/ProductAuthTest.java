import net.dnaware.ProductAuth;
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
        ProductAuth userinput = new ProductAuth ();
    }

    @Test
    public void ClassShouldHaveConstructor ()
    {
        ProductAuth userInput = new ProductAuth("A4", 50);
    }

    @Test
    public void ShouldRunTest ()
    {
        ProductAuth userinput = new ProductAuth("A4", 50);

        userinput.authPurchase();
    }

    @Test
    public void ShouldReturnFalseValue()
    {
        ProductAuth userInput = new ProductAuth("A3", 49);

        boolean expectedResult = false;
        boolean actualResult = userInput.authPurchase();

        Assert.assertEquals("Result should of returned false", expectedResult, actualResult);
    }

    @Test
    public void ShouldReturnTrueValue()
    {
        ProductAuth userInput = new ProductAuth("A4", 50);

        boolean expectedResult = true;
        boolean actualResult = userInput.authPurchase();

        Assert.assertEquals("Result should of returned true", expectedResult, actualResult);
    }

}
