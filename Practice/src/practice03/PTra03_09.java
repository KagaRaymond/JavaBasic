package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("０～６までの数字を入力してください");

		int num = scanner.nextInt();

		if (num == 0) {
			System.out.println("０：日曜");
		} if (num == 1) {
			System.out.println("１：月曜");
		} if (num == 2) {
			System.out.println("２：火曜");
		} if (num == 3) {
			System.out.println("３：水曜");
		} if (num == 4) {
			System.out.println("４：木曜");
		} if (num == 5) {
			System.out.println("５：金曜");
		} if (num == 6) {
			System.out.println("６：土曜");
		} if (num <= 0 || num >= 7) {
			System.out.println("0～6の整数を入力してください");
		}
	}
}
