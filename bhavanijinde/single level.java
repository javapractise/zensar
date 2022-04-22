//single level inheritance real time example

class Booking
{
public void wish()
{
 System.out.println("booking a ola for travel");
}
}
class ola extends Booking
{
public void travel()
{
 System.out.println("your booking is conform");
}
}
class MainBooking
{
public static void main(String args[])
{
ola o=new ola();
o.wish();
o.travel();
}
}