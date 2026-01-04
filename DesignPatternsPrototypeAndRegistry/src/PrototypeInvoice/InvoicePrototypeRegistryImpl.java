package PrototypeInvoice;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {
    private final Map<InvoiceType, Invoice> registry= new HashMap<>();

    @Override
    public void addPrototype(Invoice user) {
        registry.put(user.getType(), user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        Invoice prototype = registry.get(type);
        if(prototype != null) {
            return prototype.cloneObject();
        }
        return null;
    }
}
