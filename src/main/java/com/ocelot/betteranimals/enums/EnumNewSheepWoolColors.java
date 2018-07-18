package com.ocelot.betteranimals.enums;

import java.awt.Color;

/**
 * This holds all the possible team colors for entities.
 * 
 * @author Ocelot5836
 */
public enum EnumNewSheepWoolColors {
	WHITE(0, 203, 203, 203),
	ORANGE(1, 195, 98, 20),
	MAGENTA(2, 198, 76, 165),
	LIGHT_BLUE(3, 58, 153, 180),
	YELLOW(4, 200, 166, 40),
	LIME(5, 98, 152, 20),
	PINK(6, 192, 108, 134),
	GRAY(7, 50, 54, 57),
	SILVER(8, 120, 120, 115),
	CYAN(9, 17, 123, 123),
	PURPLE(10, 104, 36, 140),
	BLUE(11, 40, 42, 120),
	BROWN(12, 100, 69, 38),
	GREEN(13, 67, 97, 21),
	RED(14, 145, 41, 35),
	BLACK(15, 10, 11, 15);

	private int		ID;
	private float	r;
	private float	g;
	private float	b;

	EnumNewSheepWoolColors(int ID, float r, float g, float b) {
		this.ID = ID;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getId() {
		return ID;
	}

	public Color getColor() {
		return new Color(r, g, b);
	}

	public float getR() {
		return r;
	}

	public float getG() {
		return g;
	}

	public float getB() {
		return b;
	}
	
	public static EnumNewSheepWoolColors getEnumByID(int id) {
		return values()[id];
	}
}