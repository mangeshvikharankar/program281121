package Program;


import java.util.*;
public class Rectangle
{
    double length,width,area;
	String colour;
	
	void get_length(){
		System.out.println("Enter Length");
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
	}
	void get_width(){
		System.out.println("Enter Width");
		Scanner sc = new Scanner(System.in);
		width = sc.nextDouble();
	}
	void get_colour(){
		System.out.println("Enter Colour");
		Scanner sc = new Scanner(System.in);
		colour = sc.next();
	}
	void get_area(){
		area = length*width;
		System.out.println("Area of Rectange: "+area);
	}
	
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle();
		
		r1.get_length();
		r1.get_width();
		r1.get_colour();
		r1.get_area();
		
		System.out.println("Next Rectangle");
		
		r2.get_length();
		r2.get_width();
		r2.get_colour();
		r2.get_area();
		
		if((r1.area==r2.area)&&(r1.colour.equalsIgnoreCase(r2.colour))){
			System.out.println("Rectangles are same");
		}
		else{
			System.out.println("Rectangles are not same");
		}	
	}	
	}