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
class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()); // the number of temperatures to analyse
        string t = Console.ReadLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        string[] temps = t.Split(' ');
        int result = 5526;
        int[] nums = new int[temps.Length];
        
        if(n==0)Console.WriteLine(0);
        else{
        for(int i = 0; i< nums.Length;i++)
        {
         nums[i] = int.Parse(temps[i]);   
        }
        
        foreach(int temp in nums){
            if(Math.Abs(temp) <= Math.Abs(result))
            {
                 if(temp == result* -1)
                    result = Math.Abs(result);
                else
                    result = temp;
            }
        }

        Console.WriteLine(result);
    }
    }
}
