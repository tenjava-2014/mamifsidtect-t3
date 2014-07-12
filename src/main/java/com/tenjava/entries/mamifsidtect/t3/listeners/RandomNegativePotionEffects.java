package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomNegativePotionEffects implements Listener {
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player p = event.getPlayer();
		
		PotionEffectType pType = null;
		Random randomPotion = new Random();
		Integer potionType = randomPotion.nextInt(1000000) + 1;
		Integer amplifier = null;
		
		if (potionType == 1) {
			pType = PotionEffectType.BLINDNESS;
			amplifier = 2;
		} else if (potionType == 2) {
			pType = PotionEffectType.CONFUSION;
			amplifier = 2;
		} else if (potionType == 3) {
			pType = PotionEffectType.HARM;
			amplifier = 1;
		} else if (potionType == 4) {
			pType = PotionEffectType.HUNGER;
			amplifier = 1;
		} else if (potionType == 5) {
			pType = PotionEffectType.JUMP;
			amplifier = -1;
		} else if (potionType == 6) {
			pType = PotionEffectType.POISON;
			amplifier = 2;
		} else if (potionType == 7) {
			pType = PotionEffectType.SLOW;
			amplifier = 2;
		} else if (potionType == 8) {
			pType = PotionEffectType.SLOW_DIGGING;
			amplifier = 1;
		} else if (potionType == 9) {
			pType = PotionEffectType.WEAKNESS;
			amplifier = 3;
		} else if (potionType == 10) {
			pType = PotionEffectType.WITHER;
			amplifier = 1;
		}
		
		if (potionType <= 10 && potionType >= 1) {
			if (p.getActivePotionEffects().isEmpty()) {
				p.addPotionEffect(new PotionEffect(pType, 400, amplifier));
			}	
		}
	}
}
