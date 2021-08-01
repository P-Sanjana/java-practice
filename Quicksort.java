import java.util.*;
class QuickSort{
String list[];
QuickSort(String list[]){
    this.list=list;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String list[]=new String[n];
for(int i=0;i<n;i++){
    list[i]=sc.next();

}
QuickSort sorter=new QuickSort(list);
sorter.sort(list,0,list.length-1);
for(int i=0;i<n;i++){
    System.out.println(list[i]+" ");
}
}
void sort(String list[],int low,int high){
    int i=low;
    int j=high;
    String pivot=this.list[(low+high)/2];
    if(list==null || list.length==0){
        return;
    }
    while(i<=j){
        while(list[i].compareToIgnoreCase(pivot)<0){
            i++;
        }
        while(list[j].compareToIgnoreCase(pivot)>0){
            j--;
        }
        if(i<=j){
            swap(i,j);
            i++;
            j--;
        }
    }
    if(low<j){
        sort(list,low,j);
    }
    if(i<high){
        sort(list,i,high);
    }
}
void swap(int i,int j){
    String temp=this.list[i];
    this.list[i]=this.list[j];
    this.list[j]=temp;
}
}