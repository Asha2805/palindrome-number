import java.util.*;
public class palindrome
{
public static void main(String[] args)
{
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt();
int rem,reversenum=0,originalnum;
num=originalnum;
while(num!=0)
{
rem=num%10;
reversenum=reversenum*10+rem;
num=num/10;
}
if(originalnum == reversenum)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
