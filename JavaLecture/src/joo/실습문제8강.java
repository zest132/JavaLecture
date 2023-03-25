package joo;

import joo.강의11.Marine;
import joo.강의11.Zergling;

public class 실습문제8강 {

	
	/*
	public void 문제1_2()
	{
		Marine[] marines = new Marine[12];
		Zergling[] zerglings = new Zergling[12];
		
		
		for(int i =0;i<marines.length;i++)
			marines[i] = new Marine("마린"+i);
			
		for(int i =0;i<zerglings.length;i++)
			zerglings[i] = new Zergling("저글링"+i);
	
		
		
		while(marines.length >=0 && zerglings.length>=0 )
		{
			//마린의 공격턴
			for(int i =0;i<marines.length;i++)
			{
				//공격 타깃 선택
				if(zerglings.length ==0) //저글링이 전멸하였다면 마린의 승리
				{
					System.out.println("마린 승리");
					return ;
				}
				Zergling target = BattleHelper.getRandomUnit(zerglings);
				Marine  attacker = BattleHelper.getRandomUnit(marines);
				
				System.out.println(attacker.name+"이 "+target.name+"을 공격합니다.");
				
				
				//공격대상이 죽으면 저그리스트에서 제외한다.
				if(attacker.attack(target))
				{
					System.out.println(target.name+"이 죽었습니다");
					zerglings = BattleHelper.removeUnit(zerglings, target);
				}
					
			}
			
			System.out.println("마린팀 공격턴 종료");
			
			//저글링의 공격턴
			for(int i =0;i<zerglings.length;i++)
			{
				//공격 타깃 선택
				if(marines.length ==0) //마린이 전멸하였다면 저글링의 승리
				{
					System.out.println("저그 승리");
					return ;
				}
					
				Marine target = BattleHelper.getRandomUnit(marines);
				Zergling  attacker = BattleHelper.getRandomUnit(zerglings);
				
				System.out.println(attacker.name+"이 "+target.name+"을 공격합니다.");
				
				
				//공격대상이 죽으면 타겟리스트에서 제외한다.
				if(attacker.attack(target))
				{
					System.out.println(target.name+"이 죽었습니다");
					marines=BattleHelper.removeUnit(marines, target);
				}
					
			}
			System.out.println("저글링팀 공격턴 종료");
				
			System.out.println("마린수:"+marines.length+"    "+ "저글링수:"+zerglings.length);
		}
	}
	*/
}
