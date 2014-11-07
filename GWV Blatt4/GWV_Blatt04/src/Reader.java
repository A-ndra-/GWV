import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {
	
	String _location;
	private String[] _environment; 

	static Point _position = new Point();
	
	public Reader(String location) throws IOException
	{
		_location = location;
		
		readEnvironment();
		
	}
	
	private void readEnvironment() throws IOException
	{
	
		BufferedReader reader = new BufferedReader(new FileReader(_location)); //File wird geladen in den Reader
		
		String [] environment = new String[10]; //Das Array wird initialisiert.
		
		for (int currentLine = 0; currentLine < 10; ++currentLine) //Wird durchsucht
		{
			String line = reader.readLine();
			environment[currentLine] = line;
			
		}
		
		reader.close();
		_environment = environment;
	}

	public String[] getEnvironment() 
	{
		return _environment;
	}
	
		public Point startposition() 
		{
			_position.y = yKoordinateS();
			_position.x = xKoordinateS(_position.y);
			return _position;
		}

		private int yKoordinateS() 
		{
			int yKoordinateS = 0;
			for (int i = 0; i < _environment.length; i++)
			{
				if (_environment[i].contains("s") )
				{
					yKoordinateS = i;
				}
			}
			return yKoordinateS;
		}

		private int xKoordinateS(int yKoordinate) 
		{
			int xKoordinateS = 0;
			for (int i = 0; i < 9; i++)
			{
				if (_environment[yKoordinate].charAt(i) == 's')
						
				{
					xKoordinateS = i;
				}
			}
			return xKoordinateS;
		}
		
		public Point zielposition() 
		{
			_position.y = yKoordinateG();
			_position.x = xKoordinateG(_position.y);
			return _position;
		}

		private int yKoordinateG() 
		{
			int yKoordinateG = 0;
			for (int i = 0; i < _environment.length; i++)
			{
				if (_environment[i].contains("g") )
				{
					yKoordinateG = i;
				}
			}
			return yKoordinateG;
		}

		private int xKoordinateG(int yKoordinate) 
		{
			int xKoordinateG = 0;
			for (int i = 0; i < 9; i++)
			{
				if (_environment[yKoordinate].charAt(i) == 'g')
						
				{
					xKoordinateG = i;
				}
			}
			return xKoordinateG;
		}
	}

//if (currentChar == START_CHAR) //Falls Startpunkt gefunden, wird die Position festgestellt.
//{
//	_startPos = new int[2];
//	_startPos[0] = currentLine;
//	_startPos[1] = linePos;		
//	
//	for (int linePos = 0; linePos < line.length(); ++linePos)
//	{
//		char currentChar = line.charAt(linePos);
//
//		
//	}
//}
//}