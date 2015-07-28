package com.mygdx.game.ops;

import com.mygdx.game.caster.Cast;

/*
 * A rune amounts to a single op within the larger circle, it should only do one, rather specific thing.
 * Not sure what north/south east/west will compile to yet but I'm thinking they'll be "interpreted" by a larger book after they're in a 
 * circle and it is "activated" 
 * 
 */
public interface Rune {
	
	
	public String type();
	public void activate();
	public void accept(Cast cast);
}
