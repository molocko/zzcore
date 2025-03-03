package io.BM.Special;

import io.BM.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

import static io.BM.Special.TPEvent.spiral;

public class tessCMD implements CommandExecutor {
    public static ArrayList<String> names = new ArrayList<String>();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player p = (Player) commandSender;
        //names.add(p.getName());
        spiral(p,1);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
            spiral(p);
        }, 20L * 3L /*<-- the delay */);
        p.sendMessage("Ты был добавлен в список!");



        return true;
    }
}
