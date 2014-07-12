package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomRareBlockDrops implements Listener {
	
	@EventHandler
	public void onPlayerDiamondOreBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		Block b = event.getBlock();
		if (b.getType() == Material.DIAMOND_ORE) {
			if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
				Random r = new Random();
				Integer chance = r.nextInt(100) - 3;
				if (chance >= 80) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND));
				
				} else if (chance >= 81 && chance <= 95) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND, 2));
					playFirework(p);
				
				} else if (chance >= 96 && chance <= 100) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND, 5));
					playFirework(p);
					Zombie zombie = (Zombie) b.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE); {
						zombie.setBaby(true);
						zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15000, 2));
						zombie.setCustomName(ChatColor.AQUA + "Diamond Guard");
						zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
						zombie.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
						zombie.getEquipment().setItemInHand(new ItemStack(Material.IRON_AXE));
						zombie.setCustomNameVisible(true);						
					}
				}
			}
		}
	}
	
	public void playFirework(Player player) {
		Color color = null;
		Random randomColor = new Random();
		Integer fireworkColor = randomColor.nextInt(10) + 1;
		
		if (fireworkColor == 1) {
			color = Color.LIME;
		}
		else if (fireworkColor == 2) {
			color = Color.ORANGE;
		}
		else if (fireworkColor == 3) {
			color = Color.PURPLE;
		}
		else if (fireworkColor == 4) {
			color = Color.WHITE;
		}
		else if (fireworkColor == 5) {
			color = Color.AQUA;
		}
		else if (fireworkColor == 6) {
			color = Color.TEAL;
		}
		else if (fireworkColor == 7) {
			color = Color.BLUE;
		}
		else if (fireworkColor == 8) {
			color = Color.FUCHSIA;
		}
		else if (fireworkColor == 9) {
			color = Color.YELLOW;
		}
		else if (fireworkColor == 10) {
			color = Color.RED;
		}
		
		Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(), EntityType.FIREWORK);
		FireworkMeta fwmeta = fw.getFireworkMeta();
		FireworkEffect.Builder builder = FireworkEffect.builder();
		builder.withTrail();
		builder.withColor(color);
		builder.withFade(color);
		builder.with(FireworkEffect.Type.STAR);
		fwmeta.addEffects(new FireworkEffect[] {builder.build()});
		fwmeta.setPower(1 / 10);
		fw.setFireworkMeta(fwmeta);
	}
}
