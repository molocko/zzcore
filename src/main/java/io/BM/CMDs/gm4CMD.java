package io.BM.CMDs;

import io.BM.FileUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.BM.system;

public class gm4CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {


        if (commandSender.isOp() || FileUtils.getConfig().getStringList("gms").contains(commandSender.getName())) {


            if (args.length == 0) {
                if (!(commandSender instanceof Player)) {
                    commandSender.sendMessage(system.prefixGM4_red+ ChatColor.translateAlternateColorCodes('&',"&x&C&B&2&D&3&EК&x&C&C&2&E&3&Eо&x&C&D&2&F&3&Eм&x&C&F&3&0&3&Eа&x&D&0&3&0&3&Dн&x&D&1&3&1&3&Dд&x&D&2&3&2&3&Dа &x&D&5&3&4&3&Dд&x&D&6&3&5&3&Dо&x&D&7&3&6&3&Dс&x&D&8&3&7&3&Dт&x&D&9&3&7&3&Cу&x&D&B&3&8&3&Cп&x&D&C&3&9&3&Cн&x&D&D&3&A&3&Cа &x&D&F&3&C&3&Cт&x&E&1&3&D&3&Cо&x&E&2&3&D&3&Bл&x&E&3&3&E&3&Bь&x&E&4&3&F&3&Bк&x&E&5&4&0&3&Bо &x&E&8&4&2&3&Bи&x&E&9&4&3&3&Bг&x&E&A&4&4&3&Bр&x&E&B&4&4&3&Aо&x&E&D&4&5&3&Aк&x&E&E&4&6&3&Aа&x&E&F&4&7&3&Aм"));
                    // Команда доступна только игрокам
                    return true;
                } else {
                    Player p = (Player) commandSender;
                    if (!(p.getAllowFlight() && p.isInvulnerable())) {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.setAllowFlight(true);
                        p.setInvulnerable(true);
                        p.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Д&x&F&F&D&F&5&9л&x&F&F&D&D&5&8я &x&F&F&D&7&5&8в&x&F&F&D&5&5&7а&x&F&F&D&2&5&7с &x&F&F&C&D&5&6б&x&F&F&C&A&5&6ы&x&F&F&C&7&5&5л &x&F&F&C&2&5&5в&x&F&F&B&F&5&4к&x&F&F&B&C&5&4л&x&F&F&B&A&5&4ю&x&F&F&B&7&5&3ч&x&F&F&B&4&5&3е&x&F&F&B&2&5&2н&r &x&F&F&A&C&5&2Г&x&F&F&A&A&5&1М&x&F&F&A&7&5&14"));
                        // Для вас был включен ГМ4
                        return true;
                    } else {
                        p.setGameMode(GameMode.SURVIVAL);
                        p.setInvulnerable(false);
                        p.setAllowFlight(false);
                        p.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Д&x&F&F&D&F&5&9л&x&F&F&D&D&5&8я &x&F&F&D&8&5&8в&x&F&F&D&5&5&7а&x&F&F&D&3&5&7с &x&F&F&C&D&5&6б&x&F&F&C&B&5&6ы&x&F&F&C&8&5&6л &x&F&F&C&3&5&5в&x&F&F&C&1&5&4ы&x&F&F&B&E&5&4к&x&F&F&B&C&5&4л&x&F&F&B&9&5&3ю&x&F&F&B&6&5&3ч&x&F&F&B&4&5&3е&x&F&F&B&1&5&2н&r &x&F&F&A&C&5&2Г&x&F&F&A&A&5&1М&x&F&F&A&7&5&14"));
                        // Для вас был включен ГМ4
                        return true;
                    }
                }
            }

            if (args.length == 1) {


                //if (args[0].equalsIgnoreCase("reload")) {
                //    FileUtils.reloadConfig();
                //    commandSender.sendMessage("кфг был перезагружен");
                //    return true;
                //}
                // КФГ ПЕРЕЗАГРУЖАЕТСЯ ЧЕРЕЗ ZZCORE
                String target = args[0];
                Player targetP = Bukkit.getPlayerExact(target);
                if (targetP == null) {
                    commandSender.sendMessage(system.prefixGM4_red+ChatColor.translateAlternateColorCodes('&',"&x&C&B&2&D&3&EИ&x&C&C&2&E&3&Eг&x&C&C&2&E&3&Eр&x&C&D&2&F&3&Eо&x&C&E&2&F&3&Eк &x&C&F&3&0&3&Eс &x&D&1&3&1&3&Dт&x&D&1&3&2&3&Dа&x&D&2&3&2&3&Dк&x&D&3&3&3&3&Dи&x&D&3&3&3&3&Dм &x&D&5&3&4&3&Dи&x&D&5&3&5&3&Dм&x&D&6&3&5&3&Dе&x&D&7&3&6&3&Dн&x&D&7&3&6&3&Dе&x&D&8&3&7&3&Dм &x&D&A&3&8&3&Cн&x&D&A&3&8&3&Cе &x&D&C&3&9&3&Cн&x&D&C&3&A&3&Cа&x&D&D&3&A&3&Cй&x&D&E&3&B&3&Cд&x&D&E&3&B&3&Cе&x&D&F&3&C&3&Cн&x&E&0&3&C&3&C, &x&E&1&3&D&3&Cв&x&E&2&3&E&3&Bо&x&E&3&3&E&3&Bз&x&E&3&3&F&3&Bм&x&E&4&3&F&3&Bо&x&E&5&4&0&3&Bж&x&E&5&4&0&3&Bн&x&E&6&4&1&3&Bо &x&E&7&4&2&3&Bо&x&E&8&4&2&3&Bн &x&E&9&4&3&3&Bн&x&E&A&4&4&3&Bе &x&E&C&4&5&3&Aв &x&E&D&4&6&3&Aс&x&E&E&4&6&3&Aе&x&E&E&4&7&3&Aт&x&E&F&4&7&3&Aи"));
                    // Игрок с таким именем не найден, возможно он не в сети
                    return true;
                } else {
                    if (!(targetP.getAllowFlight() && targetP.isInvulnerable())) {
                        targetP.setGameMode(GameMode.SURVIVAL);
                        targetP.setAllowFlight(true);
                        targetP.setInvulnerable(true);
                        commandSender.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Т&x&F&F&D&F&5&9ы &x&F&F&D&9&5&8в&x&F&F&D&6&5&7ы&x&F&F&D&2&5&7д&x&F&F&C&F&5&6а&x&F&F&C&C&5&6л &x&F&F&C&6&5&5Г&x&F&F&C&3&5&5М&x&F&F&C&0&5&44 &x&F&F&B&A&5&4и&x&F&F&B&7&5&3г&x&F&F&B&3&5&3р&x&F&F&B&0&5&2о&x&F&F&A&D&5&2к&x&F&F&A&A&5&1у&r &6") + target);
                        // Ты выдал ГМ4 игроку X
                        targetP.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Т&x&F&F&D&F&5&9е&x&F&F&D&C&5&8б&x&F&F&D&9&5&8е &x&F&F&D&2&5&7б&x&F&F&C&F&5&6ы&x&F&F&C&C&5&6л &x&F&F&C&6&5&5в&x&F&F&C&3&5&5к&x&F&F&C&0&5&4л&x&F&F&B&D&5&4ю&x&F&F&B&A&5&4ч&x&F&F&B&7&5&3е&x&F&F&B&3&5&3н &x&F&F&A&D&5&2Г&x&F&F&A&A&5&1М&x&F&F&A&7&5&14"));
                        // Тебе был включен ГМ4
                        return true;
                    } else {
                        targetP.setGameMode(GameMode.SURVIVAL);
                        targetP.setInvulnerable(false);
                        targetP.setAllowFlight(false);
                        commandSender.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Т&x&F&F&D&F&5&9ы &x&F&F&D&A&5&8о&x&F&F&D&7&5&8т&x&F&F&D&5&5&7к&x&F&F&D&2&5&7л&x&F&F&C&F&5&6ю&x&F&F&C&D&5&6ч&x&F&F&C&A&5&6и&x&F&F&C&7&5&5л &x&F&F&C&2&5&5Г&x&F&F&B&F&5&4М&x&F&F&B&C&5&44 &x&F&F&B&7&5&3и&x&F&F&B&4&5&3г&x&F&F&B&2&5&2р&x&F&F&A&F&5&2о&x&F&F&A&C&5&2к&x&F&F&A&A&5&1у &6") + target);
                        // Ты отключил ГМ4 игроку X
                        targetP.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9Т&x&F&F&D&F&5&9в&x&F&F&D&C&5&8о&x&F&F&D&9&5&8й &x&F&F&D&3&5&7Г&x&F&F&D&0&5&7М&x&F&F&C&D&5&64 &x&F&F&C&7&5&5б&x&F&F&C&5&5&5ы&x&F&F&C&2&5&5л &x&F&F&B&C&5&4в&x&F&F&B&9&5&3ы&x&F&F&B&6&5&3к&x&F&F&B&3&5&3л&x&F&F&B&0&5&2ю&x&F&F&A&D&5&2ч&x&F&F&A&A&5&1е&x&F&F&A&7&5&1н"));
                        // Твой ГМ4 был выключен
                        return true;
                    }
                }
            } else if (args.length > 1) {
                commandSender.sendMessage(system.prefixGM4_red + ChatColor.translateAlternateColorCodes('&', "&x&C&B&2&D&3&EТ&x&C&C&2&E&3&Eы &x&C&E&3&0&3&Eв&x&D&0&3&0&3&Dв&x&D&1&3&1&3&Dе&x&D&2&3&2&3&Dл &x&D&4&3&4&3&Dс&x&D&5&3&5&3&Dл&x&D&7&3&5&3&Dи&x&D&8&3&6&3&Dк&x&D&9&3&7&3&Cш&x&D&A&3&8&3&Cо&x&D&B&3&9&3&Cм &x&D&E&3&A&3&Cм&x&D&F&3&B&3&Cн&x&E&0&3&C&3&Cо&x&E&1&3&D&3&Cг&x&E&2&3&E&3&Bо &x&E&5&3&F&3&Bа&x&E&6&4&0&3&Bр&x&E&7&4&1&3&Bг&x&E&8&4&2&3&Bу&x&E&9&4&3&3&Bм&x&E&A&4&4&3&Bе&x&E&C&4&4&3&Aн&x&E&D&4&5&3&Aт&x&E&E&4&6&3&Aо&x&E&F&4&7&3&Aв"));
                // Ты ввел сликшом много аргументов
            }






               // if (args.length == 2) {
               //     if (args[0].equalsIgnoreCase("add")) {
               //         String targetName = args[1];
               //         FileUtils.addPlayer(targetName);
               //         commandSender.sendMessage(system.prefixGM4+ChatColor.translateAlternateColorCodes('&',"&x&F&F&E&2&5&9И&x&F&F&E&1&5&9г&x&F&F&E&0&5&9р&x&F&F&D&E&5&9о&x&F&F&D&D&5&8к &x&F&F&D&B&5&8б&x&F&F&D&A&5&8ы&x&F&F&D&9&5&8л &x&F&F&D&6&5&7у&x&F&F&D&5&5&7с&x&F&F&D&4&5&7п&x&F&F&D&3&5&7е&x&F&F&D&1&5&7ш&x&F&F&D&0&5&7н&x&F&F&C&F&5&6о &x&F&F&C&D&5&6д&x&F&F&C&C&5&6о&x&F&F&C&A&5&6б&x&F&F&C&9&5&6а&x&F&F&C&8&5&5в&x&F&F&C&7&5&5л&x&F&F&C&6&5&5е&x&F&F&C&5&5&5н &x&F&F&C&2&5&5в &x&F&F&C&0&5&4с&x&F&F&B&F&5&4п&x&F&F&B&D&5&4и&x&F&F&B&C&5&4с&x&F&F&B&B&5&4о&x&F&F&B&A&5&4к &x&F&F&B&8&5&3р&x&F&F&B&6&5&3а&x&F&F&B&5&5&3з&x&F&F&B&4&5&3р&x&F&F&B&3&5&3е&x&F&F&B&2&5&2ш&x&F&F&B&0&5&2е&x&F&F&A&F&5&2н&x&F&F&A&E&5&2н&x&F&F&A&D&5&2ы&x&F&F&A&C&5&2х &x&F&F&A&9&5&1л&x&F&F&A&8&5&1и&x&F&F&A&7&5&1ц"));
               //         // Игрок был успешно добавлен в список разрешенных лиц
               //         return true;
               //     }
               // }
        } else {
            commandSender.sendMessage(system.prefixGM4_red+ChatColor.translateAlternateColorCodes('&',"&x&C&B&2&D&3&EУ &x&C&D&2&F&3&Eт&x&C&E&2&F&3&Eе&x&D&0&3&0&3&Eб&x&D&1&3&1&3&Dя &x&D&3&3&3&3&Dн&x&D&4&3&4&3&Dе&x&D&5&3&4&3&Dт &x&D&7&3&6&3&Dд&x&D&9&3&7&3&Dо&x&D&A&3&8&3&Cс&x&D&B&3&8&3&Cт&x&D&C&3&9&3&Cу&x&D&D&3&A&3&Cп&x&D&E&3&B&3&Cа &x&E&0&3&C&3&Cк &x&E&3&3&E&3&Bэ&x&E&4&3&F&3&Bт&x&E&5&4&0&3&Bо&x&E&6&4&1&3&Bй &x&E&8&4&2&3&Bк&x&E&9&4&3&3&Bо&x&E&B&4&4&3&Bм&x&E&C&4&5&3&Aа&x&E&D&4&5&3&Aн&x&E&E&4&6&3&Aд&x&E&F&4&7&3&Aе"));
            // У тебя нет доступа к этой команде
            return true;
        }


            return true;
        }
    }


