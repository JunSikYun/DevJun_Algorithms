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

        int[] list=new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            list[i]=Integer.parseInt(br.readLine());
            sum+=list[i];
        }
        Arrays.sort(list);
        
        boolean tag=false;
        int max=0;
        int check=10000;

        for(int i=0;i<N;i++){

            int j=0;
            int count=1;
            int value=list[i];

            for(int k=i+1;k<N;k++){
                if(value !=list[k]){
                    break;
                }
                count++;
                j++;
            }
            if(count>max){
                max=count;
                check=value;
                tag=true;
            }
            else if(count==max&&tag==true){
                check=value;
                tag=false;
            }
            i+=j;
        }
        System.out.print((int)Math.round((double)sum/N)+"\n"+list[N/2]+"\n"+check+"\n"+(list[N-1]-list[0]));
    }
}