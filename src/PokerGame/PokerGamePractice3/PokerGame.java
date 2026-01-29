package doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
	static ArrayList<String> list = new ArrayList<>();
         static HashMap<String,Integer>hm=new HashMap<>();
	//Prepare poker
	static {
		// "♦️" "♣️" "♥️""♠️"
		//"3","4","5","6","7","8","9","10","J","Q","K","A","2"
		String[] color = {"♦️", "♣️", "♥️", "♠️"};
		String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		for (String c : color) {
			for (String n : number) {
				String p = c + n;
				list.add(p);
			}
		}
		list.add("  大王");
		list.add("  小王");
		hm.put("J",11);
		hm.put("Q",12);
		hm.put("K",13);
		hm.put("A",14);
		hm.put("2",15);
		hm.put("小王",50);
		hm.put("大王",100);
	}
	
	public PokerGame() {
		//Shuffle poker
		Collections.shuffle(list);
		System.out.println(list);
		//Deal pokers to players
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> BottomCards = new ArrayList<>();
		//Get each card
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);
			if (i <= 2) {
				BottomCards.add(poker);
				continue;
			}
			if (i % 3 == 0) {
				player1.add(poker);
			} else if (i % 3 == 1) {
				player2.add(poker);
			} else {
				player3.add(poker);
			}
		}
		sort(player1);
		sort(player2);
		sort(player3);
		sort(BottomCards);
	}
	//Sort cards by value
	public void sort(ArrayList<String> list){
	Collections.sort(list, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			String color1 = o1.substring(0, 1);
			int value1=getValue(o1);
			
			String color2= o2.substring(0, 1);
			int value2=getValue(o2);
			
			int i = value1 - value2;
			return i==0?color1.compareTo(color2):i;
		}
	});
	}
	
	//
	public int getValue(String poker){
		String number = poker.substring(2);
		if(hm.containsKey(number)){
		return hm.get(number);
		}else{
		//Cast to Integer and return
		return Integer.parseInt(number);
		}
	}
}
