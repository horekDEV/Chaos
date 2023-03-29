package me.horek.chaos.Util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Util {
    public static ItemStack createItemStack(Material material, String name, String lore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(name);
        itemMeta.setLore(Collections.singletonList(String.valueOf(lore)));
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
