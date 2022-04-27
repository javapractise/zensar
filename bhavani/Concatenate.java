import java.io.*;

class Concatenate {
    public static void main(String args[]) {
        ListOfFiles mylist = new ListOfFiles(args);

        try {
            SequenceInputStream s = new SequenceInputStream(mylist);
            int c;

            while ((c = s.read()) != -1) {
               System.out.write(c);
            }

            s.close();
        } catch (IOException e) {
            System.err.println("Concatenate: " + e);
        }
    }
}