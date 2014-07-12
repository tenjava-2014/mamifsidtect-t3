package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class RandomCommonMobDrops implements Listener {

	@EventHandler
	public void onZombieDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Zombie) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) <= 90) {
					
				} else if (new Random().nextInt(100) >= 91 && new Random().nextInt(100) <= 96) {
					
				} else if (new Random().nextInt(100) >= 97 && new Random().nextInt(100) <= 100) {
					
				}
			}
		}
	}
	
	@EventHandler
	public void onSkeletonDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Skeleton) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) <= 90) {
					
				} else if (new Random().nextInt(100) >= 91 && new Random().nextInt(100) <= 96) {
					
				} else if (new Random().nextInt(100) >= 97 && new Random().nextInt(100) <= 100) {
					
				}
			}
		}
	}
	
	@EventHandler
	public void onCreeperDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Creeper) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) <= 90) {
					
				} else if (new Random().nextInt(100) >= 91 && new Random().nextInt(100) <= 96) {
					
				} else if (new Random().nextInt(100) >= 97 && new Random().nextInt(100) <= 100) {
					
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Player) {
			if (!(event.getEntity().getKiller() instanceof Player)) {
				if (new Random().nextInt(100) <= 90) {
					
				} else if (new Random().nextInt(100) >= 91 && new Random().nextInt(100) <= 96) {
					
				} else if (new Random().nextInt(100) >= 97 && new Random().nextInt(100) <= 100) {
					
				}
			}
		}
	}
}
