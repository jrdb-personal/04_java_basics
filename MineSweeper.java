package exercise_minesweeper;


import java.io.*;
import java.util.*;
public class MineSweeper 
{

    public MineSweeper() 
    {
    }
    
    public static void main (String args[])throws IOException
    {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int m, n, p, r, c, x, y, xcoord, ycoord, ctr, b, dx, dy;
    Random rand = new Random();
    String bmbt;
    boolean t;
    
    System.out.println("Please enter the 1st dimension: ");
    m = Integer.parseInt(bf.readLine());
    
    System.out.println("Please enter the 2nd dimension: ");
    n = Integer.parseInt(bf.readLine());
    
    System.out.println("Please enter the number of bombs: ");
    p = Integer.parseInt(bf.readLine());
    
    String array[][]= new String[m][n];
    
    for (r=0; r<m; r++)
    {
    	for (c=0; c<n; c++)
    	{
    		array[r][c]="";
    	}
    }
    
    ctr = 0;

    while (ctr<p)
    {
    x = rand.nextInt(m);
    y = rand.nextInt(n);
    if (array[x][y] == "")	
    {
    	array[x][y] = "*";
    	ctr = ctr + 1;
    }
    	
    else
    	ctr = ctr;	
    }
    
    r=0;
    c=0;
    while(r<m)
    {
    	while(c<n)
    	{
    		if (array[r][c] != "*")
    		{
				b = 0;
    			dx = -1;
    			dy = -1;
    			xcoord = r;
    			ycoord = c;
    			x = xcoord+dx;
    			y = ycoord+dy;
    			
    			while(x<r+2)
    			{
    				while(y<c+2)
    				{
    					if ((y > -1) && (y<n) && (x > -1) && (x<m))
    					{
    						if (array[x][y] == "*")
    						{
    							b++;
    							array[r][c] = Integer.toString(b);
    							System.out.println(b);
    							dy++;
    						}
    					}
    					else
    					{
    						dy++;
    					}
    					x = xcoord+dx;
    					y = ycoord+dy;
    				}
    				dx++;
    				dy = -1;
    				x = xcoord+dx;
    				y = ycoord+dy;
    			}
    		}
    		
    		c++;
    	}
    	c = 0;
    	r++;
    }
   
        for (r=0; r<m; r++)
        {
            for (c=0; c<n; c++)
            {
                    System.out.print(array[r][c]);
            }
            System.out.println("");
        }
    }    
}