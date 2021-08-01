import java.util.*;
class Removal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String s2[]=s1.split(",");
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        a[s.charAt(i)-'a']++;
        int arr[]=new int[s2.length];
        //Arrays.fill(arr,0);
        //System.out.println(s2.length);
        //System.out.println(arr.length);
        for(int i=0;i<s2.length;i++){
            int b[]=new int[26];
            for(int j=0;j<s2[i].length();j++)
                b[s2[i].charAt(j)-'a']++;
               // System.out.println(b[j]+" ");}
            for(int j=0;j<26;j++){
                arr[i]+=a[j]-b[j];
            }
        }
       // System.out.println(arr);
        Arrays.sort(arr);
        //System.out.println(arr);
        System.out.println(arr[0]);
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);
    }
}