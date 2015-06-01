package exception_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MiddleLevelHandling {
    
     public String askPath(){
        return "C:\\Users\\Roman\\De sktop\\test.txt";
    }
    
    public static String readFile(String nameFile) throws IOException{
   
        BufferedReader br = null;
        StringBuilder lineDoc = new StringBuilder();
        
        String line = null;
	      
        br = new BufferedReader(new FileReader(new File(nameFile)));

        while((line = br.readLine())!=null){
                lineDoc.append(line+" ");	
        }
        
        br.close();

        return lineDoc.toString();
    }
    
    public String[] execute(){
        
        String strFail;
        try{
        strFail = readFile(askPath());
        }
        catch(Exception e){
             System.out.println("Что-то пошло не так!");
             return null;           
        }
        return strFail.split(" ");
    }
    
}
