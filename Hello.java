import java.util.*;
import java.io.*;

class codeforces{

public static void main(){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        while(n>0){
            int last=n&1;
            ans=ans+last*k;
            k=k*k;
        }
        int mod=(int)Math.pow(10.0,9.0);
        System.out.println(ans%mod);
    }
}
}

 