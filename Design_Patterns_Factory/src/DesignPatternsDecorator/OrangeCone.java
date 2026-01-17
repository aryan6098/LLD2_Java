package DesignPatternsDecorator;

public class OrangeCone implements IceCream{

    IceCream ic;

    public OrangeCone() {

    }
    public OrangeCone(IceCream ic) {
        this.ic = ic;
    }
    @Override
    public double getCost() {
        if(ic == null) {
            return 10;
        }
        return 10 + ic.getCost();
    }

    @Override
    public String getDescription() {
        if(ic == null) {
            return  " Orange Cone ";
        }
        return ic.getDescription() + " Orange Cone ";
    }
}
