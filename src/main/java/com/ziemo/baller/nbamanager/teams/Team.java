package com.ziemo.baller.nbamanager.teams;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.ziemo.baller.nbamanager.players.Player;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, unique = true)
	private String name;
	@Enumerated(EnumType.STRING)
	private City city;
	@OneToMany(mappedBy = "team")
	private List<Player> players;
	@JsonIgnore
	private Boolean archived = false;

}
