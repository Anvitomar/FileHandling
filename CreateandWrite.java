import java.io.File;
	import java.io.FileOutputStream;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
	import java.util.Arrays;
	import java.util.List;
	
	
	public class CreateandWrite {
	
	    public static void main(String[] args) throws IOException
	    {
	        FileClass();
	        OutputStream();
	        createFileIn_NIO();
	    }
	 
	    private static void FileClass() throws IOException
	    {
	          File file = new File("D:\\FILEHANDLING\\File Created1.txt");
	  
	          
	          if (file.createNewFile()){
	            System.out.println(" New File created!");
	          }else{
	            System.out.println("File already exists.");
	          }
	           
	         
	          FileWriter writer = new FileWriter(file);
	          writer.write("First file handling program");
	          writer.close();
	    }
	 
	    private static void OutputStream() throws IOException
	    {
	        String data = "Second-File Handling";
	        FileOutputStream out = new FileOutputStream("D:\\FILEHANDLING\\File Created2.txt");
	        out.write(data.getBytes());
	        out.close();
	    }
	 
	    private static void createFileIn_NIO()  throws IOException
	    {
	        String data = "File Handling program";
	        Files.write(Paths.get("D:\\FILEHANDLING\\File Created3.txt"), data.getBytes());
	        List<String> lines = Arrays.asList("1st line", "2nd line");
	       Files.write(Paths.get("file6.txt"),
	                    lines,
	                    StandardCharsets.UTF_8,
	                    StandardOpenOption.CREATE,
	                    StandardOpenOption.APPEND);
	    }
	}

	