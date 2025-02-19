import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer stk=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(br.readLine());
        System.out.print(makeOne(N,0));
    }

    private static int makeOne(int N, int count){
        if(N<2){
            return count;
        }
        return Math.min(makeOne(N/2, count+1+(N%2)),makeOne(N/3, count+1+(N%3)));
    }
}