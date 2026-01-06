package factory.ui.button;

import factory.enums.Platform;

public class IOSButton implements Button{
    @Override
    public void changeSize() {

    }

    @Override
    public void printButton() {
        System.out.println(Platform.IOS);

    }
}
