public class SavingAccount {

    private String name;
    private long accountNo;
    private String accountOpeningDate;
    private String status;
    private double balance;
    private double totalBalance;
    private String internetAndMobileBanking;
    private float interestRate;
    private String modeOfOperator;

    SavingAccount() {
        accountNo = 0;
        name = "";
        accountNo = 0;
        status = "";
        balance = 0;
        internetAndMobileBanking = "";
        interestRate = 0;
        modeOfOperator = "";
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {

        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getInternetAndMobileBanking() {
        return internetAndMobileBanking;
    }

    public void setInternetAndMobileBanking(String internetAndMobileBanking) {
        this.internetAndMobileBanking = internetAndMobileBanking;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfOperator() {
        return modeOfOperator;
    }

    public void setModeOfOperator(String modeOfOperator) {
        this.modeOfOperator = modeOfOperator;
    }

    //    to get the balance from my saving account
    public double accountBalance() {
        return balance;
    }

    public double debit(double balance, double amount) {
        //creating local variable       your balance                the amount you are withdrawing
        balance = balance - amount;
        return balance;
    }

    public double credit(double balance, double amount) {
        //creating local variable       your balance                the amount you are depositing
        balance = balance + amount;
        return balance;
    }
}
