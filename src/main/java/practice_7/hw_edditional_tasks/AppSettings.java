package practice_7.hw_edditional_tasks;

import java.util.HashMap;
import java.util.Set;

public class AppSettings {
    private HashMap<String, String> settings;

    public AppSettings() {
        this.settings = new HashMap<>();
    }

    public void addSetting(String key, String value) {
        settings.put(key, value);
    }

    public boolean isSettingExist(String key) {
        return settings.containsKey(key);
    }

    public void getAllSettings() {
        settings.entrySet().forEach(System.out::println);
    }

    public String getSettingByKey(String key) {
        return settings.get(key);
    }

    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        appSettings.addSetting("host", "stage.admin.com");
        appSettings.addSetting("data-base", "rds1.admin.com");
        appSettings.addSetting("front-url", "front-stage.admin.com");
        appSettings.getAllSettings();
        if (appSettings.isSettingExist("host")) {
            System.out.println(appSettings.getSettingByKey("host"));
        } else {
            System.out.println("Setting not found");
        }
    }
}
