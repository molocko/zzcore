package io.BM.Special;

import io.BM.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OSFileUtils {

    static File file;
    static FileConfiguration config;

    public static void setup() {
        file = new File(Main.getInstance().getDataFolder(), "allowed.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);

        // Установка пустого списка locations по умолчанию, если он еще не существует
//        if (!config.contains("allow")) {
//            config.set("allow", new HashMap<String, Boolean>());
//            saveConfig();
//        }
    }


    public static void saveConfig() {
        try {
            config.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static FileConfiguration getConfig() {
        return config;
    }

    public static boolean isContains(String name){
        if(config.contains(name)){
            return config.getBoolean(name);
        } else {
            return false;
        }
    }



}
