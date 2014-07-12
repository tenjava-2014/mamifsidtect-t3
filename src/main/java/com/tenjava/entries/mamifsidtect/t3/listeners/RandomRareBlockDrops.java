package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
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
			if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE || p.getItemInHand().getType() == Material.IRON_PICKAXE) {
				if (new Random().nextInt(100) -2 <= 80) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND));
				
				} else if (new Random().nextInt(100) -2 >= 81 && new Random().nextInt(100) -2 <= 95) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND, 2));
					playFirework(b.getLocation());
				
				} else if (new Random().nextInt(100) -2 >= 96 && new Random().nextInt(100) -2 <= 100) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.DIAMOND, 5));
					playFirework(b.getLocation());
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
	
	@EventHandler
	public void onPlayerGoldOreBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		Block b = event.getBlock();
		if (b.getType() == Material.GOLD_ORE) {
			if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE || p.getItemInHand().getType() == Material.IRON_PICKAXE) {
				
				if (new Random().nextInt(100) -2 <= 80) {
					b.getDrops().add(new ItemStack(Material.GOLD_ORE));
				
				} else if (new Random().nextInt(100) -2 >= 81 && new Random().nextInt(100) -2 <= 94) {
					b.getDrops().add(new ItemStack(Material.GOLD_ORE, 1));
					playFirework(b.getLocation());
				
				} else if (new Random().nextInt(100) -2 >= 95 && new Random().nextInt(100) -2 <= 100) {
					b.getDrops().add(new ItemStack(Material.GOLD_ORE, 4));
					playFirework(b.getLocation());
					Zombie zombie = (Zombie) b.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE); {
						zombie.setBaby(true);
						zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15000, 2));
						zombie.setCustomName(ChatColor.GOLD + "Gold Guard");
						zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
						zombie.getEquipment().setItemInHand(new ItemStack(Material.IRON_AXE));
						zombie.setCustomNameVisible(true);						
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerEmeraldOreBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		Block b = event.getBlock();
		if (b.getType() == Material.EMERALD_ORE) {
			if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE || p.getItemInHand().getType() == Material.IRON_PICKAXE) {
				if (new Random().nextInt(100) -2 <= 70) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.EMERALD));
					playFirework(b.getLocation());
				} else if (new Random().nextInt(100) -2 >= 71 && new Random().nextInt(100) -2 <= 91) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.EMERALD, 2));
					playFirework(b.getLocation());
				} else if (new Random().nextInt(100) -2 >= 92 && new Random().nextInt(100) -2 <= 100) {
					b.getDrops().clear();
					b.getDrops().add(new ItemStack(Material.EMERALD, 5));
					playFirework(b.getLocation());
					Zombie zombie = (Zombie) b.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE); {
						zombie.setBaby(true);
						zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15000, 2));
						zombie.setCustomName(ChatColor.GREEN + "Emerald Guard");
						zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
						zombie.getEquipment().setItemInHand(new ItemStack(Material.STONE_AXE));
						zombie.setCustomNameVisible(true);
					}
				}
			}
		}
	}
	
	public void playFirework(Location loc) {
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
		
		Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
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
