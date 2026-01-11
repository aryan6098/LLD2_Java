package AdapterAndFacadeDesignPattern.adapter;

public class PhonePay {

    private BankApi bankApi;

    public PhonePay(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    void performBankOperation() {
        Bank bank = new Bank("123334", "Aryan Raj");
        bankApi.addBankAccount(bank);
        boolean paymentStatus =  bankApi.pay(100.0, "223333");
        if(paymentStatus) {
            bankApi.transferFunds("132224444", "23423424342",3243);
        }
    }
}
