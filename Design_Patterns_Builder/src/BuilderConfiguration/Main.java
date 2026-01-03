package BuilderConfiguration;

public class Main {
    public static void main(String[] args) {
        DatabaseConfigurationBuilder config = new DatabaseConfigurationBuilder.Builder()
                .databaseUrl("jdbc:mysql://localhost:3306/mydb")
                .userName("admin")
                .password("admin123")
                .maxConnections(20)
                .enableCache(true)
                .isReadOnly(false)
                .build();

        System.out.println("Database URL     : " + config.getDatabaseUrl());
        System.out.println("Username         : " + config.getUsername());
        System.out.println("Password         : " + config.getPassword());
        System.out.println("Max Connections  : " + config.getMaxConnections());
        System.out.println("Enable Cache     : " + config.isEnableCache());
        System.out.println("Read Only        : " + config.isReadOnly());

    }
}
