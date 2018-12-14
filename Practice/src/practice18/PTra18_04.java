/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<Player>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください
	                Player player = new Player();

	        		String[] list = line.split(",");

	                player.setPosition(list[0]);
	                player.setName(list[1]);
	                player.setCountry(list[2]);
	                player.setTeam(list[3]);

	                array.add(player);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        // 各ポジションごとのリストをつくる。
	        ArrayList<Player> gkList = new ArrayList<>();
	        ArrayList<Player> dfList = new ArrayList<>();
	        ArrayList<Player> mfList = new ArrayList<>();
	        ArrayList<Player> fwList = new ArrayList<>();

	        //最初にシャッフルしてしまう。
	        Collections.shuffle(array);

	        //振り分けるためのfor文
	        for(int i = 0; i < array.size(); i++) {
	        	if(array.get(i).getPosition().contains("GK")) {

	        		gkList.add(array.get(i));

	        	}else if(array.get(i).getPosition().contains("DF")) {

	        		dfList.add(array.get(i));

	        	}else if(array.get(i).getPosition().contains("MF")) {

	        		mfList.add(array.get(i));

	        	}else if(array.get(i).getPosition().contains("FW")){

	        		fwList.add(array.get(i));

	        	}
	        }
	        //出力するときにGK1名、DF4名、MF4名, FW2名を出力
	        for(int i = 0; i < 1; i++) {
	        	System.out.println(gkList.get(i));
	        }
	        for(int i = 0; i < 4; i++) {
	        	System.out.println(dfList.get(i));
	        }
	        for(int i = 0; i < 4; i++) {
	        	System.out.println(mfList.get(i));
	        }
	        for(int i = 0; i < 2; i++) {
	        	System.out.println(fwList.get(i));
	        }

	}
}
