package joo;

public class HanoiTower {
	void a(int n, char from ,char tmp, char to)
	{
		if(n==1) 
			System.out.println("원판 1을 "+from + "에서 " + to +"으로 옮긴다.");
		else
		{
			a(n-1,from,to,tmp);
			System.out.println("원판 "+n+"를 "+from+"에서 "+to+"으로 옮긴다.");
			a(n-1,tmp,from,to);
		}
			
			
		
	}
}
