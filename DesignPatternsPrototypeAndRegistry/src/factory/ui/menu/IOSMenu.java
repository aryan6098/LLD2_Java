package factory.ui.menu;

import factory.enums.Platform;

public class IOSMenu implements Menu{
    @Override
    public void printMenuType() {
        System.out.println(Platform.IOS);
    }
}
