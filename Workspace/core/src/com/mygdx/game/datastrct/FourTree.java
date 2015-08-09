package com.mygdx.game.datastrct;

import com.mygdx.game.base.SpellCircle;



/*
 * This class is currently all kinds of fugged. Need to make it into a tree that can deal with four children per node
 * generic add is going to be annoying. There will have to be at least two or three ways of adding to the thing
 *
 *	So I'm thinking since the stupid thing doesn't reaaaly have to be generic to begin with I can make a version 
 *	geared specfically towards spell circles because honestly I don't care anymore, thats what its meant to do and
 *  only that anyway. This ain't going in any other projects.
 *  
 *  
 *  
 *  
 *  Trees integers grow downwards
 *
 */


public class FourTree {
	
	public node head = null;
	public node last = null;
	public int length = 0;

	public FourTree(){
		//NOTHING, but just in case you wanna make a blank LL
	}
	
	public FourTree(SpellCircle headPayLoad){
		add(headPayLoad);
	}
	public FourTree(SpellCircle[] payloads){
		for(SpellCircle payload : payloads){
			add(payload);
		}
	}
	
	
	//just add implicitly refers to the bottom of the circle, best for lines of circles, but probably not safe for use.)
	public void add(SpellCircle payload){
		if(head != null){
			last.next[2] = new node();
			last.next[2].previous = last;
			last = last.next[2];
			last.payload = payload;
			length++;
		}
		else{
			head = new node();
			head.payload = payload;
			last = head;
			length++;
		}
	}
	public void addToNode(SpellCircle payload, node curNode){
		
	}
	
	
	public node get(int index){
		int i;
		node current = head;
		if(index <= length-1){
			for(i=0;i<index;i++){
				current = current.next[0];
			}
			return current;
		}
		return null;
		
	}
	public node getHead(){
		return head;
	}
	public node getLast(){
		return last;
	}
	public SpellCircle headPayload(){
		return head.payload;
	}
	public SpellCircle lastPayload(){
		return last.payload;
	}
	public SpellCircle getPayload(int index){
		return(get(index).payload);
	}
	
	public void testlog(){
		node current = head;
		while(current != null){
			System.out.println(current.payload);
			current = current.next[0];
		}
	}

}
