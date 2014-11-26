import graphics.*;

public class Ani
{
	public static void main(String [] args)
	{
		// Create a drawing window
		int windowWidth = 900;
		int windowHeight = 500;
		Window win = new Window(windowWidth, windowHeight);
		Circle ball = new Circle(50, 250, 50);
		int xDir = 1;
		int yDir = 1;
		// Loop forever
		while(true)
		{
			// Erase circle
			win.erase(ball);
			// Move circle
			ball.move(xDir, yDir);
			// Draw a circle
			win.draw(ball);
			// wait 40 milliseconds (time of a typical scene from a film at 25 frames/sec.)
			long start = System.currentTimeMillis();
			while(System.currentTimeMillis() <  start + 5)
				;

			// If we go off the edge, change direction
			if(ball.getX() + ball.getWidth() >= windowWidth)
				xDir = -xDir;
			else if(ball.getX() <= 0)
				xDir = -xDir;
			if(ball.getY() + ball.getHeight() >= windowHeight)
				yDir = -yDir;
			else if(ball.getY() <= 0)
				yDir = -yDir;
		}
	}	
}