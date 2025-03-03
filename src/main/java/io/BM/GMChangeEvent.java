package io.BM;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class GMChangeEvent implements Listener {

    @EventHandler
    public void onChange(PlayerGameModeChangeEvent e){
        Player p = e.getPlayer();
       // if (p.getGameMode().equals(GameMode.SURVIVAL) && p.getAllowFlight() && p.isInvulnerable()){
            p.setAllowFlight(false);
            p.setInvulnerable(false);
       // }



    }


}
