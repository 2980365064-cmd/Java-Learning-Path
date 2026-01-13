package jigsawgame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
	//Manage data
	int[][] data=new int[4][4];
	int x=0;
	int y=0;
	
	public GameJFrame(){
		//Initialize interface
		this.initJFrame();
		
		//Initialize menu
		this.initJMenuBar();
		
		//initialize data
		initData();
		
		
		//initialize image
		this.initImage();
		
		//Display the interface
		this.setVisible(true);
		
		
	}
	
	private void initData() {
	
		int []temp={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		Random r=new Random();
		for (int i = 0; i < temp.length; i++) {
			int index=r.nextInt(0,temp.length);
			int temp1=temp[i];
			temp[i]=temp[index];
			temp[index]=temp1;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]==0){
				x=i/4;
				y=i%4;
			}else {
				data[i / 4][i % 4] = temp[i];
			}
		}
	}
	
	private void initImage() {
		this.getContentPane().removeAll();
	
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				int num =data[i][j];
				//create JLabel instance
				JLabel jLabel=new JLabel(new ImageIcon("D:\\helloworld\\image\\animal\\animal3\\"+num+".jpg"));
				//specify image coordinate
				jLabel.setBounds(105*j+83,105*i+134,105,105);
				setLayout(null);
				//Add image frame
				jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
				//add JLabel to main interface
				this.getContentPane().add(jLabel);
			}
			
		}
		//Add a background
		ImageIcon bg=new ImageIcon("D:\\helloworld\\image\\background.png");
		JLabel bc=new JLabel(bg);
		this.getContentPane().add(bc);
		bc.setBounds(40,40,508,560);
		
		this.getContentPane().repaint();
		
	}
	
	private void initJMenuBar() {
		//initialize the menu
		JMenuBar jMenuBar=new JMenuBar();
		
		JMenu functionJmenu=new JMenu("功能");
		JMenu aboutJmenu=new JMenu("点这里捐款，不然给你种病毒");
		
		JMenuItem replayItem=new JMenuItem("重新游戏");
		JMenuItem reLoginItem=new JMenuItem("重新登陆");
		JMenuItem closeItem=new JMenuItem("关闭游戏");
		
		JMenuItem accountItem=new JMenuItem("捐款码");
		//Add item to option
		functionJmenu.add(replayItem);
		functionJmenu.add(reLoginItem);
		functionJmenu.add(closeItem);
		aboutJmenu.add(accountItem);
		
		//Add menu to bar
		jMenuBar.add(functionJmenu);
		jMenuBar.add(aboutJmenu);
		
		//set interface menu
		this.setJMenuBar(jMenuBar);
	}
	
	private void initJFrame() {
		//Set width and height
		this.setSize(603,680);
		//set title
		this.setTitle("拼图单机版");
		//Make the window always on top
		this.setAlwaysOnTop(true);
		//center the window
		this.setLocationRelativeTo(null);
		//set close operation
		this.setDefaultCloseOperation(3);
		//Add keyListen
		this.addKeyListener(this);
		this.setFocusable(true);      // 允许窗口获取焦点
		this.requestFocusInWindow();  // 主动请求焦点
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	//Determine movement direction
	int code=e.getKeyCode();
	if(code==37){
		if(y==0){
			return;
		}
		data[x][y]=data[x][y-1];
		data[x][y-1]=0;
		y--;
		System.out.println("向左移动");
		initImage();
	}else  if(code==38){
		if(x==0){
			return;
		}
	 data[x][y]=data[x-1][y];
	 data[x-1][y]=0;
	x--;
	StringBuilder sc=new StringBuilder();
	String s="sss";
	
		System.out.println("向上移动");
	initImage();
	}else  if(code==39){
		if(y==3){
			return;
		}
		data[x][y]=data[x][y+1];
		data[x][y+1]=0;
		y++;
		System.out.println("向右移动");
		initImage();
	}else  if(code==40){
		if(x==3){
			return;
		}
		data[x][y]=data[x+1][y];
		data[x+1][y]=0;
		x++;
		System.out.println("向下移动");
		initImage();
		
	}
	}
}
