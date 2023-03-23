package IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStreamDemo {
    
    public void process(){
        FileInputStream fi = null;
        FileOutputStream fo = null;

        try {
            //writing stream to file
            fo = new FileOutputStream("demosource.txt");
            String data = "santhoshsivan";
            byte i[] =  data.getBytes();

            //file Stream
            for(int j=0;j<i.length;j++){
                fo.write(i[j]);
            }

            fi = new FileInputStream("demosource.txt");
            int content;

            while((content = fi.read()) != -1){
                System.out.print((char)content);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                if (fo != null) {
                    fo.close();
                }
                if (fi != null) {
                    fi.close();
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
