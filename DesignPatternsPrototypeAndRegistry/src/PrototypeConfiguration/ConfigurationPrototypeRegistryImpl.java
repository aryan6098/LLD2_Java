package PrototypeConfiguration;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry{
    private final Map<ConfigurationType, Configuration> registry = new HashMap<>();

    @Override
    public void addPrototype(Configuration user) {
        registry.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = registry.get(type);
        if(prototype != null) {
            return prototype.cloneObject();
        }
        else {
            return null;
        }
    }
}
