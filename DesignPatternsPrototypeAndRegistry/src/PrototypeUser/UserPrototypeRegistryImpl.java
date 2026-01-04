package PrototypeUser;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry{
    private final Map<UserType, User> registry = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        registry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return registry.get(type);
    }

    @Override
    public User clone(UserType type) {
        User prototype = registry.get(type);
        if(prototype != null) {
            return prototype.cloneObject();
        }else {
            return  null;
        }
    }

}
