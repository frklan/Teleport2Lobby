package com.yellowfortyfour.bungee.teleport2lobby.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import lombok.Getter;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

public class PluginConfig
{
	private Plugin plugin;
  
	@Getter
	private String lobbyServer;
	
	@Getter
	private Boolean disablebStats = false;
	
	private Configuration configuration = null;
  
	public PluginConfig(Plugin plugin)
	{
		this.plugin = plugin;
		reloadConfiguration();
	}

	public void reloadConfiguration()
	{
		try
		{
			configuration = ConfigurationProvider.getProvider(YamlConfiguration.class).load(createOrLoadConfigFile("config.yml"));
		}
		catch (IOException eror)
		{
			throw new RuntimeException("Could not load config", eror);
		}

		if(!configuration.getString("version").equalsIgnoreCase("1.1"))
		{
			// unkown file-format.
			throw new RuntimeException("Unknown config file, please erase and restart BungeeCord.");
		}

		lobbyServer = configuration.getString("lobby-server");
		if(lobbyServer.isEmpty())
		{
			throw new RuntimeException("'lobby-server' missing in config file.");
		}
		
		disablebStats = configuration.getBoolean("disableServerMetrics");
	}
  
  
	private File createOrLoadConfigFile(String file) throws IOException
	{
		File cfg = new File(plugin.getDataFolder(), file);
		
		if (!cfg.exists())
		{
			plugin.getDataFolder().mkdir();
			try (InputStream is = plugin.getResourceAsStream(file))
			{
				Files.copy(is, cfg.toPath());
			}
		}
		return cfg;
	}
}