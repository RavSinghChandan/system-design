package singleton.com.configuration.manager;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    public String getConfigValue() {
        return configValue;
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            synchronized (ConfigurationManager.class){
                if(instance == null){
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    private  String configValue;

    private ConfigurationManager(){
        this.configValue= "defaultConfig";
    }
}