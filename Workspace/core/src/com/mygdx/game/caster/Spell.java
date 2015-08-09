package com.mygdx.game.caster;

import com.mygdx.game.base.SpellCircle;
import com.mygdx.game.datastrct.FourTree;


//need some way of tracking sub-circles within this structure

public class Spell {
	
	public int slotNum;//max number of slots per circle (they all must be filled per circle)
	public FourTree SpellComp;//standard to assume there will be at least two spell strings
	public String center;
	
	/*
	 * This will take in a list of strings that each represent a spellcircle
	 * the strings consist of the 0 index (the location of the circle within the tree)
	 * and the rest, 
	 * 
	 */
	public Spell(String[][] SpellComp){
		//this.SpellComp = ;
		//this.slotNum = SpellComp.length;
	}
	


	/*
	 * This will take in a spell circle to add to the current fourtree, up, down, left, or right from the current one. 
	 * A spell circle cannot branch more than one off the "main" path. therefore any non-mainline circles must link back.
	 * 
	 * 
	 * direction- the number associated with the link rune's inner direction rune (which comes immediately after the link)
	 * 
	 */
	private FourTree add(SpellCircle next, int direction) {
		
		
		return SpellComp;
		
	}
}
