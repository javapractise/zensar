interface Book
{
void reading();
default void write()
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
class Default1
{
public static void main(String args[])
{
Book b= new TextBook();
b.write();
b.reading();

}
}