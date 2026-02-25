public class ComplexNumber 
{
    double real, img;
    ComplexNumber(double r, double i) 
    {
        real = r;
        img = i;
    }
public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) 
{
   double r = c1.real + c2.real;
   double i = c1.img + c2.img;
   return new ComplexNumber(r, i);
}
public void display() 
{
  if (img >= 0)
  System.out.println(real + " + " + img + "i");
   else
 System.out.println(real + " - " + (-img) + "i");
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, -5);

        ComplexNumber result = ComplexNumber.sum(c1, c2);

        System.out.print("Sum = ");
        result.display();
    }
}

