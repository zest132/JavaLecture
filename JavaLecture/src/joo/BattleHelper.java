package joo;

import joo.eleven.Marine;
import joo.eleven.Zergling;

public class BattleHelper {

	static Zergling  getRandomUnit(Zergling[] zerglings)
	{
		
		return zerglings[(int)(Math.random()*zerglings.length)];
	}
	
	static Marine  getRandomUnit(Marine[] marines)
	{
		
		return marines[(int)(Math.random()*marines.length)];
	}
	

	static Zergling[] removeUnit(Zergling[] list, Zergling target)
	{
		//원본사이즈보다 1개 작은 배열을 생성한다.
			Zergling[] newList =new Zergling[list.length-1];
				
		int i=0;
		for(Zergling zergling : list)
		{
			//지워야할 타깃을 제외한 나머지를 모두 옮긴다.
			if(target !=zergling)
			{
				newList[i] = zergling;
				i++;
			}
				
					
			
			
		}


		return newList;
		
	}
	
	static Marine[] removeUnit(Marine[] list, Marine target)
	{
		//원본사이즈보다 1개 작은 배열을 생성한다.
		Marine[] newList =new Marine[list.length-1];
				
		int i=0;
		for(Marine marine : list)
		{
			//지워야할 타깃을 제외한 나머지를 모두 옮긴다.
			if(target !=marine)
			{
				newList[i] = marine;
				i++;
			}
		}


		return newList;
		
	}
	
	
	
}
