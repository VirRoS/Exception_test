package exception_test;

import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception{

    ArrayList<String> info = new ArrayList<String>() {};
    
    Exception a;
    
    public MyException(Exception e) {
        a = e;
    }
    
    public void addInfo(String info){
        this.info.add(info);
    }


    @Override
    public String getMessage() {
           String mes = "";
        for(String a : info){
            mes+=a+"\n";
        }
        return mes;
    }
    
    @Override
    public String toString()
        {	
          return "MyExc1"+a.toString();
        }
}
