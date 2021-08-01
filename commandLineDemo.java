class CommandLineDemo
{
public static void main(String args[])
{
int len=args.length;
if(len==0)
System.out.println("No arguments passed\n");
else
{
System.out.println("Arguments passed are:\n");
for(int i=0;i<len;i++)
System.out.println(args[i]);
}
}
}
