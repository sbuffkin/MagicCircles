package com.mygdx.game.ops.dir;

import com.mygdx.game.caster.Cast;
import com.mygdx.game.ops.Rune;

/*
 * east is earth
 * 
 * creation - required for spells to continue beyond the scope of cast, can act as a "for" loop possibly
 * basically going to have to come up with a more fleshed-out language system.
 */
public class East implements Rune{

	@Override
	public String type() {
		return("earth");
		
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Cast cast) {
		
		
	}
	
}
