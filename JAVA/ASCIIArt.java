import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       
        char alphaBet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','?'};
       
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        String ascii[] = new String[H];
        String outMessage[] = new String[H];
        //initialize arrays
        for(int i=0;i<H;i++)
        {
        outMessage[i] = new String();
        ascii[i] = new String();
        }
        //read in ascii font
        for (int i = 0; i < H; i++) {
            ascii[i] = in.nextLine();
        }
        //loop through each letter of T
        for(int i = 0; i<T.length();i++)
        {
            int dex =0;
            char key = Character.toUpperCase(T.charAt(i));

            //find Index of the key
            for(int x = 0; x < alphaBet.length;x++)
            {
                char y = alphaBet[x];
                if( y==key)
                {
                    dex = x;
                    break;
                }
                else
                    dex = 26;
            }
                //build each outMessage line with substrings of ascii lines
            for(int j=0;j<H;j++)
            {
                 // System.out.println(ascii[j]);
                 outMessage[j] += ascii[j].substring(dex*L,dex*L+L);
            }
                    
        }
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
    for(int y =0;y<H;y++)
        System.out.println(outMessage[y]);
    }
}
