public class CustomWrapper {
    int i;
    CustomWrapper()
    {
        System.out.println("This is a custom wrapper class");
    }
    CustomWrapper(int num)
    {
        this();
        this.i=num;
        
    }    
    public int getI() {
        return i;
    }
    public static void main(String[] args) {
        
        CustomWrapper custom=new CustomWrapper(54);
        System.out.println(custom.getClass());
    }
}