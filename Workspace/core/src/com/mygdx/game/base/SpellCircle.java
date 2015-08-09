package com.mygdx.game.base;

import com.mygdx.game.caster.Cast;
import com.mygdx.game.caster.Spell;
import com.mygdx.game.datastrct.*;
import com.mygdx.game.ops.*;

public class SpellCircle implements Rune{
	
	public Rune[] slots;
	public Rune center;
	
	/*
	public SpellCircle(Spell spell){
		slots = new Rune[spell.slotNum];
		int i;
		//String name : spell.SpellComponents
		for(i = 0; i<spell.SpellComp.length; i++){
			slots[i] = RuneFactory.getRune(spell.SpellComp[i]);
		}
		this.center = spell.center;
	}
	*/
	/*
	 * Spells will always fill up the full slotnum, 
	 * because there will be a NOP in any space that doesn't have an actual rune
	 * 
	 */
	public SpellCircle(int slotNum, String[] comp){
		
		slots = new Rune[slotNum];
		int i;
		for(i = 0; i< slots.length; i++){
			slots[i] = RuneFactory.getRune(comp[i]);
		}
	}
	
	
	public SpellCircle(Spell spell, int index){
		SpellCircle temp = spell.SpellComp.getPayload(index);
		this.slots = temp.slots;
		this.center = temp.center;
		
	}
	/*
	public SpellCircle(Spell spell, int start){
		slots = new Rune[spell.slotNum];
		int i, n;
		for(i = 0, n = start; i<slots.length; i++, n++){
			slots[i] = RuneFactory.getRune(spell.SpellComp[n]);
		}
	}
	*/
	public node subSpell(){
		
		return null;
	}
	
	
	
	public String type() {
		return ("circle");
	}

	
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	
	public void accept(Cast cast) {
		for(Rune rune: slots){
			cast.visit(rune);
		}
		
	}
	
	
	
	
}
