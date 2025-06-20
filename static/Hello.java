/*
class Hello
{
 static int a=1;
static int b=2;
int c=3;
int d=4;
static{
System.out.println("static");
}
static{
System.out.println(a+b);
}
{
System.out.println("instance");
}
{
System.out.println(c+d);
}
static void stati()
{
System.out.println(a*b);
}
static void stat()
{
System.out.println(a);
}
public void sta()
{
System.out.println(c);
}
public void st()
{
System.out.println(c+d);
}
public static void main(String args[])
{
Hello h=new Hello();
h.stati();
h.stat();
h.sta();
h.st();
}
}
o/p:static
3
instance
7
2
1
3
7*/
/* 2
class Hello
{
int a=1;
int b=2;
static void add()
{ int a=3;
int b=1;
System.out.println(a+b);
System.out.println("hello");
}
public static void main(String args[])
{
Hello h=new Hello();
 h.add();
}
}o/p:
4
hello*/
/* 3
class Hello
{
static int a=1;
static int b=2;
void mul()
{
System.out.println(a+b);
}
public static void main(String args[])
{
Hello h=new Hello();
 h.mul();
}
}
o/p:3*/
/*  5
class Hello
{
static void a()
{
System.out.println("static method");
}
void b()
{
a();
}
public static void main(String args[])
{ 
Hello h=new Hello();
h.b();
}
}
o/p:static method*/
/* 4
class Static
{
    void instance() 
    {
        System.out.println("Instance method ");
    }

    static void staticmethod() 
    {

        Static s = new Static();
        s.instance();
    }

    public static void main(String[] args) {
        System.out.println(" Main Method");
        staticmethod();  
    }
}*/
/* 7
class Static
{
    static void a()
    {
        System.out.println("Welcome");
    }
    void ins()
    {
        System.out.println("Back to home");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
        a();
        Static s=new Static();
        s.ins();
    }
}*/
/*
class Static
{    
    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;

    public static void main(String[] args) {
        System.out.println("Static Variables:");
        System.out.println( a);
        System.out.println(b);

        Static s = new Static();

        System.out.println("Instance Variables:");
        System.out.println(s.c );
        System.out.println(s.d);
    }
}*/

