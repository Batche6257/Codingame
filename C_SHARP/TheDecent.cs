using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player
{
    static void Main(string[] args)
    {
    int[] heights = new int[8];
    int index = 0;
    int heighest =0;
        // game loop
        while (true)
        {
            for (int i = 0; i < 8; i++)
            {
                heights[i] = int.Parse(Console.ReadLine());
            }
            heighest = -1;
            for(int j = 0; j < 8; j++)
            {
                if(heights[j] > heighest)
                {
                    heighest = heights[j];
                    index = j;
                }    
            }
            Console.WriteLine(index); // The number of the mountain to fire on.
        }
    }
}
