package com.github.xrozl.minecraft.mg;

import com.github.xrozl.minecraft.weapon.SplatoonWeapon;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserWeaponManager {

    private Map<UUID, SplatoonWeapon> weaponMap;

    public UserWeaponManager() {
        weaponMap = new HashMap<>();
    }

    public void setWeapon(UUID uuid, SplatoonWeapon weapon) {
        weaponMap.put(uuid, weapon);
    }

    public SplatoonWeapon getWeapon(UUID uuid) {
        return weaponMap.get(uuid);
    }

}
