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
        String[] list=new String[3];
        for(int i=0;i<3;i++){
            String word=br.readLine();
            list[i]=word;
        }
        int sum=Integer.parseInt(list[0])+Integer.parseInt(list[1])-Integer.parseInt(list[2]);
        String check=list[0]+list[1];
        int tag=Integer.parseInt(check)-Integer.parseInt(list[2]);
        System.out.println(sum+"\n"+tag);

        

    }
}