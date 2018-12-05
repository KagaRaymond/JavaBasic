/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero He = new SuperHero();
		Slime Ene = new Slime();

		He.setName("勇者（装備あり）");
		Ene.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item Bag = new Item("こんぼう",4);



		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
		He.setEquipment(Bag);


		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		while (true) {
			if(Ene.damage(He.attack())) {
				// slimedead
				System.out.println(He.getName() + "は" + Ene.getName()  + "との戦闘に勝利した");
				break;
			}

			if(He.damage(Ene.attack())) {
				// herodead
				System.out.println( Ene.getName() + "は" + He.getName()  + "との戦闘に勝利した");
				break;
			}

		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

	}
}
