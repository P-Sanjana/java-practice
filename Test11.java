import java.util.*;
class Slot{
    int start,end;
    Slot(int start,int end){
        this.start=start;
        this.end=end;
    }
}
class Test11
{
	/*static int fun(int A[],int N){
		int[] B = new int[N + 2]; 
		B[0] = B[N + 1] = 0; 
			  
		for(int i = 1; i <= N; i++) 
			B[i] = A[i - 1]; 
		  
		int[][] dp = new int[N + 2][N + 2]; 
		  
		for(int length = 1;  
				length < N + 1; length++) 
		{ 
			for(int left = 1;  
					left < N - length + 2; left++)  
			{ 
				int right = left + length -1; 
				  
				for(int last = left; 
						last < right + 1; last++) 
				{ 
					dp[left][right] = Math.max( 
									  dp[left][right],  
									  dp[left][last - 1] + 
									   Math.max(B[left-1 ],Math.max(B[right+1],1)) * B[last] + 
									   Math.min(B[right +1],B[left-1]) + 
									  dp[last + 1][right]);
				} 
			} 
		} 
		return dp[1][N]; 
	}
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.print(fun(a,n));
        
*/
Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       List<Slot>l=new ArrayList<>();
       for(int i=0;i<n;i++)
       l.add(new Slot(sc.nextInt(),sc.nextInt()));
       Collections.sort(l,new Comparator<Slot>(){
           public int compare(Slot s1,Slot s2){
           if(s1.start<s2.start || (s1.start==s2.start && s1.end<s2.end))
           return 0;
           else
           return 1;
           }
       });
       for(Slot s:l)
       System.out.println(s.start+" "+s.end);
       int last=0;
       for(int i=0;i<n-1;i++){
           last=Math.max(last,l.get(i).end);
           if(last<l.get(i+1).start)
           System.out.println(last+" "+l.get(i+1).start);
       }
    }
}