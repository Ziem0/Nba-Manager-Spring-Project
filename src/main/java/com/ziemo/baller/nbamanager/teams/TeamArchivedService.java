package com.ziemo.baller.nbamanager.teams;

import org.springframework.stereotype.Service;

@Service
public class TeamArchivedService extends TeamService {

	public TeamArchivedService(TeamRepository repository) {
		super(repository);
	}

	@Override
	public void delete(int id) {
		super.delete(id);
	}

	@Override
	public Team get(int id) {
		return this.repository.findByArchivedAndId(false, id);
	}

	@Override
	public Iterable<Team> getAll() {
		return this.repository.findByArchived(false);
	}
}

/*
spring basics
logging for admin (password and login given in url ?key=value check in database (new admin class)
 */