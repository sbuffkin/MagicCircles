package com.mygdx.game.datastrct;




public class LinkedList<e> {
	
	public node<e> head = null;
	public node<e> last = null;
	public int length = 0;

	public LinkedList(){
		//NOTHING, but just in case you wanna make a blank LL
	}
	
	public LinkedList(e headPayLoad){
		add(headPayLoad);
	}
	public LinkedList(e[] payloads){
		for(e payload : payloads){
			add(payload);
		}
	}
	
	public void add(e payload){
		if(head != null){
			last.next = new node<e>();
			last.next.previous = last;
			last = last.next;
			last.payload = payload;
			length++;
		}
		else{
			head = new node<e>();
			head.payload = payload;
			last = head;
			length++;
		}
	}
	
	public node<e> get(int index){
		int i;
		node<e> current = head;
		for(i=0;i<length;i++){
			current = current.next;
		}
		return current;
	}
	public node<e> getHead(){
		return head;
	}
	public node<e> getLast(){
		return last;
	}
	public e headPayload(){
		return head.payload;
	}
	public e lastPayload(){
		return last.payload;
	}
	public e getPayload(int index){
		return(get(index).payload);
	}

}
