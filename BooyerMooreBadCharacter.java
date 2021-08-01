import java.util.*;
public class BooyerMooreBadCharacter
{
    static void fun(char txt[],char p[],int m,int n){
        int a[]=new int[256];
        for(int i=0;i<26;i++)
        a[i]=-1;
        for(int i=0;i<m;i++)
            a[(int)p[i]]=i;
        int s=0;
        while(s<=(n-m)){
           // System.out.println(s);
            int j=m-1;
            while(j>=0 && txt[s+j]==p[j])
            j--;
            if(j<0){
                System.out.println("found at "+s);
                s+=(s+m<n)?m-a[txt[s+m]]:1; // if next character is present in pattern then s=s+m-pos because pos gives the no of characters from starting in pattern
                                   // and s should first move to s+m and then subtract pos from it to align correctly.
            }
            else
            s+=Math.max(1,j-a[txt[s+j]]);
        }
    }
	public static void main(String[] args) {
    String txt="ABAAABCD";
    String p="ABC";
    int s=0;
    int n=txt.length();
    int m=p.length();
    fun(txt.toCharArray(),p.toCharArray(),m,n);
	}
}
