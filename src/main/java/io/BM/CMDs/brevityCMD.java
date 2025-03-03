package io.BM.CMDs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.BM.system;

public class brevityCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.isOp()){
            for(Player p : Bukkit.getOnlinePlayers()) {
                p.setAllowFlight(false);
                p.setInvulnerable(false);
            }
            commandSender.sendMessage(system.prefixBrevity+ ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Ф&x&F&F&E&1&5&9л&x&F&F&E&0&5&9а&x&F&F&D&E&5&9й &x&F&F&D&C&5&8и &x&F&F&D&9&5&8н&x&F&F&D&8&5&8е&x&F&F&D&7&5&8у&x&F&F&D&6&5&7я&x&F&F&D&4&5&7з&x&F&F&D&3&5&7в&x&F&F&D&2&5&7и&x&F&F&D&1&5&7м&x&F&F&D&0&5&7о&x&F&F&C&E&5&6с&x&F&F&C&D&5&6т&x&F&F&C&C&5&6ь &x&F&F&C&9&5&6о&x&F&F&C&8&5&6т&x&F&F&C&7&5&5к&x&F&F&C&6&5&5л&x&F&F&C&5&5&5ю&x&F&F&C&3&5&5ч&x&F&F&C&2&5&5е&x&F&F&C&1&5&5н&x&F&F&C&0&5&4а &x&F&F&B&D&5&4в&x&F&F&B&C&5&4с&x&F&F&B&B&5&4е&x&F&F&B&9&5&4м &x&F&F&B&7&5&3о&x&F&F&B&6&5&3н&x&F&F&B&5&5&3л&x&F&F&B&3&5&3а&x&F&F&B&2&5&3й&x&F&F&B&1&5&2н &x&F&F&A&E&5&2и&x&F&F&A&D&5&2г&x&F&F&A&C&5&2р&x&F&F&A&B&5&2о&x&F&F&A&9&5&1к&x&F&F&A&8&5&1а&x&F&F&A&7&5&1м"));
            // Флай и неуязвимость отключена всем онлайн игрокам


        } else {
            commandSender.sendMessage(system.prefixBrevity_red+ChatColor.translateAlternateColorCodes('&',"&x&C&B&2&D&3&EУ &x&C&D&2&F&3&Eт&x&C&E&2&F&3&Eе&x&D&0&3&0&3&Eб&x&D&1&3&1&3&Dя &x&D&3&3&3&3&Dн&x&D&4&3&4&3&Dе&x&D&5&3&4&3&Dт &x&D&7&3&6&3&Dд&x&D&9&3&7&3&Dо&x&D&A&3&8&3&Cс&x&D&B&3&8&3&Cт&x&D&C&3&9&3&Cу&x&D&D&3&A&3&Cп&x&D&E&3&B&3&Cа &x&E&0&3&C&3&Cк &x&E&3&3&E&3&Bэ&x&E&4&3&F&3&Bт&x&E&5&4&0&3&Bо&x&E&6&4&1&3&Bй &x&E&8&4&2&3&Bк&x&E&9&4&3&3&Bо&x&E&B&4&4&3&Bм&x&E&C&4&5&3&Aа&x&E&D&4&5&3&Aн&x&E&E&4&6&3&Aд&x&E&F&4&7&3&Aе"));
            // У тебя нет доступа к этой команде
        }
        return true;
    }
}
