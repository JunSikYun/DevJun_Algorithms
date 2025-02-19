//counting sort

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
        int N=Integer.parseInt(br.readLine());
        StringTokenizer stk=new StringTokenizer(br.readLine()," ");
        
        int[] list=new int[1001];

        while(N-->0){
            list[Integer.parseInt(stk.nextToken())]++;
        }

        int prev=0;
        int sum=0;

        for(int i=0;i<1001;i++){
            while(list[i]-->0){
                sum+=(i+prev);
                prev+=i;
            }
        }
        System.out.print(sum);
    }
}