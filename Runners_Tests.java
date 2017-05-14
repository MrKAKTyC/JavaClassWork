import junit.framework.TestCase;
import java.io.*;
import java.nio.charset.*;

public class Runners_Tests extends TestCase{
    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintWriter in;
    
    protected void setUp() throws IOException{
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        in = new PrintWriter(pos, true);
        System.setIn(pis);
        System.setOut(new PrintStream(out));
    }
    
    protected String to_normalized_string(byte[] arr){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 13)
                arr[j++] = arr[i];
        }// for
        return new String(arr, 0, j, Charset.defaultCharset());
    }
    
    public void test1(){
        in.println(3);
        in.println("Horstmann 9.4");
        in.println("Schildt 10.1");
        in.println("Eckel 12.0");
        
        Runners1.main(new String[0]);
        
        assertEquals("Неправильный ответ:", "1 Horstmann 9.4\n2 Schildt 10.1\n3 Eckel 12.0\n", to_normalized_string(out.toByteArray()));
    }
    
    public void test2(){
        in.println(3);
        in.println("Eckel 12.1");
        in.println("Horstmann 9.5");
        in.println("Schildt 10.2");
        
        Runners1.main(new String[0]);
        
        assertEquals("Неправильный ответ:", "1 Horstmann 9.5\n2 Schildt 10.2\n3 Eckel 12.1\n", to_normalized_string(out.toByteArray()));
    }
    
    public void test3(){
        in.println(11);
        in.println("Ivanov 12.6");
        in.println("Petrov 11.1");
        in.println("Sidorov 13.0");
        in.println("Smith 9.5");
        in.println("Doe 10.2");
        in.println("Salo 14.3");
        in.println("Nagasaki 18.2");
        in.println("Booch 11.6");
        in.println("Knuth 9.8");
        in.println("Pylypets 10.0");
        in.println("Neumann 14");  
        
        Runners1.main(new String[0]);
        
        assertEquals("Неправильный ответ:", "1 Smith 9.5\n2 Knuth 9.8\n3 Pylypets 10.0\n", to_normalized_string(out.toByteArray()));
    }    
}
