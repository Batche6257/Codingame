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
        int N = int.Parse(Console.ReadLine()); // Number of elements which make up the association table.
        int Q = int.Parse(Console.ReadLine()); // Number Q of file names to be analyzed.
        Hashtable mimes = new Hashtable();
        string FNAME ="";
        for (int i = 0; i < N; i++)
        {
            string[] inputs = Console.ReadLine().Split(' ');
            string EXT = inputs[0]; // file extension
            string MT = inputs[1]; // MIME type.
            mimes.Add(EXT,MT);
        }
        for (int i = 0; i < Q; i++)
        {
            FNAME = Console.ReadLine(); // One file name per line.
            int x = FNAME.LastIndexOf('.');

            if(x < 0){
                Console.WriteLine("UNKNOWN");
            }
            else if(mimes.ContainsKey(FNAME.Substring(x))){
                string type = FNAME.Substring(x);
                Console.WriteLine(mimes[FNAME.Substring(x)]);   
            }
                
        }
        
        
        // Write an action using Console.WriteLine()
        // To debug: Console.Error.WriteLine("Debug messages...");


        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.

    }
}
