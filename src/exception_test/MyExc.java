package exception_test;

public class MyExc extends Exception{

    Exception a;
    
    MyExc(Exception e) {
        a = e;
    }
    
    @Override
    public String toString()
        {	
          return "MyExc2"+a.toString();
        }
}
