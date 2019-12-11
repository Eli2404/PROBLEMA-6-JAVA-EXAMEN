package problema4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class tabla {
	public static void main(String[] args) {
		int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Da un valor a N");
        N = sc.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}