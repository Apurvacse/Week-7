import java.lang.String;
import java.lang.StringBuffer;

public class StringDemo 
{
	public static void main(String args[])
    {
        System.out.println("This Code illustrates the use of String class and its methods");
        System.out.println("*******************************");
        
        String str =("Train your Mind to see the Good in Everything.");
        
        System.out.println("The initial String is:\t" + str);
        System.out.println("After replacing 'o' with 'O':\t" + str.replace('o', 'O'));
        System.out.println("The length of the given string is:\t" + str.length());
        System.out.println("The occurrence of character 'G' is at position:\t" + str.indexOf('G'));
        System.out.println("The lower case of String is:\t" + str.toLowerCase());
        System.out.println("The upper case of String is:\t" + str.toUpperCase());
        System.out.println("The Extracted sub String is:\t" + str.substring(27));
        
        String s = "        Hello World            ";
        
        System.out.println("The String with spaces: " + s);
        System.out.println("The String with leading & trailing spaces:\t" + s);
        System.out.println("The String without spaces: " + s.trim());
        
        if (s.isEmpty())
            System.out.println("The String is Empty");
        else
            System.out.println("The String is not empty. It contains " + s);
        
        s = null;
        
        System.out.println("The String after modifying...\t" + s);
        System.out.println("****************************\n");
        
        System.out.println("This Code illustrates the use of StringBuffer class and its methods");
        System.out.println("*****************************");
        
        StringBuffer strbuf = new StringBuffer();
        
        System.out.println("The initial capacity of StringBuffer is " + strbuf.capacity());
        
        strbuf.append("Hello");
        
        System.out.println("The StringBuffer is:\t" + strbuf);
        strbuf.setLength(20);
        strbuf.insert(5, " welcome to the world of Java");
        
        System.out.println("The StringBuffer is:\t" + strbuf);
        
        System.out.println("The capacity of StringBuffer after appending is" +
        strbuf.capacity());
        
        System.out.println("The Reverse of the given StringBuffer is:\n" + strbuf.reverse());
        
        System.out.println("The StringBuffer after deleting:\t" + strbuf.delete(5, 43));
        
    }
}
