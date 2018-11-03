package com.ziemo.baller.nbamanager.teams;

import com.ziemo.baller.nbamanager.common.ResourceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/team")
public class TeamController {

	private ResourceService<Team> service;

	public TeamController(ResourceService<Team> service) {
		this.service = service;
	}

	@PostMapping("")
	public Team create(@RequestBody Team team) {
		service.create(team);
		return team;
	}

	@GetMapping("/{id}")
	public Team get(@PathVariable Integer id) {
		Team team = service.get(id);
		return team;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	@GetMapping("")
	public Iterable<Team> getAll() {
		Iterable<Team> teams = service.getAll();
		return teams;
	}



}
