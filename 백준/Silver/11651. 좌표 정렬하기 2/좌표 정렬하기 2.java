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
        
        Arrays.sort(list,(e1,e2)->{
            if(e1[0]==e2[0]){
                return e1[1]-e2[1];
            }
            else{
                return e1[0]-e2[0];
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(list[i][1]+" "+list[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}