package io.BM;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    static File file;
    static FileConfiguration config;

    public static void setup() {
        file = new File(Main.getInstance().getDataFolder(), "gm4.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        config = YamlConfiguration.loadConfiguration(file);

        // Установка пустого списка locations по умолчанию, если он еще не существует
        if (!config.contains("gms")) {
            config.set("gms", new ArrayList<String>());
            saveConfig();
        }
    }



    public static void saveConfig() {
        try {
            config.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void reloadConfig(){
        config = YamlConfiguration.loadConfiguration(file);
    }
    //      ХЗ РАБОТЕТ ЛИ ВООБЩЕ 0-0

    public static FileConfiguration getConfig() {
        return config;
    }

    public static void addPlayer(String name) {
        List<String> list =  config.getStringList("gms");
        list.add(name);
        config.set("gms", list);
        reloadConfig();

    }


    //public static List<Location> loadLocations() {
    //    List<Location> locations = new ArrayList<>();
    //    List<String> locationStrings = config.getStringList("locations");
//
    //    for (String locationString : locationStrings) {
    //        Location location = parseLocation(locationString);
    //        if (location != null) {
    //            locations.add(location);
    //        }
    //    }
//
    //    return locations;
    //}



   //public static void saveLocationsToFile(List<Location> locations) {
   //    List<String> locationStrings = new ArrayList<>();
   //    for (Location location : locations) {
   //        String locationString =
   //                location.getX() + ";" +
   //                        location.getY() + ";" +
   //                        location.getZ();
   //        locationStrings.add(locationString);
   //    }
   //    config.set("locations", locationStrings);
   //    saveConfig();
   //}

}
