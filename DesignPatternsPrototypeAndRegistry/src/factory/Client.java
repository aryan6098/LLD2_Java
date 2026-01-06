package factory;

import factory.enums.Platform;
import factory.ui.button.Button;
import factory.uifactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(Platform.ANDROID);

        Button b =  uiFactory.createButton();
        b.printButton();
    }
}
