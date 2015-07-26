package com.mygdx.game.ops;

import com.mygdx.game.base.SpellCircle;
import com.mygdx.game.caster.Cast;

/*
 * this type links to a new circle, which can have its own runes contained within it.
 */

public class Link implements Rune{
	public SpellCircle linked;
	@Override
	public void type() {
		System.out.print("link");
	}
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void accept(Cast cast) {
		// TODO Auto-generated method stub
		
	}

}
