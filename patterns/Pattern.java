  class  Pattern
{
public static void main(String args[])
{
   /* 1
 int i,j;
for(i=0; i<5; i++)
{
for(j=0; j<5; j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}
*/
/*2
 int i,j;
for(i=1; i<6; i++)
{
for(j=0; j<5; j++)
{
System.out.print(i+" ");
}
System.out.println( );
}
}
}*/

  /*3
 int i,j;
for(i=1; i<6; i++)
{
for(j=1; j<6; j++)
{
System.out.print(j+ " ");
}
System.out.println( );
}
}
}*/
/* 4
int i,j;
int n=1;
for(i=1;i<6; i++)
{ 
for(j=1;j<6; j++)
{ 
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}*/
/* 5
int i,j;
int n=1;
for(i=1;i <6;i++)
{
for(j=1;j<6;j++){
System.out.print(n+ " ");
n++;
if(n>9){
n=1;
}
}
System.out.println(" ");

}
}
}
*/
/*6
int i,j;
int n=1;
for(i=1;i<5; i++)
{
for(j=0;j<6;j++)
{
System.out.print(n+" ");
n--;
if(n!=0){
}
}
System.out.println(" ");
}
}
}*/
/* 7
int i,j;
int n=1;
for(i=1;i <6;i++)
{
for(j=1;j<6;j++){
System.out.print(n+ " ");
if(j%2==0){
System.out.println(0+" ");

}
else{ System.out.println(1+" ");
System.out.println(" ");

}
}
}*/
/* 19
int i,j;

for(i=0; i<=6; i++)
{
for(j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}
*/ 
/* 8
int i,j;

for(i=0; i<=6; i++)
{
for(j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println( );
}
}
}*/
/* 15
int n=7;

for( int i=1;i<=n;i++)
{
for(int  j=1;j<=n;j++)
{
if(i==n/2+1|| j==n/2+4)
 System.out.print("* ");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}
*/    /* 10 
 String word="INDIA";
for(int i=1; i<=word.length; i++)
{System.out.println(word.substring(0,i));
}
}
}*/ 
/*8

 for(int i=1; i<6;i++)
{
for( int j=1;j<6; j++)
{
if(j<6-i) 
 {
 System.out.print(" ");}
else{
System.out.print("* ");
}
}
System.out.println(" ");
}
}
}*/
int n=5;
for(int i=1; i<=n; i++)
{
for(int j=1; j<i;j++){
 System.out.print( " ");
} for(int j=1; j<=i; j++){
   j++;
           System.out.print("*");
}System.out.println( );
}
}
}
                                                                                                                                                                           