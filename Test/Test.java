
class Test
{
public static void main(String[] args)
{
String str = "John";
process(str);
System.out.println("str = " + str);
}
static void process(String str)
{
str = "Mike";
int d = 3;
double sa = 200.0;
int i = 3, j = 4;
int $am;

if (sa != 0 && sa >= 50.0) System.out.println ("Disc   10%");
else if (sa >= 100.0) System.out.println ("Disc is 20%"); 
System.out.println ("IN here it is   " + str);

System.out.println ("IN here it is  \n " + d);
System.out.println ("The print is " + (i > j && j != 0));
System.out.println ("This one is frivolous");

}
}
