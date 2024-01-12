package abc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) {
		
		try {
			File rr = new File("C:\\demojsp\\demo.txt");
			if(rr.createNewFile()) {
				System.out.println("Created Succesfully");
			}else {
				System.out.println("File already Exist");
			}
			FileWriter fw = new FileWriter("C:\\demojsp\\demo.txt");
			fw.write("Hello this file is created through Java file");
			fw.write("ThankYou...!!!!!!!");
			fw.close();
		} catch (IOException e) { 
		
			e.printStackTrace();
		}
		
	}
	}