package com.ziemo.baller.nbamanager.teams;

import com.ziemo.baller.nbamanager.common.ResourceService;
import com.ziemo.baller.nbamanager.players.Player;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/team")
public class TeamController {

	private ResourceService<Team> service;

	public TeamController(@Qualifier("teamArchivedService") ResourceService<Team> service) {
		this.service = service;
	}

	@GetMapping("")
	public Iterable<Team> getAll() {
		Iterable<Team> teams = service.getAll();
		log.warn("getting all teams..");
		return teams;
	}

	@GetMapping("/{id}")
	public Team get(@PathVariable Integer id) {
		Team team = service.get(id);
		return team;
	}

	@PostMapping("")
	public Team create(@RequestBody Team team) {
		service.create(team);
		return team;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	@GetMapping("/password")
	public Iterable<Team> getAllByAdmin(@RequestParam (required = true) String password) {
		Iterable<Team> teams = service.getAllByAdmin();
		return teams;
	}

}
