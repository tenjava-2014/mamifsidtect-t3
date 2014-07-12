package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
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
					
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					
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
					
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					
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
					
				} else if (new Random().nextInt(100) + 1 >= 81 && new Random().nextInt(100) + 1 <= 90) {
					
				} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 100) {
					
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
				
				} else if (new Random().nextInt(100) + 1 >= 96 && new Random().nextInt(100) + 1 <= 100) {
				
				}
			}
		} else if (b.getType() == Material.COAL_ORE) {
			if (p.getItemInHand().getType() == Material.STONE_PICKAXE
				|| p.getItemInHand().getType() == Material.IRON_PICKAXE
				|| p.getItemInHand().getType() == Material.DIAMOND_AXE
				|| p.getItemInHand().getType() == Material.WOOD_PICKAXE
				|| p.getItemInHand().getType() == Material.GOLD_PICKAXE) {
				if (new Random().nextInt(100) + 1 <= 95) {
				
				} else if (new Random().nextInt(100) + 1 >= 96 && new Random().nextInt(100) + 1 <= 100) {
				
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
				
				if (log.getSpecies() == TreeSpecies.ACACIA) {
					if (new Random().nextInt(100) + 1 <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1<= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				} else if (log.getSpecies() == TreeSpecies.BIRCH) {
					if (new Random().nextInt(100) + 1 <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				} else if (log.getSpecies() == TreeSpecies.DARK_OAK) {
					if (new Random().nextInt(100) + 1 <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				} else if (log.getSpecies() == TreeSpecies.GENERIC) {
					if (new Random().nextInt(100) + 1 <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				} else if (log.getSpecies() == TreeSpecies.JUNGLE) {
					if (new Random().nextInt(100 + 1) <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				} else if (log.getSpecies() == TreeSpecies.REDWOOD) {
					if (new Random().nextInt(100) + 1 <= 90) {
					
					} else if (new Random().nextInt(100) + 1 >= 91 && new Random().nextInt(100) + 1 <= 96) {
					
					} else if (new Random().nextInt(100) + 1 >= 97 && new Random().nextInt(100) + 1 <= 100) {
					
					}
				}
			}
		}
	}
}
