interface Book
{
void reading();
static void write()
{
System.out.println("writing");
}
}
class TextBook implements Book
{
public void reading()
{
System.out.println("textbook reading is best");
}
}
class Static
{
public static void main(String args[])
{
Book.write();
Book b=new TextBook();
b.reading();

}
}