package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int p[]=init();
        int q[]=ini2();
        for(int i=0;i<p.length;i++){
            if(p[i]!=q[i]){
                System.out.println(i);
            }
        }
    }
    public static int[]init(){
        int[]data=new int[10000001];
        for(int i=2;i<1000001;i++){
            if(data[i]==0&&(i*i)<1000001){
                for(int j=i+i;j>0&&j<1000001;j=j+i){
                    data[j]=1;
                }
            }
        }
        return data;
    }
    public static int[]ini2(){
        int[]data=new int[10000001];
        for(int i=2;i<1000001;i++){
            if(data[i]==0&&(i*i)<1000001){
                for(int j=i*i;j>0&&j<1000001;j=j+i){
                    data[j]=1;
                }
            }
        }
        return data;
    }
}