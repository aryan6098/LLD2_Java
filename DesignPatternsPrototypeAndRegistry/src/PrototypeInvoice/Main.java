package PrototypeInvoice;

import PrototypeUser.User;
import PrototypeUser.UserPrototypeRegistry;
import PrototypeUser.UserPrototypeRegistryImpl;
import PrototypeUser.UserType;

public class Main {
    public static void main(String[] args) {
        Invoice salesInvoice = new Invoice(1L, "Raj", 2323.0, "UPI", InvoiceType.SALES);
        InvoicePrototypeRegistry registry = new InvoicePrototypeRegistryImpl();
        registry.addPrototype(salesInvoice);
        Invoice clonedSales = registry.clone(InvoiceType.SALES);
        System.out.println("SalesProtoType CustomerName: "+ salesInvoice.getCustomerName());
        System.out.println("SClonedProtoType CustomerName: "+ clonedSales.getCustomerName());

        System.out.println(salesInvoice != clonedSales); // true
        System.out.println(salesInvoice.getCustomerName().equals(clonedSales.getCustomerName())); // true
    }
}
