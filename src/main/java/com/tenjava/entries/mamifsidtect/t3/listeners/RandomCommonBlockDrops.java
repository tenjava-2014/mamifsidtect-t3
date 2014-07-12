package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Tree;

public class RandomCommonBlockDrops implements Listener {

	@EventHandler
	public void onDirtDestroy(BlockBreakEvent event) {
		Block b = event.getBlock();
		Player p = event.getPlayer();
		if (b.getType() == Material.DIRT) {
			if (p.getItemInHand().getType() == Material.WOOD_SPADE 
			|| p.getItemInHand().getType() == Material.STONE_SPADE 
			|| p.getItemInHand().getType() == Material.IRON_SPADE 
			|| p.getItemInHand().getType() == Material.DIAMOND_SPADE 
			|| p.getItemInHand().getType() == Material.GOLD_SPADE) {
				if (new Random().nextInt(100) + 1 <= 80) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.DIRT));
					
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.DIRT, 3));
					
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.DIRT, 5));
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.STONE, 2));
					
				}
			}
		}
	}
	
	@EventHandler
	public void onGrassDestroy(BlockBreakEvent event) {
		Block b = event.getBlock();
		Player p = event.getPlayer();
		if (b.getType() == Material.GRASS) {
			if (p.getItemInHand().getType() == Material.WOOD_SPADE 
			|| p.getItemInHand().getType() == Material.STONE_SPADE 
			|| p.getItemInHand().getType() == Material.IRON_SPADE 
			|| p.getItemInHand().getType() == Material.DIAMOND_SPADE 
			|| p.getItemInHand().getType() == Material.GOLD_SPADE) {
				if (new Random().nextInt(100) + 1 <= 80) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GRASS));
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GRASS, 3));
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.GRASS, 10));
				}
			}
		}
	}
	
	@EventHandler
	public void onStoneDestroy(BlockBreakEvent event) {
		Block b = event.getBlock();
		Player p = event.getPlayer();
		if (b.getType() == Material.STONE) {
			if (p.getItemInHand().getType() == Material.WOOD_PICKAXE 
			|| p.getItemInHand().getType() == Material.STONE_PICKAXE 
			|| p.getItemInHand().getType() == Material.IRON_PICKAXE 
			|| p.getItemInHand().getType() == Material.DIAMOND_PICKAXE 
			|| p.getItemInHand().getType() == Material.GOLD_PICKAXE) {
				if (new Random().nextInt(100) + 1 <= 80) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.STONE, 1));
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.STONE, 3));
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.STONE, 10));
				}
			}
		}
	}
	
	@EventHandler
	public void onCommonOresBreak(BlockBreakEvent event) {
		Block b = event.getBlock();
		Player p = event.getPlayer();
		if (b.getType() == Material.IRON_ORE) {
			if (p.getItemInHand().getType() == Material.STONE_PICKAXE
				|| p.getItemInHand().getType() == Material.IRON_PICKAXE
				|| p.getItemInHand().getType() == Material.DIAMOND_AXE) {
				if (new Random().nextInt(100) + 1 <= 95) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.IRON_ORE));
				} else if (new Random().nextInt(100) + 1 >= 96 && new Random().nextInt(100) + 1 <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.IRON_ORE, 9));
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.IRON_INGOT));
				}
			}
		} else if (b.getType() == Material.COAL_ORE) {
			if (p.getItemInHand().getType() == Material.STONE_PICKAXE
				|| p.getItemInHand().getType() == Material.IRON_PICKAXE
				|| p.getItemInHand().getType() == Material.DIAMOND_AXE
				|| p.getItemInHand().getType() == Material.WOOD_PICKAXE
				|| p.getItemInHand().getType() == Material.GOLD_PICKAXE) {
				if (new Random().nextInt(100) + 1 <= 95) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.COAL));
				} else if (new Random().nextInt(100) + 1 >= 96 && new Random().nextInt(100) + 1 <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.COAL, 9));
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.COAL_BLOCK, 1));
				}
			}
		} else if (b.getType() == Material.REDSTONE_ORE) {
			if (p.getItemInHand().getType() == Material.IRON_PICKAXE 
				|| p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
				if (new Random().nextInt(100) <= 95) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.REDSTONE, 4));
				} else if (new Random().nextInt(100) >= 96 && new Random().nextInt(100) <= 100) {
					event.setCancelled(true);
					b.setType(Material.AIR);
					b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.REDSTONE, 12));
				}
			}
		}
	}
	
	@EventHandler
	public void onWoodDestroy(BlockBreakEvent event) {
		Block b = event.getBlock();
		Player p = event.getPlayer();
		if (b.getType() == Material.LOG) {
			Tree log = (Tree) event.getBlock().getState().getData();
			if (p.getItemInHand().getType() == Material.WOOD_AXE
				|| p.getItemInHand().getType() == Material.STONE_AXE
				|| p.getItemInHand().getType() == Material.IRON_AXE
				|| p.getItemInHand().getType() == Material.DIAMOND_AXE
				|| p.getItemInHand().getType() == Material.GOLD_AXE) {
				
				final ItemStack acaciaLog = new ItemStack(Material.LOG_2, 1);
				final ItemStack birchLog = new ItemStack(Material.LOG, 1, (short) 2);
				final ItemStack darkOakLog = new ItemStack(Material.LOG_2, 1, (short) 2);
				final ItemStack oakLog = new ItemStack(Material.LOG, 1);
				final ItemStack jungleLog = new ItemStack(Material.LOG, 1, (short) 3);
				final ItemStack redwoodLog = new ItemStack(Material.LOG_2, 1, (short) 3);
				
				if (log.getSpecies() == TreeSpecies.ACACIA) {
					if (new Random().nextInt(100) + 1 <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1<= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(acaciaLog));
					}
				} else if (log.getSpecies() == TreeSpecies.BIRCH) {
					if (new Random().nextInt(100) + 1 <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(birchLog));
					}
				} else if (log.getSpecies() == TreeSpecies.DARK_OAK) {
					if (new Random().nextInt(100) + 1 <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(darkOakLog));
					}
				} else if (log.getSpecies() == TreeSpecies.GENERIC) {
					if (new Random().nextInt(100) + 1 <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(oakLog));
					}
				} else if (log.getSpecies() == TreeSpecies.JUNGLE) {
					if (new Random().nextInt(100 + 1) <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(jungleLog));
					}
				} else if (log.getSpecies() == TreeSpecies.REDWOOD) {
					if (new Random().nextInt(100) + 1 <= 90) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
						event.setCancelled(true);
						b.setType(Material.AIR);
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
						b.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(redwoodLog));
					}
				}
			}
		}
	}
}
