import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest extends TestCase {

    @Test
    public void testAddMoreQuantityThanTheWithdrawnQuantity() {
        double expectedValue = 400;
        Account accountTest = new Account("Test 1");
        accountTest.addQuantity(500);
        accountTest.withdrawQuantity(100);
        Assertions.assertEquals((long) expectedValue, (long) accountTest.getQuantity());
    }

    @Test
    public void testWithdrawMoreQuantityThanTheAddedQuantity() {
        Account accountTest = new Account("Test 2");
        accountTest.addQuantity(100);
        accountTest.withdrawQuantity(200);
        Assertions.assertEquals(0, (long) accountTest.getQuantity());
    }

    @Test
    public void testAddNegativeQuantityAndExpectedZero() {
        Account accountTest = new Account("Test 3");
        accountTest.addQuantity(-100);
        Assertions.assertEquals(0, (long) accountTest.getQuantity());
    }

    @Test
    public void testValidateAbilityToAddQuantityAtCreationOfAccount() {
        long addedQuantity = 500;
        Account accountTest = new Account("Test 4",addedQuantity);
        Assertions.assertEquals(addedQuantity, (long) accountTest.getQuantity());
    }

    @Test
    public void testAddingDirectlyFromPublicVariables() {
        Account accountTest = new Account("Test 5");
        accountTest.quantity = 500;
        accountTest.withdrawQuantity(100);
        Assertions.assertEquals(400 , (long) accountTest.getQuantity());
    }

    @Test
    public void testWithDrawQuantityWithoutAdding() {
        Account accountTest = new Account("Test 6");
        accountTest.withdrawQuantity(100);
        Assertions.assertEquals(0 , (long) accountTest.getQuantity());
    }

    @Test
    public void testWithDrawNegativeQuantity() {
        Account accountTest = new Account("Test 7");
        accountTest.withdrawQuantity(-100);
        Assertions.assertEquals(0 , (long) accountTest.getQuantity());
    }

}