
package exception_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HaidLevelHandling {

    public String askPath(){
        return "C:\\Users \\Roman\\Desktop\\test.txt";
    }
    
    public static String readFile(String nameFile) throws MyException{
   
        BufferedReader br = null;
        StringBuilder lineDoc = new StringBuilder();
        
        String line = null;
	      
        try {
            br = new BufferedReader(new FileReader(new File(nameFile)));

            while((line = br.readLine())!=null){
                    lineDoc.append(line+" ");	
            }
        } 
        catch (IOException e) {
                MyException a = new MyException(e);
                a.addInfo("Косяк с файлом!");
                throw a;
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){}
        }
        return lineDoc.toString();
    }
    
    public String[] execute() throws MyException{
        
        String strFail;
        try{
        strFail = readFile(askPath());
        }
        catch(MyException e){
            e.addInfo("Еще косяк!!!");
            throw e;
        }
        return strFail.split(" ");
    }
}
