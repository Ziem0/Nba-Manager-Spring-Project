package com.ziemo.baller.nbamanager.teams;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

	Team findByArchivedAndId(boolean archived, Integer id);
	Iterable<Team> findByArchived(boolean archived);

}
