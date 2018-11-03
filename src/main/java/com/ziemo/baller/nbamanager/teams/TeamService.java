package com.ziemo.baller.nbamanager.teams;

import com.ziemo.baller.nbamanager.common.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class TeamService implements ResourceService<Team> {

	private TeamRepository repository;

	public TeamService(TeamRepository repository) {
		this.repository = repository;
	}

	@Override
	public Team get(int id) {
		Team team = this.repository.findById(id).get();
		return team;
	}

	@Override
	public Iterable<Team> getAll() {
		Iterable<Team> teams = this.repository.findAll();
		return teams;
	}

	@Override
	public void create(Team object) {
		this.repository.save(object);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}
}
