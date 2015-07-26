package com.mygdx.game.caster;

import java.util.HashMap;


/*
 * a spellbook is essentially the saved spells created by the user,
 * There might be a few that are saved and reloaded on start (probably spells saved as a json doc or something)
 * and then reinterpreted by the interpreter (who uses the cast visitor class)
 */
public class Book {
	HashMap<String, Spell> spellBook;//spellbook consists of spells organized by Name, Spell (class)
}
