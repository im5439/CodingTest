package test;

import java.util.Scanner;

public class hanoi {
	public static int cnt=0;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~20까지 정수입력 : ");
        int n = sc.nextInt();
        
        hanoi(n,1,2,3);
        sb.insert(0,cnt + "\n");
        System.out.println(sb);
    }
    public static void hanoi(int num, int a, int b, int c) {
        if(num==1){
            sb.append(a+" " +c+"\n");
            cnt++;
        }
        else {
            hanoi(num-1,a,c,b);//n-1개의 원반을 A에서 B로 이동
            sb.append(a + " "+c+"\n");
            cnt++;
            hanoi(num-1,b,a,c);//n-1개의 원반을 B에서 C로
        }
    }
}
