package joo.강의13;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import joo.강의14.MyStack;

public class Main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		실습문제1_2();

	}
	
	
	
	
	
	public static void 실습문제1_1()
	{
		Point pt1 = new Point(10,20,30);
		Point pt2 = new Point(10,20,30);
		
		System.out.println(pt1.equals(pt2));
		System.out.println(pt1.toString());
	}
	

	
	public static void 실습문제1_2()
	{
		Warrior w1 = new Warrior("전사1", 100);
		
		Warrior w2 = w1.clone();
		
		System.out.println(w2);
	}
	
	
	
	public static void 실습문제1_3()
	{
		Warrior w1 = new Warrior("전사1", 100, new Point(10, 20, 30));
		
		Warrior w2 = w1.deepCopy();
		
		
		w2.position.x = 100;
		w2.position.y = 100;
		w2.position.z = 100;
		
		
		System.out.println(w1.toString());
	}
	
	
	public static void 실습문제2_2_temp()
	{
		String str = "abcdefgab";
		
		System.out.println(count(str,"ab"));
		
	}
	
	
	public static void 실습문제2_1()
	{
		String date = "20190311";
		
		Calendar cal =  Calendar.getInstance();
		cal.set(Integer.parseInt(date.substring(0,4))
				,Integer.parseInt(date.substring(4,6))-1
				,Integer.parseInt(date.substring(6,8)));
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));	
	}
	
	public static void 실습문제2_2()
	{
		for(int i=0;i<10;i++)
			System.out.println(getRandom(-5,10)+",");
	}
	

	
	public static void 실습문제3_1()
	{
		MyStack<String> stack = new MyStack<>();
		
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public static void localTimeDateSample()
	{
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		
		//값 초기화
		date = date.of(2014, 10, 15);
		dateTime = dateTime.of(date, time);
		zoneDateTime = zoneDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
		
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
		dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
		
		date = date.withYear(2015);
		date = date.withMonth(5);
		date = date.withDayOfMonth(3);
	}
	
	public static void dateAndCalendarSample()
	{
		Calendar cal = Calendar.getInstance();//기본은 현재 시스템의 시간
		Date date = cal.getTime();
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(date));
		System.out.println(new SimpleDateFormat("yy년 MM월 dd일").format(date));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(date));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(date));
		System.out.println(new SimpleDateFormat("E요일입니다").format(date));
		
		
		
		System.out.print(cal.get(Calendar.YEAR)+"-");
		System.out.print(cal.get(Calendar.MONTH)+1+"-"); //0~11 이므로 1을 더한다
		System.out.println(cal.get(Calendar.DATE));
		System.out.print(cal.get(Calendar.HOUR)+":");
		System.out.print(cal.get(Calendar.MINUTE)+":");
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND)); //1000분의1초
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //1~7 일~토
		
		cal.set(2010,Calendar.OCTOBER,15);
		Calendar cal2 = Calendar.getInstance();
		long result = cal2.getTimeInMillis() - cal.getTimeInMillis();
		System.out.println(result +"밀리세컨초 차이 납니다.");
		System.out.println(result/1000 +"초 차이 납니다.");
		System.out.println(result/1000/60 +"분 차이 납니다.");
		System.out.println(result/1000/60/60 +"시 차이 납니다.");
		System.out.println(result/1000/60/60/24 +"일 차이 납니다.");
		System.out.println(result/1000/60/60/24/365 +"년 차이 납니다.");
		
	}
	
	public static void BitIntegerSample()
	{
		java.math.BigInteger test ;
		
		//long temp = 41564848482131564189461614894536149841651896;
		
		test = new BigInteger("41564848482131564189461614894536149841651896");
		test = new BigInteger("F9F0",16);
		String str = test.toString();
		int integer = test.intValue();
		System.out.println(str);
		System.out.println(integer);
		
		java.math.BigInteger result = test.add(new BigInteger("41564848482131564189441651896"));//더하기
		result = test.subtract(new BigInteger("415648484821651896"));//빼기
		result = test.multiply(new BigInteger("415648484821651896"));//곱셈
		result = test.divide(new BigInteger("415648484821651896"));//나눗셈
		result = test.remainder(new BigInteger("415648484821651896"));//나머지 연산
		
		
		
	}
	
	public static void 정규식예제()
	{
		/*
		
		String[] list = {"fdsa","321","a23aaa","5","ttt"};
		
		//정규식을 객체화 한다.
		Pattern p =  Pattern.compile("^[0-9]*$");
		
		
		for(String str : list)
		{
			//정규식과 비교할 데이터를 넣어준다.
			Matcher m = p.matcher(str);
			
			//일치여부를 반환한다.
			if(m.matches())
				System.out.println(str);
		}
		*/
	}
	
	
	public static int getRandom(int from, int to) {
		
		return (int)(Math.random() 
				* (Math.abs(to-from)+1))
				+ Math.min(from,to);
		
		}
	
	

	public static int count(String str, String target)
	{
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
			
		while(true) 
		{
			pos = str.indexOf(target,pos);
			if(pos!=-1) 
			{
				count++;
				pos += target.length(); // 찾은 문자열의 첫번째 위치가 pos에 들어가기때문에 찾을려는 문자의 길이만큼 증가
			}
			else //일치하는문자가 없으면 종료한다.
				break;
			
		}
		return count;

	}
	
	
}



