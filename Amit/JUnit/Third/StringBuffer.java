package Third;

public class StringBuffer {

    public StringBuffer(String string) 
    {
		// TODO Auto-generated constructor stub
	}
	public StringBuffer() 
	{
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{

    }
    public boolean StrBuff(StringBuffer sbOne, StringBuffer sbTwo)
    {
        sbTwo = sbOne;
        if(sbTwo==sbOne)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
