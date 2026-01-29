package doudizhu2;

import java.util.*;

public class PokerGame {
	//The first sort rule
	//Bind cards with number
	static  HashMap<Integer,String>hm=new HashMap<>();
	//Cards box
	static ArrayList<Integer>list=new ArrayList<>();
	
	static {
		// "♦️" "♣️" "♥️""♠️"
		//"3","4","5","6","7","8","9","10","J","Q","K","A","2"
		String[]color={"♦️" ,"♣️", "♥️","♠️"};
		String[]number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		int seriaNumber=1;
		for (String n : number) {
			for (String c : color ) {
			String p=c+n;
			hm.put(seriaNumber,p);
			list.add(seriaNumber);
			seriaNumber++;
			}
		}
		hm.put(seriaNumber,"小王");
		list.add(seriaNumber);
		seriaNumber++;
		hm.put(seriaNumber,"大王");
		list.add(seriaNumber);
		System.out.println(hm);
	}
	public  PokerGame(){
	        //Shuffle poker
		Collections.shuffle(list);
		System.out.println(list);
		//Deal Cards to players
		TreeSet<Integer>player1=new TreeSet<>();
		TreeSet<Integer>player2=new TreeSet<>();
		TreeSet<Integer>player3=new TreeSet<>();
		TreeSet<Integer>BottomCards=new TreeSet<>();
		//Get each card
		for (int i = 0; i < list.size(); i++) {
			if(i<=2){
				BottomCards.add(list.get(i));
			}
			if(i%3==0){
				player1.add(list.get(i));
			}else  if(i%3==1){
				player2.add(list.get(i));
			}else {
				player3.add(list.get(i));
			}
		}
		lookPoker("底牌",BottomCards);
		lookPoker("唐凯",player1);
		lookPoker("伍钰涛",player2);
		lookPoker("袁子翔",player3);
	}
	public void lookPoker(String name,TreeSet<Integer>ts){
		System.out.print(name+":");
		for (Integer t : ts) {
			System.out.print(hm.get(t)+" ");
		}
		System.out.println();
	}
}
