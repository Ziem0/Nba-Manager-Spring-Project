package com.ziemo.baller.nbamanager.players;

import com.ziemo.baller.nbamanager.teams.Team;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String name;
	@Enumerated(EnumType.STRING)
	private Position position;
	@ManyToOne
	private Team team;

}
