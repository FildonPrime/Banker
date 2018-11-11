package me.fildon.Banker;

import me.fildon.Banker.utils.utilmain;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class banker extends JavaPlugin {
    private static banker instance;

    public static synchronized banker getInstance() {
        if(instance == null) {
            instance = new banker();
        }
        return instance;
    }

    @Override
    public void onEnable() {
        utilmain.getInstance().logger(ChatColor.GREEN + "Plugin Enabled");
    }


    @Override
    public void onDisable() {

    }





















}
