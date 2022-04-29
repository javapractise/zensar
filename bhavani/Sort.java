public class Sort
{
public static void main(string args[])
{

public static InputStream reverse(InputStream source) {
    PipedOutputStream pos = null;
    PipedInputStream pis = null;

    try {
        DataInputStream dis = new DataInputStream(source);

        pos = new PipedOutputStream();
        pis = new PipedInputStream(pos);
        PrintStream ps = new PrintStream(pos);

        new WriteReversedThread(ps, dis).start();

    } catch (Exception e) {
        System.out.println("RhymingWords reverse: " + e);
    }
    return pis;
}
}