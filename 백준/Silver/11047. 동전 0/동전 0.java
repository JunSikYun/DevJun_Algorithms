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
        // int N=Integer.parseInt(br.readLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(stk.nextToken());
        int K=Integer.parseInt(stk.nextToken());

        int[] list=new int[N];

        for(int i=0;i<N;i++){
            list[i]=Integer.parseInt(br.readLine());
        }

        int count=0;

        for(int i=N-1;i>=0;i--){
            if(list[i]<=K){
                count+=(K/list[i]);
                K=K%list[i];
            }
        }
        System.out.print(count);
    }
}