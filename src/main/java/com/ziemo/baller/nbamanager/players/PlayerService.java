package com.ziemo.baller.nbamanager.players;

import com.ziemo.baller.nbamanager.common.ObjectNotExistException;
import com.ziemo.baller.nbamanager.common.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class PlayerService implements ResourceService<Player> {

	PlayerRepository repository;

	public PlayerService(PlayerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Player get(int id) {
		Player player = this.repository.findById(id).get();
		return player;
	}

	@Override
	public Iterable<Player> getAll() {
		Iterable<Player> players = this.repository.findAll();
		return players;
	}

	@Override
	public void create(Player object) {
		this.repository.save(object);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public void finalDelete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public Iterable<Player> getAllByAdmin() {
		return this.repository.findByArchived(true);
	}
}
