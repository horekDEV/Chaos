package me.horek.chaos.commands;

import me.horek.chaos.GUI.GUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class ChaosCMD implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (player.isOp()) {
            player.openInventory(GUI.instance.inventory);
            return true;
        }

        return false;
    }
}
