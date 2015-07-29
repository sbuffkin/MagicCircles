package com.mygdx.game.ops;

import com.mygdx.game.base.SpellCircle;
import com.mygdx.game.caster.Cast;


/*
 * this type links to a new circle, which can have its own runes contained within it.
 */

public class Link implements Rune{
	public SpellCircle linked;
	
	
	//dunno how this will be used yet so lets just overload it with all dem methods
	
	public Link(SpellCircle linked){
		this.linked = linked;
	}
	
	

	@Override
	public String type() {
		return ("link");
	}
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Cast cast) {
		cast.visit(linked);//pass it along to the subspell circle
	}

}
