package me.Defracted.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fart implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("fart")) {
            if (sender instanceof Player) {
                Player issuer = (Player) sender;

                Location location = issuer.getLocation();
                World world = issuer.getWorld();

                issuer.playSound(location, Sound.ENTITY_WITHER_BREAK_BLOCK, 100F, 1f);
                world.strikeLightning(location);
                world.createExplosion(location, 10F, true);

                String message = ChatColor.RESET + issuer.getName() + ChatColor.YELLOW + " > " + ChatColor.RED +
                        "Игрок " + ChatColor.YELLOW + issuer.getName() + ChatColor.RED +
                        " только что бзднул так, что аж пол карты разнесло...";
                world.getPlayers().forEach(p -> p.sendMessage(message));
            }
            return true;
        }

        return false;
    }
}
