package factory.uifactory;

import factory.ui.button.AndroidButton;
import factory.ui.button.Button;
import factory.ui.menu.AndroidMenu;
import factory.ui.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu cretaeMenu() {
        return new AndroidMenu();
    }
}
