package IOstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterStreamDemo {    
    public void process(){
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //writing stream to file
            fw = new FileWriter("demosource.txt");
            String data = "santhoshsivan";
            fw.append(data);
            //character Stream

            fr = new FileReader("demosource.txt");
            int content;

            while((content = fr.read()) != -1){
                System.out.print((char)content);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                if (fw != null) {
                    fw.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }

    public static void main(String[] args) {
        byteStreamDemo bs  = new byteStreamDemo();
        bs.process();
    }
}

