import java.awt.Point;
import java.math.*;


public class A {

	static Point _position = new Point();
	static boolean goalReached = false;
	public String [] _environment;
	public Point _startPosition;
	public Point _zielPosition;
	
	public A(String[] environment, Point startPosition, Point zielPosition)
	{
		_environment = environment;
		_startPosition= startPosition;
		_zielPosition= zielPosition;
	}
	
	public int berechneDistanzG(Point position, Point ziel)
	{ 
		int a= (int)(Math.pow((ziel.x- position.x), 2));
		int b= (int)(Math.pow((ziel.y- position.y), 2));
		int c =(int) (Math.sqrt(a+b));
		
		return c;
	}
	
	
	
}
