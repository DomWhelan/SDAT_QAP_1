package EBooks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testCustomerConstructor(){

        // default values
        String defUserName = "User";
        String defEmail = "";
        // Default Credit Number should be Null
        // Default Subscription Status should be False

        Assertions.assertEquals(0, Customer.customerCount);

        // Customer Count will auto increment on construction of Customer
        Customer c1 = new Customer();

        Assertions.assertEquals(defUserName, c1.getUserName());
        Assertions.assertEquals(defEmail, c1.getEmail());
        Assertions.assertFalse(c1.getSubscriptionStatus());
        Assertions.assertEquals(1, Customer.customerCount);

        Customer c2 = new Customer("Bo Bichette", "bluejays@mlb.com");

        Assertions.assertEquals("Bo Bichette", c2.getUserName());
        Assertions.assertEquals("bluejays@mlb.com", c2.getEmail());
        Assertions.assertEquals(2, Customer.customerCount);

    }

    @Test
    public void TestCustomerSetters(){

    }
}
