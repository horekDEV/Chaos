package me.horek.chaos;

import me.horek.chaos.commands.ChaosGame;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        ChaosGame game = new ChaosGame();

        getCommand("chaos").setExecutor(game);
        getServer().getPluginManager().registerEvents(game, this);
        System.out.println("Hello");

    }

    @Override
    public void onDisable() {
        System.out.println("Bye");
    }
}
