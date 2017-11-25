package com.yellowfortyfour.bungee.teleport2lobby;

import com.yellowfortyfour.bungee.teleport2lobby.config.PluginConfig;

import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

public class TeleportCommand extends Command
{
	private final Plugin plugin;
	private final PluginConfig config;
	private ProxiedPlayer player;
	private ServerInfo targetServer;
	
	public TeleportCommand(Plugin plugin)
	{
		super("lobby","teleport2lobby.lobby",new String[0]);
		
		this.plugin = plugin;        
        this.config = new PluginConfig(plugin);
	}

	@Override
	public void execute(CommandSender sender, String[] args) 
	{
		if(!(sender instanceof ProxiedPlayer))
		{
			sender.sendMessage(new ComponentBuilder("This command can only be run by a player!").color(ChatColor.RED).create());
			return;
		}
		player = (ProxiedPlayer) sender;
		
		if(player.getServer().getInfo().getName().equalsIgnoreCase(config.getLobbyServer()))
		{
			player.sendMessage(new ComponentBuilder("You are already connected to the server!").color(ChatColor.RED).create());
			return;
		}
		
		targetServer = ProxyServer.getInstance().getServerInfo(config.getLobbyServer());
		targetServer.ping(new Callback<ServerPing>() {
			public void done(ServerPing arg0, Throwable arg1) 
			{
				if(arg0 == null)
				{
					// no response from lobby
					player.sendMessage(new ComponentBuilder(config.getLobbyServer() + " is not responding, you can't go there..").color(ChatColor.RED).create());
					return;
				}
				plugin.getLogger().info("Sending " + player.getName() + " to " + targetServer.getName());
				player.connect(targetServer);
			}});
	}
}