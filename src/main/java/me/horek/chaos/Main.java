package me.horek.chaos;

import me.horek.chaos.GUI.GUI;
import me.horek.chaos.commands.ChaosCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("plugin " + getLogger().getName() + " was start");

        getCommand("chaos").setExecutor(new ChaosCMD());
        getServer().getPluginManager().registerEvents(new GUI.GuiEvent(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin " + getLogger().getName() + " was stop");
    }
}
