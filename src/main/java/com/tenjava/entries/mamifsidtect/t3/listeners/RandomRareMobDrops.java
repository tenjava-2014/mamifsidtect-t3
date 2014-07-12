package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Witch;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomRareMobDrops implements Listener {

	@EventHandler
	public void onWitchDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Witch) {
			if (event.getEntity().getKiller() instanceof Player) {
				Player p = (Player) event.getEntity().getKiller();
				if (new Random().nextInt(100) <= 85) {
					event.getDrops().add(new ItemStack(Material.STICK));
				} else if (new Random().nextInt(100) <= 86 && new Random().nextInt(100) >= 93) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
					event.getDrops().add(new ItemStack(Material.EYE_OF_ENDER));
				} else if (new Random().nextInt() <= 94 && new Random().nextInt(100) >= 100) {
					event.getDrops().add(new ItemStack(Material.EYE_OF_ENDER));
					event.getDrops().add(new ItemStack(Material.BLAZE_ROD));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
				}
			}
		}
	}
	
	@EventHandler
	public void onSnowGolemDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Snowman) {
			if (event.getEntity().getKiller() instanceof Player) {
				Player p = (Player) event.getEntity().getKiller();
				if (new Random().nextInt(100) <= 85) {
					event.getDrops().add(new ItemStack(Material.STICK));
				} else if (new Random().nextInt(100) <= 86 && new Random().nextInt(100) >= 93) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
					event.getDrops().add(new ItemStack(Material.PUMPKIN, 3));
				} else if (new Random().nextInt() <= 94 && new Random().nextInt(100) >= 100) {
					event.getDrops().add(new ItemStack(Material.SNOW_BALL, 7));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
				}
			}
		}
	}
	
	@EventHandler
	public void onIronGolemDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof IronGolem) {
			if (event.getEntity().getKiller() instanceof Player) {
				Player p = (Player) event.getEntity().getKiller();
				if (new Random().nextInt(100) <= 85) {
					event.getDrops().add(new ItemStack(Material.STICK));
				} else if (new Random().nextInt(100) <= 86 && new Random().nextInt(100) >= 93) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
					event.getDrops().add(new ItemStack(Material.IRON_INGOT, 3));
				} else if (new Random().nextInt() <= 94 && new Random().nextInt(100) >= 100) {
					event.getDrops().add(new ItemStack(Material.IRON_INGOT, 7));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
				}
			}
		}
	}
}
