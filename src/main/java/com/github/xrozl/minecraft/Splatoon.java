package com.github.xrozl.minecraft;

import com.github.xrozl.minecraft.li.PlayerJoinEventListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Splatoon extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        System.out.println("Splatoon is enabled!");

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinEventListener(this), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
