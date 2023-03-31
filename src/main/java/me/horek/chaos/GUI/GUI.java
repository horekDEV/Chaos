package me.horek.chaos.GUI;

import me.horek.chaos.Util.Util;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class GUI {
    public static GUI instance = new GUI();
    public Inventory inventory = Bukkit.createInventory(null, 27, "Chaos");

    GUI() {
        for (int i = 0; i < inventory.getSize(); i++) {
            inventory.setItem(i, Util.createItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", " "));
        }

        inventory.setItem(12, Util.createItemStack(Material.GREEN_BED, "start", "start a chaos game"));
        inventory.setItem(14, Util.createItemStack(Material.RED_BED, "stop", "stop a chaos game"));
    }
}
