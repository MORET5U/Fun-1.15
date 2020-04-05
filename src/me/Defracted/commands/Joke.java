package me.Defracted.commands;

import me.Defracted.Jokes;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Joke implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("joke")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                player.sendMessage("" + ChatColor.GOLD + Jokes.throwJoke(Jokes.DumbJokes));
                player.playSound(player.getLocation(), Sound.ENTITY_CAT_AMBIENT, 1f, 1f);
            }
            return true;
        }


        return false;
    }

}
