import java.io.*;
 class Directorylist{
    public static void main(String args[]) throws IOException{
        String name;
        File directory;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter directory name");
        name=br.readLine();
        directory =new File(name);
        if(directory.isDirectory()==false){
            if(directory.exists()==false){
                System.out.println("There is no such directory");
            }
            else{
                System.out.println("This is not a directory");
            }
        }
            else{
                listContents(directory," ");
            }
        
    }
    static void listContents(File dir,String indent){
        String files[];
        System.out.println(indent+"Directory"+dir.getName()+":");
        files=dir.list();
        indent+=" ";
        for(int i=0;i<files.length;i++){
            File f=new File(dir,files[i]);
            if(f.isDirectory())
            listContents(f,indent);
            else
            System.out.println(indent+files[i]);
        }
        }
    }
