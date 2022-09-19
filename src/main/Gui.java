package main;


import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Gui extends JFrame{ 
	
	private static final long serialVersionUID = 1L;
	private Display display;
	private Gameframe gameframe;
	
	public Gui(Window window, Gameframe gameframe) {
		super("Title");
		this.gameframe=gameframe;
		
		display =new Display(this, gameframe);
		add(display,BorderLayout.CENTER);
		
		//Mouse Handler
		HandlerClass handler=new HandlerClass();
		display.addMouseListener(handler);
		display.addMouseMotionListener(handler);
		
		//Exit key
		addKeyListener(
				new KeyAdapter() {
					public void keyPressed(KeyEvent ke) {  // handler
						if(ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
							if(gameframe.getMode().equals("Menu")) {
								System.exit(0);
							}else {
								gameframe.setMode("Menu");
							}
							
						}else if(ke.getKeyCode() == KeyEvent.VK_F) {
							
							
						}else if(ke.getKeyCode() == KeyEvent.VK_C) {
							
							
						}else if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
							
							
						}else if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
							
							
						}
					}
				}
		);
	}
	
	public void redraw() {
		display.redraw();
	}
	
	private class HandlerClass implements MouseListener,MouseMotionListener{

		public void mouseClicked(MouseEvent e) {
			
		}

		public void mouseEntered(MouseEvent e) {
			
		}

		public void mouseExited(MouseEvent e) {
			
		}

		public void mousePressed(MouseEvent e) {
			
		}

		public void mouseReleased(MouseEvent e) {
			double x=e.getX();
			double y=e.getY(); 
			int size;
			int startX, startY;
			if(gameframe.getMode().equals("Menu")) {
				if((getWidth()/(3))<getHeight()/5) {
					size=getWidth()/(3);
				}else {
					size=getHeight()/(5);
				}
				startX=(int)((getWidth()/2.0)-((size*3)/2.0));
				startY=(int)((getHeight()/2.0)-((size*5)/2.0));
				
				if((x>startX&&x<(startX+(size*3)))&&(y>startY+(size*2)&&y<(startY+(size*5)))) {
					if(y<startY+(size*3)) {
						gameframe.setMode("Mode1");
					}else if(y<startY+(size*4)) {
						gameframe.setMode("Mode2");
					}else if(y<startY+(size*5)) {
						System.exit(0);
					}
				}
			}
		}
		
		public void mouseMoved(MouseEvent arg0) {
			
		}
		
		public void mouseDragged(MouseEvent e) {
			
		}
	}
}
