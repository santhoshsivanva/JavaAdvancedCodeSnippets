package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@author(name="santhoshsivan ")
class Product implements Serializable{
    private static final long serialVersionUID = 2L;
    private String productname;
    private String productId;
    transient int secretId;

    Product(String productname, String productId,int secretId){
        this.productname = productname;
        this.productId = productId;
        this.secretId = secretId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {

        String str = String.format(" Product name:%s\n productId: %s\n secretId: %d",productname,productId,secretId);
        return str;
    }

}

public class serialization {
    public static void main(String[] args){
        Product p1 = new Product("product1", "1234567890", 1);
        p1.secretId = 2;
        System.out.println(p1);
        
        //serialization
        try(FileOutputStream tf= new FileOutputStream("C:\\Users\\santhoshsivan\\OneDrive\\Pictures\\Studies\\SpotifyClone\\JavaAdvancedCodeSnippets\\Serialization\\store\\serial.sf")){
            ObjectOutputStream inp = new ObjectOutputStream(tf);
            inp.writeObject(p1);
            // Here the object signature is not storing yet, so we have to make sure it. on output
            System.out.println(" The serialization is complete\n");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Product p2 = null;
        //deserialization
        try(FileInputStream tf= new FileInputStream("C:\\Users\\santhoshsivan\\OneDrive\\Pictures\\Studies\\SpotifyClone\\JavaAdvancedCodeSnippets\\Serialization\\store\\serial.sf")){
            ObjectInputStream inp = new ObjectInputStream(tf);
            p2 = (Product) inp.readObject();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(p2);
        System.out.println(" The deserialization is complete\n");
        System.out.println("The transient value "+ p2.secretId);
    }}
