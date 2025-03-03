package io.BM.Special;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class hbsysEvent implements Listener {
    boolean temp = false;

    @EventHandler
    public void onChangeHB(PlayerItemHeldEvent e) {
        Player p = e.getPlayer();
        if (!tessCMD.names.contains(p.getName())) return;
       // if(!(p.getName().equalsIgnoreCase("kedorg"))) return;

        p.getInventory().setHeldItemSlot(4);


        // ДОБАВИТЬ ВОЗМОЖНОСТЬ ВЫРУБИТЬ В КФГ
        e.setCancelled(true);

        if(temp){
            temp = true;
            return;
        }

        p.sendMessage("Меню администратора:\n[1] Добавить в WhiteList\n[2] Список Банов\n[3] Отправить всем игрокам Title\n[4] Заморозить всех игроков\n"+ ChatColor.RED+"[5-8] Нет\n"+ChatColor.RESET+"[9] Выйти из состояния");



        if(e.getNewSlot() == 8) {
            tessCMD.names.remove(p.getName());
            p.sendMessage("Ты был удален из списка!");
        }
        else if(e.getNewSlot() == 0) {
            p.sendMessage("1");
        }
        else if(e.getNewSlot() == 1) {
            p.sendMessage("2");
        }
        else if(e.getNewSlot() == 2) {
            p.sendMessage("3");
        }
        else if(e.getNewSlot() == 3) {
            p.sendMessage("4");
        }
        else if(e.getNewSlot() == 4) {
            p.sendMessage("5");
        }
        else if(e.getNewSlot() == 5) {
            p.sendMessage("6");
        }
        else if(e.getNewSlot() == 6) {
            p.sendMessage("7");
        }
        else if(e.getNewSlot() == 7) {
            p.sendMessage("8");
        }

    }


}
