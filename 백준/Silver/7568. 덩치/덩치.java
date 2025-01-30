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
        
        int[][] list=new int[N][2];
        
        StringTokenizer stk;
        
        for(int i=0;i<N;i++){
            stk=new StringTokenizer(br.readLine());
            list[i][1]=Integer.parseInt(stk.nextToken());
            list[i][0]=Integer.parseInt(stk.nextToken());
        }
        for(int i=0;i<N;i++){
            int count=1;
            for(int j=0;j<N;j++){
                if(i==j){
                    continue;
                }
                if(list[i][0]<list[j][0]&&list[i][1]<list[j][1]){
                    count++;
                }
            }

            System.out.print(count+" ");
        }
    }
}