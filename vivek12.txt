public class World
{
public static void main(String[] args)
{
    Class B = World.class;
    System.out.println(World.class);

    System.out.println(String.class.getClassLoader());
}
}