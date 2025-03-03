package io.BM;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;


public class SpawnEvent implements Listener {

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (e.getLocation().getWorld() == Bukkit.getWorld("world") && e.getLocation().getWorld().getBiome(e.getLocation()) == Biome.CRIMSON_FOREST) {
            if (e.getEntityType().equals(EntityType.PIGLIN)) {
                Piglin pig = (Piglin)e.getEntity();
                pig.setImmuneToZombification(true);
                return;
            }
        }
        if (Main.getInstance().getConfig().getBoolean("disableSR")) e.setCancelled(true);


    }

    private Player findNearestPlayer(Location location) {
        Player nearestPlayer = null;
        double nearestDistance = Double.MAX_VALUE;

        for (Player player : Bukkit.getOnlinePlayers()) {
            if(player.getWorld().equals(location.getWorld())) {
                double distance = player.getLocation().distance(location);
                if (distance < nearestDistance) {
                    nearestDistance = distance;
                    nearestPlayer = player;
                }
            }
        }

        return nearestPlayer;
    }
}
