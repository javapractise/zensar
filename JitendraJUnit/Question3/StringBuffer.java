package project;
//import static org.junit.Assert.*;

//import org.junit.Test;


public class StringBuffer {

    public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public StringBuffer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){

    }

    public boolean StringBuff(StringBuffer sbOne, StringBuffer sbTwo){
        sbTwo = sbOne;
        if(sbTwo==sbOne){
            return true;
        }

        else{
            return false;
        }
    }
}