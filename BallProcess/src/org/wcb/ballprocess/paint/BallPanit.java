package org.wcb.ballprocess.paint;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

 /**
 * @author pc
 *
 */
public class BallPanit extends JPanel{
	int radius;
	 Point center;
   public BallPanit(int radius,Point center){
	   
	   this.radius=radius;
	   this.center=center;
	   
	   
   }
   
   public void paintChildren(Graphics g){
	   super.paintChildren(g);
	   
	   g.drawOval(center.x, center.y,  radius,  radius);
	   
	   
   }
   
}
