package joo.강의7;

import java.awt.Point;

public class Marine {
	int hp=40;
	static int power=4;
	static int armor=0;
	static int shootingRange=6;
	
	Point position;
	
	void showState()
	{
		System.out.println("체력: "+hp+"\t 공격력:"+power + "\t 방어력:"+armor);
	}

	

	double getDistance(Marine target)
	{
		//타깃과의 거리계산
		double result = Math.sqrt(
						  	Math.pow(target.position.x - position.x, 2)
						  + Math.pow(target.position.y - position.y, 2)
						);
		
		return result;
	}

	void attack(Marine target)
	{
		double distance = getDistance(target);
		
		if(distance >shootingRange)
		{
			System.out.println("공격이 닿지 않습니다. 타깃과의거리:"+distance);
			return;
		}
		
		target.hp -=(power-target.armor);
		
	}
	void powerUp()
	{
		power++;	
	}
	
	void armorUp()
	{
		armor ++;
	}
	
	
}