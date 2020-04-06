package me.Defracted.TabComplete;

import me.Defracted.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaunchTabcompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> completions = new ArrayList<>();
        List<String> commands = new ArrayList<>();

        if (args.length == 1) {
            List<Integer> IntArray = new ArrayList<>();

            for (int i = 2; i <= 10; i++) {
                IntArray.add(i);
            }

            IntArray.forEach(num -> {
                commands.add("" + num);
            });

            StringUtil.copyPartialMatches(args[0], commands, completions);
            completions.sort(Utils.ALPHABETICAL_ORDER); // Надо как-то пофиксить сортировку, как-то не оченб выглядит
        }

//        Collections.sort(completions);
        return completions;
    }
}