package AdapterAndFacadeDesignPattern.adapter;

public class Client {

    public static void main(String[] args) {

        BankApi bankApi = new ICICIBankAdapter();
        PhonePay phonePay = new PhonePay(bankApi);

        phonePay.performBankOperation();
    }
}
