import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player 
{
    
    public static Point rightNbr = new Point();
    public static Point downNbr = new Point();
    public static Point current= new Point();
    public static Point p = new Point();
        
    public static void main(String args[]) 
	{
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        int[][] grid = new int[width][height];
        
        for (int i = 0; i < height; i++)
		{
          String  row = in.nextLine(); // width characters, each either 0 or .
            for(int j=0;j<width;j++)
			{
                if(row.charAt(j) == '0')
				{
                grid[j][i] = 1;
                }
                else
				{
                grid[j][i] = 0;
                }
            }
        }
        
         for( int y =0; y < height; y++)
        {
            for(int x =0; x < width;x++) 
            {
                if(grid[x][y] == 1)
                {
                current.change(x,y);
                rightNbr = findRghtNbr(current,grid,width);
                downNbr = findDwnNbr(current,grid,height);
                System.out.println(current+" "+rightNbr+" "+downNbr);
                }        
            } 
            
            //System.out.println("0 0 1 0 0 1");
        }
    }
    
    public static Point findRghtNbr(Point ourHouse, int[][] grid,int width)
    {
        p = new Point(-1,-1);
        if(ourHouse.getX()+1 > width)return p;
        else
		{
            for(int i = ourHouse.getX()+1; i<width; i++)
			{
                if(grid[i][ourHouse.getY()] == 1)
				{
                    p.change(i,ourHouse.getY());
                    return p;
                }
        }
        return p;
        }
    }
    
    
    public static Point findDwnNbr(Point ourHouse,int[][] grid, int height)
    {
        Point p = new Point(-1,-1);
        
        if(ourHouse.getY() >=height)
        return p;
        else
	    	{
            for(int i = ourHouse.getY()+1; i<height; i++)
		        {
                if(grid[ourHouse.getX()][i] == 1)
			        	{
                    p.change(ourHouse.getX(),i);
                    return p;
                }
            }
        }
        return p;
    }    
    //built a quick Point class, wasn't sure what imports codingame would allow
 public static class Point
  {
 int x;
 int y;

    public Point()
    {
        x=0;
        y=0;
    }       
    public Point(int a, int b)
    {
     x=a;
     y=b;   
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void change(int a, int b)
    {
     x=a;
     y=b;
    }
    
    public String toString()
    {
        return ""+x+" "+y+"";    
    }
    
 }
}
