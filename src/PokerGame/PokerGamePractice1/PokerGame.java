package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame{
	static ArrayList<String>list=new ArrayList<>();
	//Prepare poker
	static {
	// "♦️" "♣️" "♥️""♠️"
	//"3","4","5","6","7","8","9","10","J","Q","K","A","2"
		String[]color={"♦️" ,"♣️", "♥️","♠️"};
		String[]number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for (String c : color) {
			for (String n : number) {
				String p=c+n;
				list.add(p);
			}
		}
		list.add("大王");
		list.add("小王");
	}
	public PokerGame(){
		//Shuffle poker
		Collections.shuffle(list);
		System.out.println(list);
	        //Deal pokers to players
		ArrayList<String>player1=new ArrayList<>();
		ArrayList<String>player2=new ArrayList<>();
		ArrayList<String>player3=new ArrayList<>();
		ArrayList<String>BottomCards=new ArrayList<>();
		//Get each card
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);
			if(i<=2){
				BottomCards.add(poker);
				continue;
			}
			 if(i%3==0){
			 player1.add(poker);
			}else if(i%3==1){
				player2.add(poker);
			}else {
				player3.add(poker);
			}
		}
		//show cards
		lookPoker("底牌",BottomCards);
		lookPoker("唐凯",player1);
		lookPoker("伍钰涛",player2);
		lookPoker("袁子翔",player3);
	
	
	
	
	}
	public void lookPoker(String playerName,ArrayList<String>list){
		System.out.print(playerName+":");
		for (String p : list) {
			System.out.print(p+" ");
		}
		System.out.println();
	}
}
