package io.BM;

import io.BM.CMDs.scriptsCMD;
import io.BM.CMDs.zzcoreCMD;
import io.BM.Special.*;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

import dev.EX.Funcs;


public class Main extends JavaPlugin {
    public Logger log = getLogger();
    static Main instance;

   // ProtocolManager manager;

    @Override
    public void onEnable() {
        instance = this;

        log.info("ZZCore Enabled");
        log.info("Developed by BM");

//        getCommand("zzcore").setExecutor(new zzcoreCMD());
//        getCommand("gm4").setExecutor(new gm4CMD());
//        getCommand("brevity").setExecutor(new brevityCMD());
//        getCommand("scripts").setExecutor(new scriptsCMD());

        // НЕ РАБОТАЕТ Я ХУЙ ЗНАЕТ ПОЧ
        Funcs.regCommands(this, "zzcore", new zzcoreCMD());
//        Funcs.regCommands(this, "gm4", new gm4CMD());
//        Funcs.regCommands(this, "brevity", new brevityCMD());
        Funcs.regCommands(this, "scripts", new scriptsCMD());



//        getCommand("tess").setExecutor(new tessCMD());

        getServer().getPluginManager().registerEvents(new SpawnEvent(), this);
//        getServer().getPluginManager().registerEvents(new GMChangeEvent(), this);
        getServer().getPluginManager().registerEvents(new TPEvent(), this);
        getServer().getPluginManager().registerEvents(new worldborder(), this);

//        getServer().getPluginManager().registerEvents(new hbsysEvent(), this);

//        OfflineServer.initOS();
//        getServer().getPluginManager().registerEvents(new OfflineServer(), this);
//        getCommand("offline").setExecutor(new OfflineServer());

        FileUtils.setup();


        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Main.getInstance().getServer().getScheduler().runTaskTimer(Main.getInstance(), ()-> {
            if(!TPEvent.used.get()) {
                // 0
                Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 69.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
                Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 69.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
                Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 69.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
                Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 69.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            }
            // 1
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2487.4 + 2486.6) / 2, 88.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2487.4 + 2486.6) / 2, 88.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2487.4 + 2486.6) / 2, 88.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2487.4 + 2486.6) / 2, 88.5, (4331.4 + 4332.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));

            // 8
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 98.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 98.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 98.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 98.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.AQUA, 1.0F));

            // 9
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 108.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.RED, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 108.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.RED, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 108.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.RED, 1.0F));
            Bukkit.getWorld("world").spawnParticle(Particle.REDSTONE, new Location(Bukkit.getWorld("world"), (2483.4 + 2482.6) / 2, 108.5, (4327.4 + 4328.4) / 2), 2, new Particle.DustOptions(Color.RED, 1.0F));

            // if(!TPEvent.used.get()){
           //     for (Player p : getServer().getOnlinePlayers()){
           //         TPEvent.spiral(p);
           //     }
//
           // }
        }, 0L, 10L);


      //  manager = ProtocolLibrary.getProtocolManager();
    }

    public static Main getInstance() {
        return instance;
    }





}