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
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
                       ,'O','P','Q','R','S','T','U','V','W','X','Y','Z','?'};
       
        int L = int.Parse(Console.ReadLine());
        int H = int.Parse(Console.ReadLine());
       
        string T = Console.ReadLine().ToUpper();
        string[] ROW = new String[H];
        string[] message = new string[H];
        
        for (int i = 0; i < H; i++)
        {
             ROW[i] = Console.ReadLine();
        }
        for(int j = 0; j<T.Length;j++)
        {
         int dex;
         dex = Array.IndexOf(alpha,T[j]);
         if(dex == -1)dex = alpha.Length-1;
         for(int k = 0; k <H; k++)
         {
         message[k] += ROW[k].Substring(dex*L,L);
         }
        }
        // Write an action using Console.WriteLine()
        // To debug: Console.Error.WriteLine("Debug messages...");
        foreach(string line in message)
        Console.WriteLine(line);
    }
}
