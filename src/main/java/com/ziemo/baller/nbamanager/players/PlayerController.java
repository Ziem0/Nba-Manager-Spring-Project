package com.ziemo.baller.nbamanager.players;

import com.ziemo.baller.nbamanager.common.ResourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
@RequestMapping(path = "/player")
public class PlayerController {

	private ResourceService<Player> playerService;

	public PlayerController(ResourceService<Player> service) {
		this.playerService = service;
	}

	@PostMapping("")
	public Player create(@RequestBody Player player) {
		playerService.create(player);
		return player;
	}

	@GetMapping("/{id}")
	public Player get(@PathVariable Integer id) {
		Player player = playerService.get(id);
		return player;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		playerService.delete(id);
	}

	@GetMapping("")
	public Iterable<Player> getAll() {
		Iterable<Player> players = playerService.getAll();
		return players;
	}


}
