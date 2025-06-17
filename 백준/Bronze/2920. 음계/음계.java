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
        StringTokenizer stk=new StringTokenizer(br.readLine());
        int[] list=new int[8];
        for(int i=0;i<8;i++){
            list[i]=Integer.parseInt(stk.nextToken());
        }

        boolean a=true;
        boolean d=true;

        for(int i=0;i<7;i++){
            if(list[i+1]>list[i]){
                d=false;
            }
            if(list[i+1]<list[i]){
                a=false;
            }
        }

        if(a){
            System.out.println("ascending");
        }
        else if(d){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}