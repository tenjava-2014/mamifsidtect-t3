package com.tenjava.entries.mamifsidtect.t3.listeners;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class RandomPunchingBlockListener implements Listener {

	@EventHandler
	public void punchingBlocksListener(PlayerInteractEvent event) {
		if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
			if (new Random().nextInt(100) + 1 >= 75) {
				Player p = event.getPlayer();
				p.setVelocity(p.getLocation().getDirection().multiply(1));
				p.setVelocity(new Vector(p.getVelocity().getX(), 5D, p.getVelocity().getZ()));
			}
		}
	}
}
