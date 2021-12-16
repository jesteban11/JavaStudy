public class AccountMain {
    public static void main(String[] args) {
        Account accountTest = new Account("Juanes",-500);
        accountTest.addQuantity(400);
        accountTest.withdrawQuantity(500);
        System.out.println(accountTest.getQuantity());


    }

}
