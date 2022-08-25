import java.io.*;

public class App {

   public static void main(String[] args) {

      student studentVariables = new student();

      studentVariables.name = "Nhlamulo";
      studentVariables.address = "Magongwa";
      studentVariables.number = "0672521424";

      // Serialize the data in a try and catch
      try {
         FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
         ObjectOutputStream outPutStream = new ObjectOutputStream(fileOutputStream);
         outPutStream.writeObject(studentVariables);
         outPutStream.close();
         fileOutputStream.close();

      } catch (Exception e) {
         System.out.println("Error : " + e.getMessage());
         System.out.println("Error : " + e.toString());
      }

   }
}