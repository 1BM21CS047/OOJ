import java.util.Scanner;
import java.lang.Math;
class qe
{
  public static void main(String xx[])
 {
  Scanner s=new Scanner (System.in);
  double a,b,c,d,r1,r2;
  System.out.println("Enter values of a,b and c");
  a=s.nextDouble();
  b=s.nextDouble();
  c=s.nextDouble();
  if(a==0)
  { System.out.println("a shouldn't be 0");}
  else
  {
  d=(b*b)-(4*a*c);
  if(d>0)
  {
     System.out.println("Roots are real and distinct");
     r1= (-b+Math.sqrt(d))/(2*a);
     r2= (-b-Math.sqrt(d))/(2*a);
     System.out.print("R1:"+r1+" R2:"+r2);
    }
  else if(d==0)
    {
     System.out.println("Roots are real and equal");
     r1=(-b)/(2*a);
     System.out.println("Roots are "+r1);
     }
  else
      { System.out.println("Roots are imaginary");
       r1=(-b)/(2*a);
       r2=Math.sqrt(Math.abs(d))/(2*a);
       System.out.println("R1:"+r1+"+i"+r2+" R2:"+r1+"-i"+r2);
        }
  }
}
}