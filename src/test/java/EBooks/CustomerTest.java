package EBooks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void TestCustomerCounter(){

        for(int i = 0; i < 20; i++){
            Customer customer = new Customer();
        }

        Assertions.assertEquals(20, Customer.customerCount);

    }

    @Test
    public void testCustomerConstructor(){

        // default values
        String defUserName = "User";
        String defEmail = "";
        // Default Credit Number will be Null, method will return false
        // Default Subscription Status will be False

        Customer c1 = new Customer();

        Assertions.assertEquals(defUserName, c1.getUserName());
        Assertions.assertEquals(defEmail, c1.getEmail());
        Assertions.assertFalse(c1.methodOfPayVerify());
        Assertions.assertFalse(c1.getSubscriptionStatus());

        // Second Constructor receiving 2 values
        Customer c2 = new Customer("Bo Bichette", "bluejays@mlb.com");

        Assertions.assertEquals("Bo Bichette", c2.getUserName());
        Assertions.assertEquals("bluejays@mlb.com", c2.getEmail());

    }

    @Test
    public void TestCustomerSetters(){

        Customer c3 = new Customer();

        c3.setEmail("email@hotmail.com");

        Assertions.assertEquals("email@hotmail.com", c3.getEmail());

        c3.setUserName("Chappie");

        Assertions.assertEquals("Chappie", c3.getUserName());

    }

    @Test
    public void TestSubscribe(){

        Customer c4 = new Customer();

        c4.subscribe("1234123412341234");

        Assertions.assertTrue(c4.methodOfPayVerify());
        Assertions.assertTrue(c4.getSubscriptionStatus());

        c4.unSubscribe();

        Assertions.assertFalse(c4.methodOfPayVerify());
        Assertions.assertFalse(c4.getSubscriptionStatus());


    }
}
