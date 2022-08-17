public class SavingAccountImpl {

    public static void main(String[] args) {
        SavingAccount object = new SavingAccount();
        object.setAccountNo(1234567L);
        object.setName("Ajay");
        object.setStatus("Active");
        object.setBalance(1000);
        object.setTotalBalance(object.getBalance());
        object.setInternetAndMobileBanking("Enabled");
        object.setInterestRate(8);
        object.setModeOfOperator("Self");

        object.accountBalance();
        System.out.println("Balance = " + object.accountBalance());
        object.debit(1000, 200);
        System.out.println("your balance amount is = " + object.getBalance());
        System.out.println("your available balance is = " + object.debit(object.accountBalance(), 200));
        System.out.println("your updated balance is = " + object.credit(object.accountBalance(), 200));
    }
}
