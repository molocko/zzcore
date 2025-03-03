package io.BM.Special;

import io.BM.Main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class TPEvent implements Listener {

    //PacketContainer packet = new PacketContainer(PacketType.Play.Server.ENTITY_EFFECT);

    List<String> list = new ArrayList<>();
    public static AtomicBoolean used = new AtomicBoolean(false);

    // BukkitTask sheduler = Main.getInstance().getServer().getScheduler().runTaskTimer(Main.getInstance(), ()-> {}, 0L, 20L);



    Block dl, ur, dr, ul;

    int[] zero = {2483, 69, 4331};
    int[] one = {2487, 88, 4331};
    int[] two = {0,0,0};
    int[] three = {0,0,0};
    int[] four = {0,0,0};
    int[] five = {0,0,0};
    int[] six = {0,0,0};
    int[] seven = {0,0,0};
    int[] eight = {2483, 98, 4327};
    int[] nine = {2483, 108, 4327};
    // int[] one_t = {2483, 97, 4332};
    public static ArrayList<int[]> portals = new ArrayList<>();

    private double x, y, z;



    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        // 228 63 23
        // 228 64 22

        // 2483.4 69 4331.4    2482.6 69 4332.4

        // 0
        // 2483.4 69 4332.4    2482.6 69 4332.4
        // 2483.4 69 4331.4    2482.6 69 4331.4

        // 1
        // 2487.4 88 4332.4    2486.6 88 4332.4
        // 2487.4 88 4331.4    2486.6 88 4331.4

        portals.add(zero);
        portals.add(one);
        portals.add(two);
        portals.add(three);
        portals.add(four);
        portals.add(five);
        portals.add(six);
        portals.add(seven);
        portals.add(eight);
        portals.add(nine);
        //portals.add(one_t);




        Player p = e.getPlayer();

        if (!(p.getName().equalsIgnoreCase("keborg") || p.getName().equalsIgnoreCase("kedorg") || p.getName().equalsIgnoreCase("krikar")))
            return;
        if (list.contains(p.getName())) {
            //if (e.getFrom().getBlockX() != e.getTo().getBlockX() || e.getFrom().getBlockY() != e.getTo().getBlockY() || e.getFrom().getBlockZ() != e.getTo().getBlockZ()) {
            if (e.getFrom().getBlockX() != e.getTo().getBlockX() || e.getFrom().getBlockZ() != e.getTo().getBlockZ()) {
                e.setCancelled(true);
                // the player moved
            }


            return;
        }


        //double x = p.getLocation().getX()*10;
        x = p.getLocation().getX();
        y = p.getLocation().getY();
        z = p.getLocation().getZ();




        dl = p.getWorld().getBlockAt(2484, 68, 4330);
        ul = p.getWorld().getBlockAt(2484, 68, 4333);
        ur = p.getWorld().getBlockAt(2481, 68, 4333);
        dr = p.getWorld().getBlockAt(2481, 68, 4330);

        //p.sendMessage(portals.get(0)[0] + "\n" + portals.get(0)[1] + "\n" + portals.get(0)[2]);


        //if (((double) ((int) (x * 10)) / 10 <= portals.get(1)[0]+.5 && (double) ((int) (x * 10)) / 10 >= portals.get(1)[0]-.5) && y == portals.get(1)[1] && ((double) ((int) (z * 10)) / 10 >= portals.get(1)[2]+.5 && (double) ((int) (z * 10)) / 10 <=  portals.get(1)[2]+1.5)) {
        if (locationsGet(1, p)) {
            //p.teleport(generateLocation(p, 5000));
            p.teleport(new Location(p.getWorld(), 2483, 97, 4332, p.getLocation().getYaw(), p.getLocation().getPitch()));
            //p.sendMessage("lol");
        }
        else if(locationsGet(8, p)){
            //p.teleport(generateLocation(p, 5000));
            p.teleport(new Location(p.getWorld(), 2483, 108, 4336, p.getLocation().getYaw(), p.getLocation().getPitch()));
            //p.sendMessage("lol");
        }
        else if(locationsGet(9, p)){
            //p.teleport(generateLocation(p, 5000));
            p.teleport(generateLocation(p, 5000));
            //p.sendMessage("lol");
        }


        //p.sendMessage(String.valueOf((double) (int) x/10)+"\n"+dl.getType().name()+"\n"+ul.getType().name());

        //if ((double) ((int) (x * 10)) / 10 >= 2482.5 && (double) ((int) (x * 10)) / 10 <= 2483.5) {
        //if ((double) ((int) (x * 10)) / 10 <= 2483.5 && (double) ((int) (x * 10)) / 10 >= 2482.5) {
        else if ((double) ((int) (x * 10)) / 10 <= portals.get(0)[0]+.5 && (double) ((int) (x * 10)) / 10 >= portals.get(0)[0]-.5) {
            if (y == portals.get(0)[1]) {
                //if ((double) ((int) (z * 10)) / 10 >= 4331.5 && (double) ((int) (z * 10)) / 10 <= 4332.5) {
                if ((double) ((int) (z * 10)) / 10 >= portals.get(0)[2]+.5 && (double) ((int) (z * 10)) / 10 <=  portals.get(0)[2]+1.5) {
                    if (used.get()) {
                        return;
                    }
                    used.set(true);

                    final int[] g = {0};
                    final int[] g1 = {0};

                    // DO
                    list.add(p.getName());

                    int finalJ = 0;
                    int f = 15;
                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        p.teleport(new Location(p.getWorld(), 2483, 87, 4332, p.getLocation().getYaw(), p.getLocation().getPitch()));
                    } , Math.round(20*3.4));
                    for (int j = 1; j <= 17; j++) {


                        if (j < 4) {
                            f += 5;
                            finalJ = j;
                            int finalI1 = finalJ;
                            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                                p.getWorld().getBlockAt(dl.getLocation().add(0, finalI1, 0)).setType(dl.getType());
                                p.playSound(dl.getLocation().add(0, finalI1, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(ul.getLocation().add(0, finalI1, 0)).setType(dl.getType());
                                p.playSound(ul.getLocation().add(0, finalI1, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(ur.getLocation().add(0, finalI1, 0)).setType(dl.getType());
                                p.playSound(ur.getLocation().add(0, finalI1, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(dr.getLocation().add(0, finalI1, 0)).setType(dl.getType());
                                p.playSound(dr.getLocation().add(0, finalI1, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                if (finalI1 % 2 == 0) spiral(p, 1);
                            }, f /*<-- the delay */);
                        } else {
                            f += 3;
                            finalJ = j;
                            int finalJ2 = finalJ;
                            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                                if (Main.getInstance().getConfig().getBoolean("damage")) {
                                    p.damage(0.001);
                                }
                                if (Main.getInstance().getConfig().getBoolean("blind")) {
                                    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 25 * 1, 9));
                                    //p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 25*1, 9));
                                }

                                if (finalJ2 % 2 == 0) spiral(p);


                                p.getWorld().getBlockAt(dl.getLocation().add(0, finalJ2 - 3, 0)).setType(Material.AIR);
                                p.playSound(dl.getLocation().add(0, finalJ2 - 3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                                p.getWorld().getBlockAt(ul.getLocation().add(0, finalJ2 - 3, 0)).setType(Material.AIR);
                                p.playSound(ul.getLocation().add(0, finalJ2 - 3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                                p.getWorld().getBlockAt(ur.getLocation().add(0, finalJ2 - 3, 0)).setType(Material.AIR);
                                p.playSound(ur.getLocation().add(0, finalJ2 - 3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                                p.getWorld().getBlockAt(dr.getLocation().add(0, finalJ2 - 3, 0)).setType(Material.AIR);
                                p.playSound(dr.getLocation().add(0, finalJ2 - 3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);

                                p.getWorld().getBlockAt(dl.getLocation().add(0, finalJ2, 0)).setType(dl.getType());
                                p.playSound(dl.getLocation().add(0, finalJ2, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(ul.getLocation().add(0, finalJ2, 0)).setType(dl.getType());
                                p.playSound(ul.getLocation().add(0, finalJ2, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(ur.getLocation().add(0, finalJ2, 0)).setType(dl.getType());
                                p.playSound(ur.getLocation().add(0, finalJ2, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);
                                p.getWorld().getBlockAt(dr.getLocation().add(0, finalJ2, 0)).setType(dl.getType());
                                p.playSound(dr.getLocation().add(0, finalJ2, 0), Sound.BLOCK_BASALT_PLACE, 1, 1);


//                                if (p.getLocation().getY() >= 83) {
//                                    p.teleport(new Location(p.getWorld(), 2483, 87, 4332, p.getLocation().getYaw(), p.getLocation().getPitch()));
//                                    p.setVelocity(new Vector(0, 0.3, 0));
//                                } else {
//                                    p.setVelocity(new Vector(0, 0.5, 0));
//                                }
                                if (p.getLocation().getY() < 83) {
                                    p.setVelocity(new Vector(0, 0.5, 0));
                                }
                            }, f /*<-- the delay */);
                        }
                    }


                    int finalJ3 = finalJ;
                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        p.getWorld().getBlockAt(dl.getLocation().add(0, finalJ3 - 2, 0)).setType(Material.AIR);
                        p.playSound(dl.getLocation().add(0, finalJ3 - 2, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ul.getLocation().add(0, finalJ3 - 2, 0)).setType(Material.AIR);
                        p.playSound(ul.getLocation().add(0, finalJ3 - 2, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ur.getLocation().add(0, finalJ3 - 2, 0)).setType(Material.AIR);
                        p.playSound(ur.getLocation().add(0, finalJ3 - 2, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(dr.getLocation().add(0, finalJ3 - 2, 0)).setType(Material.AIR);
                        p.playSound(dr.getLocation().add(0, finalJ3 - 2, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                    }, f /*<-- the delay */);
                    f += 3;
                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        p.getWorld().getBlockAt(dl.getLocation().add(0, finalJ3 - 1, 0)).setType(Material.AIR);
                        p.playSound(dl.getLocation().add(0, finalJ3 - 1, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ul.getLocation().add(0, finalJ3 - 1, 0)).setType(Material.AIR);
                        p.playSound(ul.getLocation().add(0, finalJ3 - 1, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ur.getLocation().add(0, finalJ3 - 1, 0)).setType(Material.AIR);
                        p.playSound(ur.getLocation().add(0, finalJ3 - 1, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(dr.getLocation().add(0, finalJ3 - 1, 0)).setType(Material.AIR);
                        p.playSound(dr.getLocation().add(0, finalJ3 - 1, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                    }, f /*<-- the delay */);
                    f += 3;
                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        p.getWorld().getBlockAt(dl.getLocation().add(0, finalJ3, 0)).setType(Material.AIR);
                        p.playSound(dl.getLocation().add(0, finalJ3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ul.getLocation().add(0, finalJ3, 0)).setType(Material.AIR);
                        p.playSound(ul.getLocation().add(0, finalJ3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(ur.getLocation().add(0, finalJ3, 0)).setType(Material.AIR);
                        p.playSound(ur.getLocation().add(0, finalJ3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                        p.getWorld().getBlockAt(dr.getLocation().add(0, finalJ3, 0)).setType(Material.AIR);
                        p.playSound(dr.getLocation().add(0, finalJ3, 0), Sound.BLOCK_BASALT_BREAK, 1, 1);
                    }, f /*<-- the delay */);


                    //p.damage(0.01);
                    //p.teleport(p.getLocation().add(0,10,0));
                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        list.remove(p.getName());
                        //p.setVelocity(new Vector(0, 10, 0));
                    }, 35L * 1L /*<-- the delay */);

//                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
//                        p.setVelocity(new Vector(0, 10, 0));
//                    }, f-10L /*<-- the delay */);
                    //p.setVelocity(new Vector(0, 10, 0));
                    //p.setVelocity(p.getLocation().getDirection());

                    Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                        used.set(false);
                    }, 50L * 3L);

                }
            }
        }
    }

    public static void spiral(Player p){
        Location location = p.getLocation();
        double radius = 0.5;
        for (double yy = 0; yy <= 23; yy += 0.1) {
            double xx = radius * Math.cos(yy);
            double zz = radius * Math.sin(yy);

            double finalYy = yy;
            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                Location particleLocation = new Location(location.getWorld(), location.getX(), location.getY(), location.getZ());
                p.spawnParticle(Particle.REDSTONE, particleLocation.add(xx, finalYy / 10, zz), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            }, 1L);
        }
    }
    public static void spiral(Player p, Color color){
        Location location = p.getLocation();
        double radius = 0.5;
        for (double yy = 0; yy <= 23; yy += 0.1) {
            double xx = radius * Math.cos(yy);
            double zz = radius * Math.sin(yy);

            double finalYy = yy;
            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                Location particleLocation = new Location(location.getWorld(), location.getX(), location.getY(), location.getZ());
                p.spawnParticle(Particle.REDSTONE, particleLocation.add(xx, finalYy / 10, zz), 2, new Particle.DustOptions(color, 1.0F));
            }, 1L);
        }
    }

    public static void spiral(Player p, int i){
        Location location = p.getLocation();
        double radius = 0.5;
        for (double yy = 0; yy <= 23; yy += 0.1) {
            double xx = radius * Math.cos(yy);
            double zz = radius * Math.sin(yy);

            double finalYy = yy;
            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                Location particleLocation = new Location(location.getWorld(), location.getX(), location.getY(), location.getZ());
                p.spawnParticle(Particle.GLOW, particleLocation.add(xx, finalYy / 10, zz), 2);
            }, 1L);
        }
    }
    public static Location generateLocation(Player player, int border) {
        Random random = new Random();
        int x = 0;
        int z = 0;
        int y = 0;
        x = random.nextInt(border-1);
        z = random.nextInt(border-1);
        y = 255;
        Location randomLocation = new Location(player.getWorld(), x, y, z);
        y = randomLocation.getWorld().getHighestBlockYAt(randomLocation);
        randomLocation.setY((y + 20));
        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 255));

        return randomLocation;
    }

    public static boolean locationsGet(int num, Player p){
        double x = p.getLocation().getX();
        double y = p.getLocation().getY();
        double z = p.getLocation().getZ();
        if (!(((double) ((int) (x * 10)) / 10 <= TPEvent.portals.get(num)[0]+.5 && (double) ((int) (x * 10)) / 10 >= portals.get(num)[0]-.5) && y == portals.get(num)[1] && ((double) ((int) (z * 10)) / 10 >= portals.get(num)[2]+.5 && (double) ((int) (z * 10)) / 10 <=  portals.get(num)[2]+1.5))) {
            return false;
        } else return true;
    }


}
