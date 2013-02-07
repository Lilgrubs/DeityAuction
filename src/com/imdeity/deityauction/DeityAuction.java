package com.imdeity.deityauction;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class DeityAuction extends JavaPlugin {
	
	Logger logger = Logger.getLogger("Minecraft");
	public void onEnable() {
		logger.info("[DeityAuction] DeityAuction is now enabled!");
	}
	
	public void onDisable() {
		logger.info("[DeityAuction] DeityAuction is now disabled!");
	}
}
