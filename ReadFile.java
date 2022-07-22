import java.util.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 

public class ReadFile {
	  public static List<String> readFile(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List<String> lst = readFile("D:\\FILEHANDLING\\File Created2.txt"); 
	  
	    Iterator<String> itr = lst.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	  } 
	}
