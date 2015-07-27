package com.mygdx.game.base;

import com.mygdx.game.caster.Cast;
import com.mygdx.game.caster.Spell;
import com.mygdx.game.ops.*;

public class SpellCircle implements Rune{
	
	public Rune[] slots;

	public SpellCircle(Spell spell){
		slots = new Rune[spell.slotNum];
		int i;
		//String name : spell.SpellComponents
		for(i = 0; i<spell.SpellComp.length; i++){
			slots[i] = RuneFactory.getRune(spell.SpellComp[i]);
		}
	}
	
	@Override
	public void type() {
		System.out.println("Circle");
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Cast cast) {
		for(Rune rune: slots){
			cast.visit(rune);
		}
		
	}
	
	
	
	
}
