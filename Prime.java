/* wajp to check the number is prime or not.   */

import java.io.*;
class Prime
{
public static void main(String args[])
{
Console c=System.console();
double num=Double.parseDouble(c.readLine("enter the number :"));

double temp=0;
for(double i=2; i<=num-1; i++)
{
if(num%i==0){
temp=temp+1;
}
}
if(temp==0){
System.out.println("This is a Prime Number...");
}else{
System.out.println("This is not a Prime Number...");
}

}
}