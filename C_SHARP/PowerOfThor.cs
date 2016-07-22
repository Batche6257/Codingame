using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;


class Player
{
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int lightX = int.Parse(inputs[0]);
        int lightY = int.Parse(inputs[1]); 
        int initialTX = int.Parse(inputs[2]);
        int initialTY = int.Parse(inputs[3]);

        // game loop
        while (true)
        {
            string dir = "";
            int remainingTurns = int.Parse(Console.ReadLine()); 
  if(lightX > initialTX && lightY > initialTY){
                dir = "SE";
                initialTX++;
                initialTY++;
            }
            else if(lightX > initialTX && lightY < initialTY){
                dir="NE";
                initialTX++;
                initialTY--;
            }
            else if(lightX > initialTX && lightY == initialTY){
                dir="E";
                initialTX++;
            }
            else if(lightX< initialTX && lightY == initialTY){
                dir="W";
                initialTX--;
            }
            else if(lightX < initialTX && lightY > initialTY){
                dir="SW";
                initialTX--;
                initialTY++;
            }
            else if(lightX < initialTX && lightY < initialTY){
                dir="NW";
                initialTX--;
                initialTY--;
            }
            else if(lightY < initialTY && lightX == initialTX){
                dir="N";
                initialTY--;
            }
            else if(lightY > initialTY && lightX == initialTX){
                dir="S";
                initialTY++;
            }
            // Write an action using Console.WriteLine()
            // To debug: Console.Error.WriteLine("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            Console.WriteLine(dir);
        }
    }
}
