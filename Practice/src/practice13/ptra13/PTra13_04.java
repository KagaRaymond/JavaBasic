/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero You = new Hero();
		Slime Enemy = new Slime();

		You.setName("勇者");
		Enemy.setName("スライム");


		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while (true) {
			if(Enemy.damage(You.attack())) {
				// slimedead
				System.out.println(You + "は" + Enemy  + "との戦闘に勝利した");
				break;
			}

			if(You.damage(Enemy.attack())) {
				// herodead
				System.out.println( Enemy + "は" + You  + "との戦闘に勝利した");
				break;
			}
			return;
		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
	}
}
