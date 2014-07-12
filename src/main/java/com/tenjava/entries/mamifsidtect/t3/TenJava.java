package com.tenjava.entries.mamifsidtect.t3;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.tenjava.entries.mamifsidtect.t3.listeners.RandomCommonBlockDrops;
import com.tenjava.entries.mamifsidtect.t3.listeners.RandomCommonMobDrops;
import com.tenjava.entries.mamifsidtect.t3.listeners.RandomNegativePotionEffects;
import com.tenjava.entries.mamifsidtect.t3.listeners.RandomPositivePotionEffects;
import com.tenjava.entries.mamifsidtect.t3.listeners.RandomRareBlockDrops;
import com.tenjava.entries.mamifsidtect.t3.listeners.RandomRareMobDrops;

public class TenJava extends JavaPlugin {
	
	public void onEnable() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		pm.registerEvents(new RandomRareMobDrops(), this);
		pm.registerEvents(new RandomRareBlockDrops(), this);
		pm.registerEvents(new RandomCommonMobDrops(), this);
		pm.registerEvents(new RandomCommonBlockDrops(), this);
		pm.registerEvents(new RandomNegativePotionEffects(), this);
		pm.registerEvents(new RandomPositivePotionEffects(), this);
		
		getLogger().info("TenJava plugin for mamifsidtect is loaded!");
	}
	
	public void onDisable() {
		
		getLogger().info("TenJava plugin for mamifsidtect has been unloaded!");
		
	}
}
