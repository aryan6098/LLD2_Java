package factory.uifactory;

import factory.ui.button.Button;
import factory.ui.button.IOSButton;
import factory.ui.menu.IOSMenu;
import factory.ui.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu cretaeMenu() {
        return new IOSMenu();
    }
}
