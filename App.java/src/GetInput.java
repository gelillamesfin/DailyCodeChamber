
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetInput {
    public static void main() throws FileNotFoundException{
 for(int i=0; i<=3;i++){
Scanner input=new Scanner(System.in);
System.out.println("Enter some Text: ");
String enteredText=input.nextLine();
System.out.println(enteredText);
    }
    try {
         File file= new File("myfile.text");
    Scanner input =new Scanner(file);
    while (input.hasNextLine()){
        String line=input.nextLine();
        System.out.println(line);  
    input.close();

    }
    } catch (Exception e) {
    }
 
    }
   
}
