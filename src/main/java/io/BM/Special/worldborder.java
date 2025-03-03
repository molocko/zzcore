package io.BM.Special;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;
import dev.EX.ZZPlayer;

public class worldborder implements Listener {
    private static int border = 5000;


    @EventHandler
    public static void onWB(PlayerMoveEvent e){
        Vector vec = new Vector(0,0,0);
        boolean push = false;

        if(e.getFrom().getX() == e.getTo().getX() && e.getFrom().getZ() == e.getTo().getZ()) return;

        Player p = e.getPlayer();
        ZZPlayer zzp = new ZZPlayer(p);
        int x = (int) p.getLocation().getX();
        int z = (int) p.getLocation().getZ();

        if(x>border){
            push = true;
            if(x<=border+10){
                vec.setX(-0.5);
                vec.setY(0.2);
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*2,4));
                p.playSound(p, Sound.BLOCK_AZALEA_STEP, 1, 1);
                zzp.sendSpecialMsg(ChatMessageType.ACTION_BAR, "<red>Еще рано");
            }
            else {
                vec.setX(-10);
                vec.setY(1);
                p.sendMessage("x");
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*2,4));
                p.playSound(p, Sound.BLOCK_CAVE_VINES_FALL, 1, 1);
                zzp.sendSpecialMsg(ChatMessageType.ACTION_BAR, "<red><magic>УМРИ");
            }
        }


        if(z>border){
            push = true;
            if(z<=border+10){

                vec.setZ(-0.5);
                vec.setY(0.2);
               p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*2,4));
                p.playSound(p, Sound.BLOCK_AZALEA_STEP, 1, 1);
                zzp.sendSpecialMsg(ChatMessageType.ACTION_BAR, "<red>Еще рано");


            }
            else {
//            if(p.getWorld().getHighestBlockAt(x,z).getY()+1 == p.getLocation().getY()) {
                vec.setZ(-10);
                vec.setY(1);
                p.sendMessage("z");

                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20*2,4));
                p.playSound(p, Sound.BLOCK_CAVE_VINES_PICK_BERRIES, 1, 1);
                zzp.sendSpecialMsg(ChatMessageType.ACTION_BAR, "<red><magic>УМРИ");
//            }
            }
        }
        if(push) {
            p.sendMessage(vec.toString());

            p.setVelocity(vec);
        }




//        if(x>border || z>border){
//            if(x+10<=border){
//                p.sendMessage("x");
//                p.teleport(p.getLocation().add(-10,0,0));
//            }
//            if(z+10<=border){
//                p.sendMessage("z");
//                p.teleport(p.getLocation().add(0,0,-10));
//            }
//        }
    }

}