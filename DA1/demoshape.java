import java.util.*;
class geometry{
	double x;
	double y;
	String colour;
	geometry(double x ,double y, String colour ){
		this.x=x;
		this.y=y;
		this.colour=colour;
	}
	void printt(){
		System.out.println("x and y are "+x+" "+y+"respectivly");
		System.out.println("coulour is: " +colour);
	}
}
class circle extends geometry{
	double  radius;
	double area;
	circle(double x,double y,String colour,double radius){
		super(x,y,colour);
		this.radius=radius;
		
	}
	double area(){
			return Math.PI * radius*radius;
	}
	void printt(){
			super.printt();
			System.out.println("area of circle with radius "+radius+" is: ");
			System.out.println(area());
	}
}
class rectangle  extends geometry{
	double  l;
	double w;
	rectangle(double x,double y,String colour,double l,double w){
		super(x,y,colour);
		this.l=l;
		this.w=w;
		
	}
	double area(){
			return l*w;
	}
	void printt(){
			super.printt();
			System.out.println("area of rectangle with l= "+l+" width "+w+" is:");
			System.out.println(area());
	}
}
public class demoshape {
    public static void main(String[] args) {
        circle c= new circle(5, 10, "Red", 7);
        System.out.println("Circle Details:");
        c.printt();
        rectangle r = new rectangle(15, 25, "Blue", 10, 20);
        System.out.println("\nRectangle Details:");
        r.printt();
    }
}