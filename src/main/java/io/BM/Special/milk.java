package io.BM.Special;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class milk implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEntityEvent e){
        Player p = e.getPlayer();
        if(p.getItemInHand().getType()!= Material.BUCKET) return;
        if(e.getRightClicked().getName().equals("RiGsMan_") && e.getRightClicked() instanceof Player){
            ItemStack item = p.getItemInHand();
            ItemMeta meta = item.getItemMeta();
            item.setType(Material.MILK_BUCKET);
            meta.setDisplayName(ChatColor.GRAY+"НЕМОЛОКО");
            item.setItemMeta(meta);
            p.setItemInHand(item);
//            p.getItemInHand().setType(Material.MILK_BUCKET);
        }


    }


}
