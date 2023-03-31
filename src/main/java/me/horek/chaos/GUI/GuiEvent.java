package me.horek.chaos.GUI;

import me.horek.chaos.Main;
import me.horek.chaos.event.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiEvent implements Listener {
    ChaosEvent chaosEvent = new ChaosEvent();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getInventory().equals(GUI.instance.inventory)) {
            event.setCancelled(true);
        }

        if (event.getCurrentItem().equals(12)) {
            event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aPlugin start"));
            Bukkit.getServer().getPluginManager().registerEvents(chaosEvent, Main.instance);

        } else if (event.getCurrentItem().equals(14)) {
            event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlugin start"));
            HandlerList.unregisterAll(chaosEvent);
        }
    }
}
