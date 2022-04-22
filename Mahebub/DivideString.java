package stirngpractice;

public class DivideString {  
    public static void main(String[] args) {  
          String s = "aabbccddeeabcdabcdefghedksrfge";  
        int len = s.length();  
        int n = 5;  
        int temp = 0, chars = len/n;  
        String[] equalStr = new String [n];   
            for(int i = 0; i < len; i = i+chars) {   
                String part = s.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }   
        }  
}  