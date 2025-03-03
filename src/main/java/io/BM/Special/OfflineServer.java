package io.BM.Special;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class OfflineServer implements Listener, CommandExecutor {
    boolean toggle = true;
//    public static Plugin ewl;

//    public static void initOS() {
//        ewl = Main.getInstance().getServer().getPluginManager().getPlugin("EasyWhitelist");
//        if(ewl != null) {
//            Main.getInstance().getServer().getPluginManager().disablePlugin(ewl);
//            Main.getInstance().log.warning("EAWL has been disabled");
//        }
//
//    }

    @EventHandler()
    public void onPlayerJoin(PlayerLoginEvent e) {
//        if(!toggle) return;

//        if(OSFileUtils.isContains(e.getPlayer().getName()) != null){
//
//        }

//        if(!(true))
//        if(!(
//                e.getPlayer().getName().equalsIgnoreCase("kedorg")
//                || e.getPlayer().getName().equalsIgnoreCase("keborg")
//                || e.getPlayer().getName().equalsIgnoreCase("krikar")))
//        {
//            e.disallow(PlayerLoginEvent.Result.KICK_BANNED, "Connection refused: getsockopt");
////            e.getPlayer().kickPlayer("Connection refused: getsockopt");
//        }
//                || e.getPlayer().getName().equalsIgnoreCase("keborg"))
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.isOp()){
            toggle = !toggle;
        }
        if(toggle){
//            Main.getInstance().getServer().getPluginManager().disablePlugin(ewl);
            commandSender.sendMessage("Offline mode enabled");
        } else {
//            Main.getInstance().getServer().getPluginManager().enablePlugin(ewl);
            commandSender.sendMessage("Offline mode disabled");
        }
        return true;
    }
}
