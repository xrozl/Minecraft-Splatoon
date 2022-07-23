package com.github.xrozl.minecraft;

import com.github.xrozl.minecraft.li.PlayerJoinEventListener;
import com.github.xrozl.minecraft.mg.UserWeaponManager;
import com.github.xrozl.minecraft.mg.WeaponManager;
import com.github.xrozl.minecraft.weapon.SplatoonWeapon;
import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Splatoon extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        System.out.println("Splatoon is enabled!");

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinEventListener(this), this);

        UserWeaponManager uwm = new UserWeaponManager();
        WeaponManager wm = new WeaponManager(this, uwm);
        // 武器登録 (武器名, 武器クラス)
        wm.addWeapon(new SplatoonWeapon("スプラシューター", "shooter1", "スプラシューターです。", Material.STICK));

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
