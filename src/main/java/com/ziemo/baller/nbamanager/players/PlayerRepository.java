package com.ziemo.baller.nbamanager.players;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

	Iterable<Player> findByArchived(boolean archived);

	Player findByIdAndArchived(int id, boolean archived);
}
