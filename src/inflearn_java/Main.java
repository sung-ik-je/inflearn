package inflearn_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		menu();
		menu_choice();
	}
	public static void menu() {
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
				System.out.println("일 월 화 수 목 금 토");
				System.out.println("--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				
			}
			else if(N.equals("h")) {
				System.out.println("+----------------------+");
				System.out.println("| 1. 일정 등록");
				System.out.println("| 2. 일정 검색");
				System.out.println("| 3. 달력 보기");
				System.out.println("| h. 도움말 q. 종료");
				System.out.println("+----------------------+");
			}
		}while(!N.equals("q"));
		System.out.println("Bye");
	}
}

