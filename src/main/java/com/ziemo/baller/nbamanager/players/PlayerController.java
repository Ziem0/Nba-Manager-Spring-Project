package com.ziemo.baller.nbamanager.players;

import com.ziemo.baller.nbamanager.common.ResourceService;
import com.ziemo.baller.nbamanager.teams.Team;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@Slf4j
@RestController
@RequestMapping(path = "/player")
public class PlayerController {

	private ResourceService<Player> playerService;

	public PlayerController(@Qualifier("playerArchivedService") ResourceService<Player> service) {
		this.playerService = service;
	}

	@GetMapping("")
	public Iterable<Player> getAll() {
		Iterable<Player> players = playerService.getAll();
		return players;
	}

	@GetMapping("/{id}")
	public Player get(@PathVariable Integer id) {
		Player player = playerService.get(id);
		return player;
	}

	@PostMapping("")
	public Player create(@RequestBody Player player) {
		playerService.create(player);
		return player;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		playerService.delete(id);
	}

	@DeleteMapping("/delete{id}")
	public void finalDelete(@PathVariable Integer id) {
		playerService.finalDelete(id);
	}

	@GetMapping("/admin")
	public Iterable<Player> getAllByAdmin(@RequestParam(value = "password", required = true) String password) {
		log.warn("adminAccess");
		if (password.equals("ziemo")) {
			log.warn("logging ok");
			return playerService.getAllByAdmin();
		} else {
			log.warn("logging failed");
			return playerService.getAll();
		}
	}
}
