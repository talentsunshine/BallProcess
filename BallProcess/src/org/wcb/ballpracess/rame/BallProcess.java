package org.wcb.ballpracess.rame;

import java.awt.Point;

import javax.swing.JFrame;

import org.wcb.ballprocess.paint.BallPanit;

public class BallProcess extends JFrame{
	public BallProcess(){
		this.setSize(600,800);
		this.getContentPane().add(new BallPanit(200,new Point(this.getSize().width/2,this.getSize().height/2)));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public  static void main(String args[]){
		new BallProcess();
		
	}

}
