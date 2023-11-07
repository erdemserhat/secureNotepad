package ioProcesses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ioProcesses  {
    
    
     public  void writeFile (String fileName,String text){
            try{
                  File file = new File(fileName+".txt");
                  FileWriter writer = new FileWriter(file);
                try (BufferedWriter write = new BufferedWriter(writer)) {
                    write.write(text);
                }
                  System.out.println("Writing process is successfully complated");
            }
            catch(IOException err){
                System.err.println("hata oluştu");
            }
      }
    
    public  String readFile(File file){
        
        FileReader fileReader = null;
         try {
             fileReader = new FileReader(file);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ioProcesses.class.getName()).log(Level.SEVERE, null, ex);
         }
        String line;
        String str="";
        try (BufferedReader br = new BufferedReader(fileReader)) {
            while ((line = br.readLine()) != null) {
                
                str+=line;
                
            }
        } catch (IOException ex) {
             Logger.getLogger(ioProcesses.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    
        return str;
    }
    
    
}
