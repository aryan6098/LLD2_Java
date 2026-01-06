package PrototypeConfiguration;

import PrototypeUser.User;
import PrototypeUser.UserType;

public class Main {
    public static void main(String[] args) {
        Configuration basicConfiguration = new Configuration("Gray", true, "english", true, 16, "arial", ConfigurationType.BASIC);
        ConfigurationPrototypeRegistry registry = new ConfigurationPrototypeRegistryImpl();
        registry.addPrototype(basicConfiguration);
        Configuration clonedBasicConf = registry.clone(ConfigurationType.BASIC);

        System.out.println("Basic Theme Color: "+ basicConfiguration.getThemeColor());
        System.out    .println("Cloned Theme Color: "+ clonedBasicConf.getThemeColor());

        System.out.println(basicConfiguration.getDarkMode().equals(clonedBasicConf.getDarkMode()));



    }
}
