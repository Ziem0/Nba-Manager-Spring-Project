package com.ziemo.baller.nbamanager.players;

import org.springframework.stereotype.Service;

@Service
public class PlayerArchivedService extends PlayerService {

	public PlayerArchivedService(PlayerRepository repository) {
		super(repository);
	}

	@Override
	public Player get(int id) {
		return this.repository.findByIdAndArchived(id, false);
	}

	@Override
	public Iterable<Player> getAll() {
		return this.repository.findByArchived(false);
	}

	@Override
	public void delete(int id) {
		Player player = this.repository.findById(id).get();
		player.setArchived(true);
		this.repository.save(player);
	}

}
