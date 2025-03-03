package io.BM.CMDs;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class scriptsCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (!(commandSender.getName().equalsIgnoreCase("keborg") || commandSender.getName().equalsIgnoreCase("kedorg") || commandSender instanceof ConsoleCommandSender)){
            return true;
        }
        Player target = Bukkit.getPlayerExact(args[0]);
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        target.getWorld().strikeLightningEffect(target.getLocation());
        return true;
    }
}
