import java.util.*;
class Matrix
{
    public static void main(String args[]){
int arr[][]=new int[6][8];
Scanner sc=new Scanner(System.in);
for(int i=0;i<6;i++){
    for(int j=0;j<8;j++){
        arr[i][j]=sc.nextInt();
    }
}
int max=arr[0][0];
for(int i=1;i<6;i++){
    for(int j=1;j<8;j++){
        if(max<arr[i][j])
        max=arr[i][j];
    }
}
int k=0,sum[6]=0;
while(k<6){
for(int i=0;i<k;i++){
    for(int j=0;j<8;j++){
        int sum[i]=sum[i]+arr[i][j];
        if(i==j){
            sum[i]=sum[i]-arr[i][j];
        }
        k++;
    }
}
int s=sum[0];
for(int i=1;i<6;i++){
if(s<sum[i])
s=sum[i];
int index=i;
}
for
}
}