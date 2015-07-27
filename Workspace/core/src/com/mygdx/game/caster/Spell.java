package com.mygdx.game.caster;

public class Spell {
	public int slotNum;
	public String[] SpellComp;
	
	public Spell(String[] SpellComp){
		this.SpellComp = SpellComp;
		this.slotNum = SpellComp.length;
	}
}
