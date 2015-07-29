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
	
	public SpellCircle(Spell spell){
		slots = new Rune[spell.slotNum];
		int i = 0;
		node<String> current = spell.SpellComp.head;
		while(current.payload != "end"){
			slots[i] = RuneFactory.getRune(current.payload);
			if(slots[i].type().equals("link")){
				current = subSpell();
			}
			else{
				current = current.next;
			}
		}
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
	public node<String> subSpell(){
		
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
