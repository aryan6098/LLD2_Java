package AdapterAndFacadeDesignPattern.facade;

public class Client {
    public static void main(String[] args) {
        CheckoutFacade facade = new CheckoutFacade();
        String label = facade.checkout("alock", "secrtet", "SKU_!", 2,"4114-1233-2342-2322", 99.9, "Grote Belt 34");
        if (label == null) throw new RuntimeException("Checkout failed");
        System.out.println("Order Places, label = "+ label);
    }

}
