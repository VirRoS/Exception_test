package exception_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LowLevelHandling {

    public String askPath(){
        return "C:\\Users\\Roman\\Desktop\\test.txt";
    }
    
    public static String readFile(String nameFile) throws IOException{
   
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
                System.out.println("Данного файла не существует!!!" + e.getMessage());
                return null;
        }
        finally{
            try{
                br.close();
            }
            catch(Exception e){}
        }
        return lineDoc.toString();
    }
    
    public String[] execute(){
        
        String strFail;
        try{
        strFail = readFile(askPath());
        }
        catch(Exception e){
            return null;
        }
        return strFail.split(" ");
    }
    
    
    
    public static void main(String[] args) {
        
//        LowLevelHandling test = new LowLevelHandling();
//        
//        try{
//            for(String a : test.execute()){
//                System.out.print(a+" | ");
//            }
//            System.out.println("");
//        }
//        catch(Exception e){}
//        
//        MiddleLevelHandling test2 = new MiddleLevelHandling();
//        
//        try{
//            for(String a : test2.execute()){
//                System.out.print(a+" | ");
//            }
//        }
//        catch(Exception e){}
        
        HaidLevelHandling test3 = new HaidLevelHandling();
        try{
            for(String a : test3.execute()){
                System.out.print(a+" | ");
            }
        }
        catch(MyException e){
            System.out.println("Все плохо("); 
            System.out.println(e.getMessage());
        }
    }
    
}
