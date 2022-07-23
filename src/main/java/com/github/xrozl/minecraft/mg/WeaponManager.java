package com.github.xrozl.minecraft.mg;

import com.github.xrozl.minecraft.Splatoon;
import com.github.xrozl.minecraft.weapon.SplatoonWeapon;

import java.util.ArrayList;
import java.util.List;

public class WeaponManager {

    private Splatoon splatoon;
    private UserWeaponManager uwm;

    private List<SplatoonWeapon> weapons;

    public WeaponManager(Splatoon splatoon, UserWeaponManager uwm) {
        this.splatoon = splatoon;
        this.uwm = uwm;

        weapons = new ArrayList<>();
    }

    public void addWeapon(SplatoonWeapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(SplatoonWeapon weapon) {
        weapons.remove(weapon);
    }

    public void removeWeapon(String name) {
        for (SplatoonWeapon weapon : weapons) {
            if (weapon.getName().equals(name)) {
                weapons.remove(weapon);
                return;
            }
        }
    }

    public void removeWeapon(int index) {
        weapons.remove(index);
    }

    public void removeAllWeapons() {
        weapons.clear();
    }

    public SplatoonWeapon getWeapon(String name) {
        for (SplatoonWeapon weapon : weapons) {
            if (weapon.getName().equals(name)) {
                return weapon;
            }
        }
        return null;
    }

    public SplatoonWeapon getWeapon(int index) {
        return weapons.get(index);
    }

    public List<SplatoonWeapon> getWeapons() {
        return weapons;
    }

}
