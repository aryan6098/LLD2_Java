package AdapterAndFacadeDesignPattern.adapter;

public interface BankApi {
    void addBankAccount(Bank bank);
    boolean pay(double amount, String account);
    double checkBalance();
    void transferFunds(String srcAccount, String desAccount, double amount);


}
