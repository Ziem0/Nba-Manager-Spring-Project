package com.ziemo.baller.nbamanager.teams;

public enum City {

	HOUSTON("Houston"), LOS_ANGELES("Los Angeles"), MIAMI("Miami"), PORTLAND("Portland");

	String toReadable;

	City(String toReadable) {
		this.toReadable = toReadable;
	}

	@Override
	public String toString() {
		return this.toReadable;
	}

	public String getToReadable() {
		return toReadable;
	}

	public City fromString(String city) {
		for (City town : City.values()) {
			if (city.equalsIgnoreCase(town.toReadable)) {
				return town;
			}
		}
		throw new IllegalArgumentException("Unsupported output city");
	}
}
