package com.mygdx.game.caster;
import com.mygdx.game.ops.*;


/*
 * a visitor class that goes through an array of runes, activating each one in turn.
 */
public class Cast {
	//this visit happens per animation cycle, clicking through each rune as the circle turns. 
	public void visit(Rune rune){
		rune.type();
		rune.activate();
	}
	
}
