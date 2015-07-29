package com.mygdx.game.caster;

import com.mygdx.game.datastrct.LinkedList;


//need some way of tracking sub-circles within this structure

public class Spell {
	
	public int slotNum;//max number of slots per circle (they all must be filled per circle)
	public LinkedList<String> SpellComp;//standard to assume there will be at least two spell strings
	public String center;
	
	//single circle spell (test only most likely)
	public Spell(String[] SpellComp){
		this.SpellComp = buildComp(SpellComp);//its up to spellcircle to build this properly
		this.slotNum = SpellComp.length;
	}
	

	//multi circle spell
	public Spell(String[] SpellComp, int slotNum){
		this.SpellComp = buildComp(SpellComp);//its up to spellcircle to build this properly
		this.slotNum = slotNum;
	}
	
	private LinkedList<String> buildComp(String[] spellComp) {
		LinkedList<String> comp = new LinkedList<String>();
		for(String word : spellComp){
			comp.add(word);
		}
		
		return comp;
	}
}
