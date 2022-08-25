import java.io.*;

public class student implements Serializable {

   public String name;
   public String address;
   public String number;

   public void mailcheckPrintData() {
      System.out.println("Mailing To : \n " + name + "\n Address : " + address + "\n Number : " + number + "");
   }
}