package com.ziemo.baller.nbamanager.players;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
	private Integer id;
	@Column(nullable = false, unique = true)
	private String name;
	@Enumerated(EnumType.STRING)
	private Position position;
	@JsonBackReference
	@ManyToOne
	private Team team;
	@JsonIgnore
	private Boolean archived = false;

}
