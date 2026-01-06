package factory.uifactory;

import factory.ui.button.Button;
import factory.ui.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu cretaeMenu();
}
