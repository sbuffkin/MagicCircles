package com.mygdx.game.datastrct;

import com.mygdx.game.base.SpellCircle;

public class node{

	public SpellCircle payload;
	
	public node[] next = {null,null,null,null};
	public node previous = null;
	public int index;
	
}
