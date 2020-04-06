package me.Defracted;

import me.Defracted.TabComplete.LaunchTabcompleter;
import me.Defracted.commands.Fart;
import me.Defracted.commands.Joke;
import me.Defracted.commands.Launch;
import me.Defracted.commands.Me;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("fart")).setExecutor(new Fart());
        Objects.requireNonNull(this.getCommand("joke")).setExecutor(new Joke());
        Objects.requireNonNull(this.getCommand("me")).setExecutor(new Me());

        this.getCommand("launch").setExecutor(new Launch());
        this.getCommand("launch").setTabCompleter(new LaunchTabcompleter());
    }

    @Override
    public void onDisable() {
    }
}


