package io.BM.Special;

import dev.EX.Funcs;
import io.BM.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class SpecialShovel implements Listener {


    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        if(p.getGameMode() == GameMode.CREATIVE) return;
        if(p.getItemInHand().getItemMeta().getDisplayName().equals(createShovel().getItemMeta().getDisplayName())) {
            if (event.getBlock().getType() != Material.SNOW_BLOCK && event.getBlock().getType() != Material.SNOW) {
                event.setCancelled(true);
            }
        }
    }

    public static void init(Main plugin) {
        NamespacedKey key = new NamespacedKey(plugin, "shovel");
        plugin.getServer().removeRecipe(key);
        ShapedRecipe recipe = new ShapedRecipe(key,createShovel());
        recipe.shape("SSS", "STS", "SSS");
        recipe.setIngredient('S', Material.SNOW_BLOCK);
        recipe.setIngredient('T', Material.WOODEN_SHOVEL);
        plugin.getServer().addRecipe(recipe);
    }
    private static ItemStack createShovel() {
        ItemStack shovel = new ItemStack(Material.WOODEN_SHOVEL);
        ItemMeta meta = shovel.getItemMeta();
        meta.setDisplayName(Funcs.colorize("<red><magic>SpecialShovel"));
        meta.setUnbreakable(true);
//        shovel.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
//        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setLore(Arrays.asList(new String[]{Funcs.colorize("<red>Last <white>Christmas"), Funcs.colorize("<pink>I gave u my heart"),Funcs.colorize("<purple>But the very next day"),Funcs.colorize("<aqua>U gave it away")}));
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE,ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DIG_SPEED, 10,true);
        shovel.setItemMeta(meta);
        return shovel;
    }




}
