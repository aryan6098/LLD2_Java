package factory.uifactory;

import factory.enums.Platform;

public class UIFactoryfactory {

    public static UIFactory getUiFactoryForPlatform(Platform platform) {
        return switch (platform) {
            case IOS ->  new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
