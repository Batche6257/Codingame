import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        HashMap MIMES = new HashMap(N);
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            EXT = EXT.toUpperCase();
            String MT = in.next(); // MIME type.
            MIMES.put(EXT,MT);
            in.nextLine();
        }
        
        String[] FNAMES = new String[Q];
        for (int i = 0; i < Q; i++) {
            FNAMES[i] = in.nextLine(); // One file name per line.
        }
        int x = 0;
        
        while(x<FNAMES.length)
        {
            if(FNAMES[x].lastIndexOf(".") ==-1){ System.out.println("UNKNOWN");}
            else{
         String key = (FNAMES[x].substring(FNAMES[x].lastIndexOf(".")+1,FNAMES[x].length())).toUpperCase();
         //System.err.println(key);
         
         if(MIMES.containsKey(key))
         {
         String value = (String) MIMES.get(key);
         
         System.out.println(value);
         }
         else
         {
             System.out.println("UNKNOWN");
         }
            }
         x++;
        }
    }
}
