package me.Defracted.commands;

import me.Defracted.Utils;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Launch implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("launch")) {
            if (sender instanceof Player) {
                Player issuer = (Player) sender;

                if (args.length <= 0) {
                    issuer.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            "&cВам нужно указать дальность полёта от 2 до 10."));

                    return true;
                }

                String argument = args[0];

                if (!Utils.isNum(argument)) {
                    issuer.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            "&cАргумент команды должен являться числом!"));

                    return true;
                }

                int pushingAmount = Integer.parseInt(argument);

                if (pushingAmount > 1 && pushingAmount < 11) {
                    issuer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5 * 20, 5));
                    issuer.setVelocity(issuer.getLocation().getDirection().multiply(pushingAmount).setY(pushingAmount));

                    return true;
                } else {
                    issuer.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            "&cВам нужно указать дальность полёта от 2 до 10."));
                }


            }

            return true;
        }

        return false;
    }
}
