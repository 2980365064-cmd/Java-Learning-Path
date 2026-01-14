package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class JigsawGameLogic implements KeyListener {
	public static void main(String[] args) {
		int[]arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	shuffle(arr);
	
	}
	//key listener
	private void listener() {
		JFrame jf=new JFrame();
		jf.getContentPane().addKeyListener(this);
	}
	
	private static void shuffle(int []arr) {
		//Create random index
		Random rd = new Random();
		
		//Shuffle order
		for (int i = 0; i < arr.length; i++) {
			int index=rd.nextInt(0,arr.length);
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		//print arr
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//store in 2D arr
		int[][] data =new int[4][4];
		//i<arr.length not data.length
		for (int i = 0; i < arr.length; i++) {
		data[i/4][i%4]=arr[i];
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}
