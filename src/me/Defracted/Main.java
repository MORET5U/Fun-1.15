package me.Defracted;

import me.Defracted.commands.Fart;
import me.Defracted.commands.Joke;
import me.Defracted.commands.Me;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("fart").setExecutor(new Fart());
        this.getCommand("joke").setExecutor(new Joke());
        this.getCommand("me").setExecutor(new Me());
    }

    @Override
    public void onDisable() {
    }
}


