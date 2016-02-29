package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(800,800);
		Circle c1 = new Circle(300,200,200);
		Circle c3 = new Circle(200,300,200);
		Circle c4 = new Circle(400,300,200);
		Circle c2 = new Circle(300,400,200);

		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,205,400,205);
		pic.add(c1);
		pic.add(c3);
		pic.add(c4);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	
	}
}
