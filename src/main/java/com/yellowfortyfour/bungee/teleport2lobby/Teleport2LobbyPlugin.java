package com.yellowfortyfour.bungee.teleport2lobby;

import com.yellowfortyfour.bungee.teleport2lobby.config.PluginConfig;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;
import org.bstats.bungeecord.Metrics;

public class Teleport2LobbyPlugin extends Plugin
{
	@SuppressWarnings("unused")
	@Override
	public void onEnable()
	{
		PluginConfig config = null;
		try
		{
			config = new PluginConfig(this);
			getProxy().getPluginManager().registerCommand(this, new TeleportCommand(this, config));
		}
		catch(RuntimeException e)
		{
			getLogger().severe(ChatColor.RED + "" + ChatColor.BOLD + "Can't start the plugin! (" + e.getMessage() + ")" + ChatColor.RESET);
			return;
		}
		 
		if(!config.getDisablebStats())
		{	 
			Metrics metrics = new Metrics(this);
		} 
	}
}
