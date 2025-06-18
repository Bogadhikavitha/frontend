
class Loop
{
public static void main(String args[])
{
/*
for(int i=0; i<10; i++)
{
System.out.println("Bright IT Carrer");
}
}
}
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer
Bright IT Carrer*/
/*int
int i=1;
while(i<=20){
System.out.println(i);
i++;
}
}
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/
/*
int a=2;
int b=2;
int c=3;

if(a==b){
System.out.println("a is equal to b");
}
if(b==c)
{
System.out.println("b is not equal to c");
}
}
}
a is equal to b*/
/*int n=20;
System.out.println("odd"+n);
for(int i=1; i<=n;i++)
{
if(i%2!=0)
{
System.out.print(i+" ");
}
}
System.out.println("even"+n);
for(int  i=1;i<=n; i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}
1 3 5 7 9 11 13 15 17 19 even20
2 4 6 8 10 12 14 16 18 20*/ 
/*import java.util.Scanner;int n=10;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int n1=sc.nextInt();
System.out.println("enter second number");
int n2=sc.nextInt();
System.out.println("enter third number");
int n3=sc.nextInt();
int largest;
if(n1>n2&& n1>=n3){
largest=n1;
}
else if(n2>=n1 && n2>=n3)
{
largest=n2;
}
else{
largest=n3;
}
System.out.println("the larges is"+largest);
}
}
enter first number
3
enter second number
5
enter third number
8
the larges is8*/
/*
int number=10;
System.out.println("even numbers upto 10 to100");
while(number<=100){
if(number %2 ==0)
{
System.out.println(number);
}
number++;
}
}
}
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/
/*
int i=1;
do{
System.out.println(i);
i++;}
while(i<=10);

}
}
1
2
3
4
5
6
7
8
9
10*/
/*
int n1=10;
int n2=20;
int n3=30;
int largest;
if(n1>=n2 && n1>=n3)
{
largest=n1;
}
else if(n2>=n1 && n2>=n3)
{
largest=n2;
}
else{
largest=n3;
}
System.out.println("the largest number is" +largest);
}
}
the largest number is30*/
/*
Scanner sc=new Scanner(System.in);
System.out.println("enter the gender");
char genderChar=scanner.next().charAt(0);
switch(genderChar)
{
case 'M':
case 'm':
System.out.println("male");
break;
case 'F':
case 'f':
System.out.println("female");
break;
default:
System.out.println("invalid input");
break;
}
}
}*/
/*
import java.util.Scanner;
 class Loop {
    public static void main(String[] args) {
        int n, i, rem, sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        i = n;

        while (n > 0) {
            rem = n % 10;
            sum += rem * rem * rem; 
            n /= 10;
        }

        if (i== sum) {
            System.out.println(i + " is an Armstrong number");
        } else {
            System.out.println(i + " is not an Armstrong number");
        }
    }
}

D:\403>java Loop
Enter a number:
372
372 is not an Armstrong number
*/

/*
      int num = 89;
      System.out.println("The given number is: " + num);
 
      int count = 0;
     
      if(num == 2) {
         System.out.println(num + " is a prime number");
      } else {
      
         for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
               count++;
            }
         }
         
         if(count == 2) {
            System.out.println(num + " is a prime number");
         } else {
            System.out.println(num + " is not a prime number");
         }
      }
   }
}
The given number is: 89
89 is a prime number*/