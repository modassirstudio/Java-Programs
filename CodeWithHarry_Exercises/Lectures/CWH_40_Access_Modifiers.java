package codeWithHarry;
class a{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class circle{
	private int radius;
	public void setRadius(int r) {
		this.radius = r;
	}
	public int getRadius() {
		return radius;
	}
	
	private int area;
	public void setArea(int a) {
		int finalArea = (int)(Math.PI * radius * radius);
		if(finalArea == a) {
			this.area = a;
			System.out.println("Radius = " + radius + " cm" + "\nArea = " + area + " cm²");
		}else {
			System.out.println("Error: Expected area for radius " + radius + " is " + finalArea + ", but got " + a);
		}
	}
	public int getArea() {
		return area;
	}
}
public class CWH_40_Access_Modifiers {
	public static void main(String [] args) {
		a a = new a();
		a.setId(1234);
		a.setName("Modassir");
		System.out.println("Name = " + a.getName() + "\nID = " + a.getId());
		
		circle c = new circle();
		c.setRadius(6);
		c.setArea(113);
		
	}
}
