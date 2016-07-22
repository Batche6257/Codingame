import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int pi[] = new int[N];
        for (int i = 0; i < N; i++) {
             pi[i] = in.nextInt();
        }
        Arrays.sort(pi);
        int current =10000001;
        for(int i = 0; i+1 < N;i++){
            int compare = Math.abs(pi[i+1] - pi[i]);
            if( compare < current){
                current = compare;
            }
        }
        System.out.println(current);
    }
}
