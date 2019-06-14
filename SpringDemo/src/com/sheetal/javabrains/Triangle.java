package com.sheetal.javabrains;

import java.util.List;

public class Triangle {
	/*private String type;
	private int height;*/
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	/*public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}
	
	public Triangle(String type){
		this.type = type;
		
	}
	public Triangle(String type,int height){
		this.type = type;
		this.height=height;
	}
	public Triangle(int height){
		this.height = height;
		
	}*/
	/*public void setType(String type) {
		this.type = type;
	}
*/
	public void drawShape(){
		for(Point point:points){
			System.out.println(point.getX() + " , " +point.getY() );
		}
		
	}
}
