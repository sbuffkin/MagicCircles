package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.base.*;
import com.mygdx.game.caster.*;
import com.mygdx.game.datastrct.LinkedList;

public class MagicCircles extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		//img = new Texture("badlogic.jpg");
		//batch = new SpriteBatch();
		//String[] comp = {"start","power", "power","power","fire","water","air","end"};


		/*
		Spell testSpell = new Spell(comp);
		SpellCircle testCircle = new SpellCircle(testSpell);
		testCircle.accept(new Cast());
		*/
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.begin();
		//batch.draw(img, 0, 0);
		//batch.end();
	}
}
