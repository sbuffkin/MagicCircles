package com.mygdx.game.ops;

import com.mygdx.game.ops.dir.*;

public class RuneFactory {

	public static Rune getRune(String runeType) {
		if(runeType == null){
			return null;
		}
		if(runeType.equalsIgnoreCase("NORTH") || runeType.equalsIgnoreCase("FIRE")){
			return new North();
		}
		if(runeType.equalsIgnoreCase("SOUTH") || runeType.equalsIgnoreCase("WATER")){
			return new South();
		}
		if(runeType.equalsIgnoreCase("EAST") || runeType.equalsIgnoreCase("EARTH")){
			return new East();
		}
		if(runeType.equalsIgnoreCase("WEST") || runeType.equalsIgnoreCase("AIR") ){
			return new West();
		}
		if(runeType.equalsIgnoreCase("POWER") || runeType.equalsIgnoreCase("POWER UP")){
			return new PowerUp();
		}
		if(runeType.equalsIgnoreCase("START")){
			return new Start();
		}
		if(runeType.equalsIgnoreCase("END")){
			return new End();
		}
		
		return null;

	}
	
	
}
