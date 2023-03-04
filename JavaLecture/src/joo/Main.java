package joo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import joo.eleven.Marine;
import joo.eleven.Tank;
import joo.eleven.Unit;
import joo.eleven.Zealot;
import joo.eleven.Zergling;



public class Main {
	
	public static void main(String[] args) {
		
		
	Unit unitList[] = new Unit[10];
	
	
	
	
	

	List<Unit> list = new ArrayList<Unit>();
	
	List<Unit> linkedList = new LinkedList<Unit>();
	
	
	
	list.add(new Marine());
	list.add(new Zergling());
	list.add(new Zealot());
	list.add(new Tank());

	for(Unit unit :list)
	{
			unit.attack(null);
	}
	
	list.remove(2);// 질럿 삭제
	
	
	
	
	}
}
