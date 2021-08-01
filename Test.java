import java.util.*;
import java.util.Date;
class Slot{
  int start,end;
  Slot(int start,int end){
      this.start=start;
      this.end=end;
  }
}
class Test{
 
  /*static int fun(int A[],int N){
     int rem=0;
   /*if(l.size()==0)
     return 0;
    if(l.size()==1)
      return l.get(0);
    int max=0;
    for(int i=0;i<l.size();i++){
      int left=i==0?0:l.get(i-1);
      int right=i==l.size()-1?0:l.get(i+1);
      int a=l.get(i)*Math.max(left,right)+Math.min(left,right);
      List<Integer>tmp=new ArrayList<>(l);
      tmp.remove(i);
      max=Math.max(max,a+fun(tmp));
    }
    return max;
    int[] B = new int[N + 2]; 
    B[0] = B[N + 1] = 0; 
          
    for(int i = 1; i <= N; i++) 
        B[i] = A[i - 1]; 
      
    // Declaring DP array 
    int[][] dp = new int[N + 2][N + 2]; 
      
    for(int length = 1;  
            length <=N + 1; length++) 
    { 
        for(int left = 1;  
                left < N - length + 2; left++)  
        { 
            int right = left + length -1; 
              
            // For a sub-array from indices 
            // left, right. This innermost 
            // loop finds the last balloon burst 
            for(int last = left; 
                    last < right + 1; last++) 
            { 
                dp[left][right] = Math.max( 
                                  dp[left][right],  
                                  dp[left][last - 1] + 
                                   Math.max(B[left -1],Math.max(B[right+1],1)) * B[last] + 
                                   Math.min(B[right+1 ],B[left-1]) + 
                                  dp[last + 1][right]);
                                  rem=last; 
            } 
        } 
    }
    for(int i=0;i<N+2;i++){
       for(int j=0;j<N+2;j++)
       System.out.print(dp[i][j]+" ");
       System.out.println();
    } 
    return dp[1][N];
    /*if (nums.length==0){
      return 0;
    }
    int n = nums.length;
    int[][] f = new int[n][n];
    for (int j=0; j<n; j++){
      for (int i=j; i>=0; i--){
        f[i][j] = Integer.MIN_VALUE;
        for (int k=i; k<=j; k++){
          int left = i==0?0:nums[i-1];
          int right = j==n-1?0:nums[j+1];
          int left_sum = k==i? 0:f[i][k-1];
          int right_sum = k==j? 0:f[k+1][j];
          f[i][j] = Math.max(f[i][j], Math.max(left,right)*nums[k]+Math.min(left,right)+ left_sum + right_sum);
          rem=k;
        }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++)
      System.out.print(f[i][j]+" ");
      System.out.println();
   } 
    return f[0][n-1]+nums[rem];
  }*/
  
  public static void main(String args[]){
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
    /*Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   /* List<Integer>l=new ArrayList<>();
    for(int i=0;i<n;i++)
     l.add(sc.nextInt());
    System.out.print(fun(l));
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println(fun(a,n));*/
  
  }
  
}