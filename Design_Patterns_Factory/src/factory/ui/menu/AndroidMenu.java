package factory.ui.menu;

import factory.enums.Platform;

public class AndroidMenu implements Menu{
    @Override
    public void printMenuType() {
        System.out.println(Platform.ANDROID);
    }
}
