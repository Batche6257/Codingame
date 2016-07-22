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
        String LON = in.next();
        String LAT = in.next();
        double pLON = Double.parseDouble(LON.replace(',','.'));
        double pLAT = Double.parseDouble(LAT.replace(',','.'));
        int N = in.nextInt();
        String[][] DEFIBS = new String[N][];
        
        in.nextLine();
        for (int i = 0; i < N; i++)
        {
            DEFIBS[i] = in.nextLine().split(";",6);
            for(int j = 0; j<6;j++)
            {
            if(j>=4)DEFIBS[i][j] = DEFIBS[i][j].replace(',','.');
            }
        }
        double[] dists = new double[N];
        
        for(int a = 0; a < N ; a++){
         double defibLON =Double.parseDouble(DEFIBS[a][4]);
         double defibLAT =Double.parseDouble(DEFIBS[a][5]);
         double x = (defibLON - pLON)*Math.cos((pLAT + defibLAT)/2.0);
         double y = (defibLAT - pLAT);
         dists[a] = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));    
        }
        int index=0;
        double closest=dists[0];
        for(int i = 0; i<N;i++)
            {
            if(dists[i] < closest){
                index = i;
                closest = dists[i];
            }
            }
        System.out.println(DEFIBS[index][1]);
    }
}
