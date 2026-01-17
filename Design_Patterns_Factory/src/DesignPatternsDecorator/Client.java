package DesignPatternsDecorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new OrangeCone();
        ic = new VanillaCone(ic);
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());

    }
}
