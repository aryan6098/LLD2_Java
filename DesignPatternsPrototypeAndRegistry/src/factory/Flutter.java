package factory;

import factory.enums.Platform;
import factory.uifactory.AndroidUIFactory;
import factory.uifactory.IOSUIFactory;
import factory.uifactory.UIFactory;
import factory.uifactory.UIFactoryfactory;

public class Flutter {
    public void setTheme() {
        System.out.println("Setting Theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createFactory(Platform platform) {
        return UIFactoryfactory.getUiFactoryForPlatform(platform);
//        if(platform == Platform.ANDROID) {
//            return new AndroidUIFactory();
//        }
//        else if(platform == Platform.IOS) {
//            return new IOSUIFactory();
//        }
//        return null;
    }
}
