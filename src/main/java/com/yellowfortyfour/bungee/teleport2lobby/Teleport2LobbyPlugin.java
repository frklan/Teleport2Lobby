package com.yellowfortyfour.bungee.teleport2lobby;

import net.md_5.bungee.api.plugin.Plugin;

public class Teleport2LobbyPlugin extends Plugin
{
	 @Override
	 public void onEnable()
	 {
		 getProxy().getPluginManager().registerCommand(this, new TeleportCommand(this));
	 }
}
