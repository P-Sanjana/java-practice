public class BoyerMooreGoodSuffix
{
	public static void goodSuffix(char p[],int shift[],int bpos[],int m){
		int i=m,j=m+1;
		bpos[i]=j;
		while(i>0){
		while(j<=m && p[i-1]!=p[j-1]){
			if(shift[j]==0)
			shift[j]=j-i;
			j=bpos[j];
		}
		i--;
		j--;
		bpos[i]=j;
	}
	}
	public static void fun1(char p[],int shift[],int bpos[],int m){
		int i,j;
		j=bpos[0];
		for(i=0;i<=m;i++){
			if(shift[i]==0)
			shift[i]=j;
			if(i==j)
			j=bpos[j];
		}
	}
	public static void fun(char txt[],char p[]){
		int n=txt.length;
		int m=p.length;
		int shift[]=new int[m+1];
		int bpos[]=new int[m+1];
		goodSuffix(p,shift,bpos,m);
		fun1(p,shift,bpos,m);
		int s=0,j;
		while(s<=n-m){
			j=m-1;
			while(j>=0 && p[j]==txt[s+j])
			j--;
			if(j<0){
				System.out.println("found at "+s);
				s+=shift[0];
			}
			else
			s+=shift[j+1];
		}
	}
	public static void main(String[] args) {
	String txt="ABAAAABAACD";
	String p="ABA";
	fun(txt.toCharArray(),p.toCharArray());
	}
}
