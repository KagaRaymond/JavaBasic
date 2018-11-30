package practice;

import practice.logics.PracticeLogic16;

public class Practice16 {

	public static void main(String[] args) {
		int age = new java.util.Scanner(System.in).nextInt();

		boolean result = PracticeLogic16.chechChild(age);

		if(result) {
			System.out.println("子供");
		}else {
			System.out.println("大人");
		}
	}

}
