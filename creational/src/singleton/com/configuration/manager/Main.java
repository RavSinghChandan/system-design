package singleton.com.configuration.manager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager DefaultConfiguration = ConfigurationManager.getInstance();
        System.out.println("DefaultConfiguration is  : " + DefaultConfiguration.getConfigValue());
        System.out.println("===================================================================");
        DefaultConfiguration.setConfigValue("updatedConfiguration");
        System.out.println("updatedConfiguration is : "+ConfigurationManager.getInstance().getConfigValue());
    }
}
