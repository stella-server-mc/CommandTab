package com.github.huda0209.commandtab;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commandtab extends JavaPlugin implements CommandExecutor {

    static String pluginName = "CommandTab";

    @Override
    public void onEnable() {

        getLogger().info("=============================");
        getLogger().info("Enable This Plugin");
        getLogger().info("plugin name : " + pluginName);
        getLogger().info("=============================");

    }

    @Override
    public void onDisable() {
        getLogger().info(pluginName + "was disable.");
    }
}