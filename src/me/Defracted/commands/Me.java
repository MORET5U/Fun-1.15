package me.Defracted.commands;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class Me implements CommandExecutor {
    private Random random = new Random();

    private boolean isSuccess() {
        return random.nextBoolean();
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("me")) {
            if (sender instanceof Player) {
                Player issuer = (Player) sender;

                World issuerWorld = issuer.getWorld();
                boolean isCompleted = isSuccess();

                if (args.length <= 0) {
                    issuer.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cТак а что вы сделали-то?"));
                } else {
                    String action = String.join(" ", args);
                    String formattedAction = ChatColor.translateAlternateColorCodes('&', "&a* &r" + issuer.getName() + " " + action + " &a*");

                    String finalFormattedAction;

                    if (isCompleted) {
                        finalFormattedAction = formattedAction + " " + ChatColor.translateAlternateColorCodes('&', "&2[УСПЕШНО]");
                    } else {
                        finalFormattedAction = formattedAction + " " + ChatColor.translateAlternateColorCodes('&', "&c[НЕУСПЕШНО]");
                    }

                    issuerWorld.getPlayers().forEach(player -> player.sendMessage(finalFormattedAction));
                }
            }

            return true;
        }

        return false;
    }
}

