package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car = new Car();

		Car car2 = new Car();

		Car car3 = new Car();


		car.color = "Red";
		car2.color = "Green";
		car3.color = "Blue";

		car.gasoline = 50;
		car2.gasoline = 40;
		car3.gasoline = 25;


		// 目的地までの距離
		final int distance = 300;

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */
		int sum = 0;
		int count = 0;

		while(true) {
			int run = car.run();
			count ++;
			if(run == -1){
				System.out.println("目的地に到達できませんでした");
				break;
			}

			sum += run;
			System.out.println(sum);

			if(distance < sum) {
				System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
				break;
			}
		}

		int sum2 = 0;
		int count2 = 0;
		while(true) {
				int run2 = car2.run();
				count2 ++;
				if(run2 == -1){
					System.out.println("目的地に到達できませんでした");
					break;
				}

				sum2 += run2;
				System.out.println(sum2);

				if(distance < sum2) {
					System.out.println("目的地にまで" + count2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
					break;
				}
			}

		int sum3 = 0;
		int count3 = 0;
		while(true) {
					int run3 = car3.run();
					count3 ++;
					if(run3 == -1){
						System.out.println("目的地に到達できませんでした");
						break;
					}

					sum3 += run3;
					System.out.println(sum3);

					if(distance < sum3) {
						System.out.println("目的地にまで" + count3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
						break;
					}
				}
	}
}


