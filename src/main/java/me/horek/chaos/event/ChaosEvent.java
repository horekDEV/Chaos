package me.horek.chaos.event;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ChaosEvent implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Random random = new Random();
        Block block = event.getBlock();

        block.setType(Material.AIR, false);

        block.getWorld().dropItem(block.getLocation(), new ItemStack(Material.values()[random.nextInt(Material.values().length - 1)], 1));
    }
}
