package com.GUI2;

import java.awt.Color;
import java.io.Serializable;

public class QIZi implements Serializable{
	private int x;//�����е�x����  
	private int y;//�����е�y����  
	private Color color;//��ɫ  
	public static final int SIZE=40;//ֱ��  
	   
	public QIZi(int x,int y){  
	    this.setX(x);  
	    this.setY(y);    
	} 
	public QIZi(int x,int y,Color color){  
	    this.setX(x);  
	    this.setY(y);  
	    this.setColor(color);  
	}
	
	public int getX() {
		return x; 
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}   
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}    
	
}