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
        int road = int.Parse(Console.ReadLine()); // the length of the road before the gap.
        int gap = int.Parse(Console.ReadLine()); // the length of the gap.
        int platform = int.Parse(Console.ReadLine()); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = int.Parse(Console.ReadLine()); // the motorbike's speed.
            int coordX = int.Parse(Console.ReadLine()); // the position on the road of the motorbike.
            
            if(speed <= gap && coordX<road){
               Console.WriteLine("SPEED");
            }
            else
            {
                if(( speed > gap+1 && coordX < road) ||coordX >=(road+gap)){
                     Console.WriteLine("SLOW");
                }               
                else if(road - coordX ==1){
                     Console.WriteLine("JUMP");
                }
                else{
                     Console.WriteLine("WAIT");
                }    
            }
    }
}}
