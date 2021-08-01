import java.util.*;
class Stringset{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /*int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        ArrayList<Set<Integer>>a=new ArrayList<>();
        Set<Integer>s2=new HashSet<>();
        s2.add(x);
        s2.add(y);
        a.add(s2);int f=0;
        for(int k=1;k<n;k++){
            x=sc.nextInt();
            y=sc.nextInt();f=0;Set<Integer>s1=new HashSet<>();
            //System.out.println(a);
            for(int i=0;i<a.size();i++){
                if(a.get(i).contains(x)){
                    s1=a.get(i);
                    a.remove(i);
                    s1.add(y);
                    a.add(s1);f=1;
                    for(int j=0;j<a.size();j++){
                        Set<Integer>s3=new HashSet<>();
                        if(a.get(j).contains(y)){
                            s3=a.get(j);
                            if(!s3.equals(s1)){
                            s1.addAll(s3);
                            a.remove(j);
                        }}
                    }break;
                }
                else if(a.get(i).contains(y)){
                    s1=a.get(i);
                    a.remove(i);
                    s1.add(x);
                    a.add(s1);f=1;
                    for(int j=0;j<a.size();j++){
                        Set<Integer>s4=new HashSet<>();
                        if(a.get(j).contains(x)){
                            s4=a.get(j);
                            if(!s4.equals(s1)){
                            s4.addAll(s1);
                            a.remove(j);
                        }}
                    }break;
                }
            }
            if(f==0){
                s1.add(x);s1.add(y);
                a.add(s1);
            }
        }
         String s1=s;
        for(int i=0;i<a.size();i++){
            Set<Integer> s6=new HashSet<>();
            s6=a.get(i);
            char c3[]=new char[s6.size()];int l=0;
            for(int j:s6)
            c3[l++]=s.charAt(j);
            Arrays.sort(c3);l=0;
            for(int j:s6){
                if(j+1<s1.length())
            s1=s1.substring(0,j)+c3[l++]+s1.substring(j+1);
            else
            s1=s1.substring(0,j)+c3[l++];
            }
        }
        System.out.println(s1);*/
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                int temp=x;
                x=y;
                y=x;
            }
            a[i][0]=x;a[i][1]=y;
        }
        Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));
        HashMap<TreeSet<Integer>,TreeSet<Character>>h=new HashMap<>();
        TreeSet<Integer>t=new TreeSet<>();
        TreeSet<Character>t1=new TreeSet<>();
        t.add(a[0][0]);t.add(a[0][1]);
        t1.add(s.charAt(a[0][0]));t1.add(s.charAt(a[0][1]));
        h.put(t,t1);int f=0;
        for(int i=1;i<n;i++){
            f=0;
            for(Map.Entry<TreeSet<Integer>,TreeSet<Character>>m:h.entrySet()){
                TreeSet<Integer>t3=new TreeSet<>();
                t3=m.getKey();
                TreeSet<Character>t4=new TreeSet<>();
                    t4=m.getValue();
                if(t3.contains(a[i][0]) && !t3.contains(a[i][1])){                   
                    t3.add(a[i][1]);
                    t4.add(s.charAt(a[i][1]));
                    f=1;break;
                }
                else if(t3.contains(a[i][1]) && !t3.contains(a[i][0])){
                    t3.add(a[i][0]);
                    t4.add(s.charAt(a[i][0]));
                    f=1;break;
                }
            }
            if(f==0){
                TreeSet<Integer>ss=new TreeSet<>();
        TreeSet<Character>ss1=new TreeSet<>();
        ss.add(a[i][0]);ss.add(a[i][1]);
        ss1.add(s.charAt(a[i][0]));ss1.add(s.charAt(a[i][1]));
        h.put(ss,ss1);
            }
        }
        char c[]=s.toCharArray();
        for(Map.Entry<TreeSet<Integer>,TreeSet<Character>>m:h.entrySet()){
                ArrayList<Character>arr=new ArrayList<>();
                TreeSet<Character>ss1=new TreeSet<>();
                ss1=m.getValue();
                for(char c1:ss1)
                arr.add(c1);
                Collections.sort(arr);
                TreeSet<Integer>ss=new TreeSet<>();
                ss=m.getKey();int k=0;
                for(int i:ss)
                c[i]=arr.get(k++);
        }
        String s1=new String(c);
        System.out.println(s1);
    }
}