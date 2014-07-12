package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomPositivePotionEffects implements Listener {

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		
		PotionEffectType pType = null;
		Random randomPotion = new Random();
		Integer potionType = randomPotion.nextInt() + 1;
		
		if (potionType == 1) {
			pType = PotionEffectType.DAMAGE_RESISTANCE;
		} else if (potionType == 2) {
			pType = PotionEffectType.HEALTH_BOOST;
		} else if (potionType == 3) {
			pType = PotionEffectType.FAST_DIGGING;
		} else if (potionType == 4) {
			pType = PotionEffectType.SATURATION;
		} else if (potionType == 5) {
			pType = PotionEffectType.ABSORPTION;
		} else if (potionType == 6) {
			pType = PotionEffectType.FIRE_RESISTANCE;
		} else if (potionType == 7) {
			pType = PotionEffectType.HEAL;
		} else if (potionType == 8) {
			pType = PotionEffectType.INCREASE_DAMAGE;
		} else if (potionType == 9) {
			pType = PotionEffectType.REGENERATION;
		} else if (potionType == 10) {
			pType = PotionEffectType.SPEED;
		}
		
		if (p.getActivePotionEffects().isEmpty()) {
			p.addPotionEffect(new PotionEffect(pType, 400, 1));
		}
	}
}
