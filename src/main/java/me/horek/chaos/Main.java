package me.horek.chaos;

import me.horek.chaos.commands.ChaosCMD;
import me.horek.chaos.event.ChaosEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("plugin " + getLogger().getName() + " was start");

        getCommand("chaos").setExecutor(new ChaosCMD());
        getServer().getPluginManager().registerEvents(new ChaosEvent(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin " + getLogger().getName() + " was stop");
    }
}
