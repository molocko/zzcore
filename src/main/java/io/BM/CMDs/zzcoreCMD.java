package io.BM.CMDs;

import io.BM.FileUtils;
import io.BM.Main;
import io.BM.Special.TPEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class zzcoreCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        /////////////// OPOPOPOPOPOPOPOPOPOPOP
        if (args.length<1) {
            commandSender.sendMessage("Мне лень делать дизайн\nДобавь reload для перезагрузки всех кфг плагина");
            TPEvent.spiral((Player) commandSender);
        } else if (args.length == 1){
            if (args[0].equalsIgnoreCase("reload")) {
                Main.getInstance().reloadConfig();
                FileUtils.reloadConfig();
                commandSender.sendMessage("Конфиг успешно перезагружен");
            } else {
                commandSender.sendMessage("Але, ты ввел неверный аргумент");
            }
        } else if (args.length > 1) {
            commandSender.sendMessage("Але, ты ввел слишком много аргументов");
        }



        return true;
    }
}
