package com.mygdx.game.caster;

import com.mygdx.game.ops.Rune;

//need some way of tracking sub-circles within this structure

public class Spell {
	
	public int slotNum;//max number of slots per circle (they all must be filled per circle)
	public String[] SpellComp;//standard to assume there will be at least two spell strings
	public String center;
	
	//single circle spell (test only most likely)
	public Spell(String[] SpellComp){
		this.SpellComp = SpellComp;//its up to spellcircle to build this properly
		this.slotNum = SpellComp.length;
	}
	
	//multi circle spell
	public Spell(String[] SpellComp, int slotNum){
		this.SpellComp = SpellComp;//its up to spellcircle to build this properly
		this.slotNum = slotNum;
	}
}
