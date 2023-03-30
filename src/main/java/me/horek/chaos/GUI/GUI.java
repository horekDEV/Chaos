package me.horek.chaos.GUI;

import me.horek.chaos.Main;
import me.horek.chaos.Util.Util;
import me.horek.chaos.event.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryClickEvent;
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

    public class GuiEvent {
        @EventHandler
        public void onClick(InventoryClickEvent event) {
            if (event.getInventory().equals(GUI.instance.inventory)) {
                event.setCancelled(true);
            }

            if (event.getCurrentItem().equals(12)) {
                event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin start"));
                Bukkit.getServer().getPluginManager().registerEvents(new ChaosEvent(), Main.instance);
                
            } else if (event.getCurrentItem().equals(14)) {
                event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlugin start"));
                HandlerList.unregisterAll(new ChaosEvent());
            }
        }
    }

}
