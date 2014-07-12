package com.tenjava.entries.mamifsidtect.t3.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class RandomRareBlockDrops implements Listener {

	@EventHandler
	public void onPlayerDiamondOreBreak(BlockBreakEvent event) {
		Player p = event.getPlayer();
		Block b = event.getBlock();
		if (b.getType() == Material.DIAMOND_ORE) {
			if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
				
			}
		}
	}
}
