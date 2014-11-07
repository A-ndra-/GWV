import java.awt.Point;
import java.io.IOException;
import java.util.Stack;


public class Main 

		{

	static Point _position = new Point();
	public static void main(String[] args) throws IOException {
		
		Reader reader = new Reader("./src/blatt3_environment.txt");
		String[] environmentA = reader.getEnvironment();
		
		for (int y = 0; y < 10; ++y)
		{
			String lineA = "";
			lineA = lineA + environmentA[y];

			System.out.println(lineA);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("A* X: " + reader.getStartPosX() + ", Y: " + reader.getStartPosY());
		
//		A a = new A(environmentA, reader.getStartPosX(), reader.getStartPosY());
//		Stack<Character> goalPathDFS = A.startDFS();
		
//		System.out.println(goalPathDFS.toString());
//		for (int y = 0; y < 10; ++y)
//		{
//			String lineDFS = "";
//			for (int x = 0; x <20; ++x)
//			{
//				lineDFS = lineDFS + environmentDFS[y][x];
//			}
//			System.out.println(lineDFS);
//		}
//		
//		System.out.println("DFS X: " + reader.getStartPosX() + ", Y: " + reader.getStartPosY());
//		
//		Search dfs = new Search(environmentDFS, LINE_LENGTH, LINE_COUNT, reader.getStartPosX(), reader.getStartPosY());
//		Stack<Character> goalPathDFS = dfs.startDFS();
//		
//		System.out.println(goalPathDFS.toString());
		
	}

}
