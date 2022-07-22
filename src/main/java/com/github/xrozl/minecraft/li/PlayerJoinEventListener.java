package com.github.xrozl.minecraft.li;

import com.github.xrozl.minecraft.Splatoon;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEventListener implements Listener {
    private final Splatoon plugin;
    public PlayerJoinEventListener(Splatoon splatoon) {
        plugin = splatoon;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage(ChatColor.YELLOW + e.getPlayer().getName() + " がサーバーに参加しました。");
    }
}
