package factory.ui.button;

import factory.enums.Platform;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {

    }

    @Override
    public void printButton() {
        System.out.println(Platform.ANDROID);
    }
}
