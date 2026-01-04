package PrototypeUser;

public class Main {
    public static void main(String[] args) {
        User adminPrototype = new User(1L, "admin", "admin@gmail.com", "Administratotor", 30, UserType.ADMIN);
        UserPrototypeRegistry registry = new UserPrototypeRegistryImpl();
        registry.addPrototype(adminPrototype);
        User clonedAdmin = registry.clone(UserType.ADMIN);

        System.out.println("adminProtoType userName: "+ adminPrototype.getUsername());

        System.out.println("cloneProtoType userName: "+ clonedAdmin.getUsername());

        System.out.println(adminPrototype != clonedAdmin); // true
        System.out.println(adminPrototype.getUsername()
                .equals(clonedAdmin.getUsername())); // true
    }
}
