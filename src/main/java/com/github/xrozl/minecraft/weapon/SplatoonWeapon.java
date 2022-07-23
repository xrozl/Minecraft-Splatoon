package com.github.xrozl.minecraft.weapon;

import org.bukkit.Material;

public class SplatoonWeapon {

    private String name;
    private String id;
    private String description;

    private Material material;

    public SplatoonWeapon(String name, String id, String description, Material material) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Material getMaterial() {
        return material;
    }


}
