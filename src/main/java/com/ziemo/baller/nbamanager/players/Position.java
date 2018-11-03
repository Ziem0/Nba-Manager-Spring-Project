package com.ziemo.baller.nbamanager.players;


public enum Position {

	PG, SG, SF, PF, C;

	@Override
	public String toString() {
		return this.toString();
	}


	public Position fromString(String position) {
		for (Position pos : Position.values()) {
			if (position.equalsIgnoreCase(pos.toString())) {
				return pos;
			}
		}
		throw new IllegalArgumentException("Given position doesn't exist");
	}
}
