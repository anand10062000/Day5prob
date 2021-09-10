public class LeapYear
{
public staic void main(String args[])
{
int year=2000;
 if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
       System.out.println("leap year");
    } else {
        System.out.println("not a leap year");
    }
}

}
