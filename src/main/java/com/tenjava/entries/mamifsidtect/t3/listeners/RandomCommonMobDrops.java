package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RandomCommonMobDrops implements Listener {
	
	@EventHandler
	public void onZombieDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Zombie) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) + 1 <= 90) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.ROTTEN_FLESH, 3));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
					
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.BLAZE_ROD, 1));
					newDrops.add(new ItemStack(Material.ROTTEN_FLESH, 3));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
					
				} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.ROTTEN_FLESH, 3));
					newDrops.add(new ItemStack(Material.BLAZE_ROD, 1));
					newDrops.add(new ItemStack(Material.GOLD_INGOT, 1));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
					
				}
			}
		}
	}
	
	@EventHandler
	public void onSkeletonDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Skeleton) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) <= 20) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.BONE, 2));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
				} else if (new Random().nextInt(100) + 1 >= 21 && new Random().nextInt(100) + 1 <= 40) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.BONE, 2));
					newDrops.add(new ItemStack(Material.BOW, 1));
					newDrops.add(new ItemStack(Material.ARROW, 4));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
				} else if (new Random().nextInt(100) + 1 >= 41 && new Random().nextInt(100) + 1 <= 100) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.BONE, 2));
					newDrops.add(new ItemStack(Material.BOW, 1));
					newDrops.add(new ItemStack(Material.ARROW, 4));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
					Skeleton ghost = (Skeleton) event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.SKELETON); {
						ghost.setHealth(10);
						ghost.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 15000, 3));
						ghost.setCustomName(ChatColor.YELLOW + "Skeleton Ghost");
						ghost.setCustomNameVisible(true);
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onCreeperDeath(EntityDeathEvent event) {
		if (event.getEntity() instanceof Creeper) {
			if (event.getEntity().getKiller() instanceof Player) {
				if (new Random().nextInt(100) + 1 <= 90) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.SULPHUR, 2));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.SULPHUR, 4));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
				} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					ArrayList<ItemStack> newDrops = new ArrayList<ItemStack>();
					newDrops.add(new ItemStack(Material.SULPHUR, 7));
					event.getDrops().clear();
					event.getDrops().addAll(newDrops);
					TNTPrimed tnt = (TNTPrimed) event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.PRIMED_TNT); {
						tnt.setFuseTicks(10);
						tnt.setIsIncendiary(true);
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
			if (event.getEntity().getKiller() instanceof Player) {
				Player killer = (Player) event.getEntity().getKiller();
				if (new Random().nextInt(100) + 1 <= 90) {
					event.getDrops().clear();
					killer.giveExp(event.getEntity().getTotalExperience());
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					killer.giveExp(event.getEntity().getTotalExperience());
				} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
				}
			}
		}
}
