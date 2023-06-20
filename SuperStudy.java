import java.util.*;

class loan
{
int rate;
loan()
{
System.out.println("hi,i'm default constructor of laon");
}
loan(int rate)
{
this.rate=rate;
}
void printRate()
{

System.out.println(this.rate);
}
}

class carloan extends loan 
{
int rate;

carloan()
{
System.out.println("Hi, I'm a default contructor of carloan");
System.out.println(super.rate);
}
carloan(int rate )
{
super(7);
this.rate=rate;
}
void printRate()
{
System.out.println(this.rate);
super.printRate();
System.out.println(super.rate);
}
}
public class SuperStudy
{
public static void main(String args[])
{
carloan cl2=new carloan();



}
}