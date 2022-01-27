package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		printMenu();
		menu_choice();
	}
	
	
	public static void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}
	
	
	public static void menu_choice() throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<String, String>();
		String N;
		do {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print(">");
			N = br.readLine();
			if(N.equals("1")) {
				System.out.println("[일정 등록] 날짜를 입력하세요.");
				System.out.print(">");
				String day = br.readLine();
				System.out.println("일정을 입력하세요");
				System.out.print(">");
				String work = br.readLine();
				map.put(day, work);
				System.out.println("일정이 등록되었습니다");
			}
			else if(N.equals("2")) {
				System.out.println("[일정 검색] 날짜를 입력하세요");
				System.out.print(">");
				String checkday = br.readLine();
				if(map.containsKey(checkday)) {
					System.out.println("1개의 일정이 있습니다");
					System.out.println(map.get(checkday));
				}
				else {
					System.out.println("일정이 존재하지 않습니다");
				}
				
			}
			else if(N.equals("3")) {
				System.out.println("년도를 입력해주세요");
				System.out.print("YEAR>");
				String year = br.readLine();
				System.out.println("달을 입력하세요");
				System.out.print("MONTH>");
				String month = br.readLine();
				findleapyear(year, month);
				
				
			}
			else if(N.equals("h")) {
				printMenu();
			}
		}while(!N.equals("q"));
		System.out.println("Bye");
	}
	static void findleapyear(String year, String month) {
		
		int lastday = 0;
		int number = Integer.parseInt(month);
		
		if(month.equals("2")) {
			if(Integer.parseInt(year) % 4 == 0) {
				if( Integer.parseInt(year) % 400 == 0) {
					lastday = 29;
				}
				else if((Integer.parseInt(year) % 100 == 0) ) {
					lastday = 28;
				}
				else {
					lastday = 28;
				}
			}
			else {
				lastday = 28;
			}
		}
		else {
			switch(number){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastday = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastday = 30;
				break;
			}
		}
		findcal(year, month, lastday);
	}
	
	
	static void findcal(String year, String month, int lastday) {
		
		int count = 0;
		int start = 0;
		int line = 0;
		Calendar date = Calendar.getInstance(); 
		
		System.out.println("<"+year+"년  "+ month + "월>");
		
		date.set(Integer.parseInt(year), Integer.parseInt(month)-1, 1);
		int weekday = date.get(Calendar.DAY_OF_WEEK);
		
//		if(weekday == 1) {
//			count = 0;
//		}
//		else if(weekday == 2) {
//			count = 1;
//		}
//		else if(weekday == 3){
//			count = 2;
//		}
//		else if(weekday == 4){
//			count = 3;
//		}
//		else if(weekday == 5){
//			count = 4;
//		}
//		else if(weekday == 6){
//			count = 5;
//		}
//		else if(weekday == 7) {
//			count = 6;
//		}
		
		switch(weekday) {
		case 1:
			count = 0;
			break;
		case 2:
			count = 1;
			break;
		case 3:
			count = 2;
			break;
		case 4:
			count = 3;
			break;
		case 5:
			count = 4;
			break;
		case 6:
			count = 5;
			break;
		case 7:
			count = 6;
			break;
		}
		
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		for(int i = 1; i <= lastday; i++) {
			if(start == 0) {
				for(int j = 0; j < count; j++) {
					System.out.print("   ");
					start ++;
				}
			}
			if(i<10) {
				System.out.print(" "+i);
			}
			else {
				System.out.print(i);
			}
			System.out.print(" ");
			if((i % (7-count) == 0) && line == 0) {
				System.out.println();
				line ++;			
			}
			else if((i % 7  == 7-count) && line > 0) {
				System.out.println();
				
			}
		}
		System.out.println();
	}
}

