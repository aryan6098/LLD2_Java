package DesignPatternsDecorator;

public class VanillaCone implements IceCream{
    IceCream ic;

    public VanillaCone() {

    }
    public VanillaCone(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public double getCost() {
        if(ic == null) {
            return  20;
        }
        return ic.getCost() + 20;
    }

    @Override
    public String getDescription() {
        if(ic == null) {
            return" Vanilla Cone ";
        }
        return ic.getDescription() + " Vanilla Cone ";
    }
}
