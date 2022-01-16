package com.KeyRepositories;
import java.io.File;
import java.util.*;
import java.io.IOException;
public class FileOperationKey 
{

  public void printWelcomeScreen(String appName,String developerName,String Email)
  {
	  String companyDetails=appName;
	  String appFunction=developerName;
	  String Mail=Email;
	  System.out.println("             ***************************       ** Welcome to    "
	                    +companyDetails+".com     ***************************\n        ***************************** This application was developed by   "
			            +appFunction+
				        "      ******************************************\n"+"                     *********************"
				        		+   "*"+Mail+     "************************              \n\n\n\n");
	
  }
  public static void welcome2()
  {
	  String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);
  }
  public static void displayMenu() 
  {
	  String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"Project\" folder\n" + "2) Delete a file from Project  folder\n"
				+ "3) Search for a file from input folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
		
		

  }
  public static void createMainFolderIfNotPresent(String folderName) 
  {
			File file = new File(folderName);

			// If file doesn't exist, create the main folder
			if (!file.exists()) 
			{
				file.mkdirs();
			}
  }

  public static void displayAllFiles(String path) 
  {
	  //Creating a File object for directory
      File directoryPath = new File(path);
      //List of all files and directories
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<contents.length; i++) 
      {
         System.out.println(contents[i]);
      }
	      
	}
 
  public static void AddFile()   throws IOException
  {
	  
	  Scanner scan=new Scanner(System.in);
	   	 ArrayList<String> al=new ArrayList<>();
	   	// while(true) 
	   	 //{
	   		 System.out.println("enter the file name to create");
		   	 String filename=scan.next();
		   	 System.out.println("enter the folder name where you want to create file");
		   	 String path = scan.next();
		   	 File f=new File(path+filename);
		   	 boolean result=f.createNewFile();
		   	 if(result==false) 
		   	   {
		   		 System.out.println("file is already exist");
		   	   }
		   	 else 
		   	   {
		   		 al.add(filename);
		   		 System.out.println("file is created at : "+filename);
		   	   }
		   	
	   	 }
	   	

  
  public static void DeleteFile()  throws IOException
  {
	  System.out.println("enter the name of the file to be deleted ");
	  Scanner scan = new Scanner(System.in);
	  String filename = scan.next();
	  System.out.println("enter the folder where you have to delete file");
	  String path = scan.next();
				File currFile = new File(path+filename);
				File[] files = currFile.listFiles();

				if (files != null && files.length > 0) 
				{
					for (File file : files) 
					{

						String fileName = file.getName() + " at " + file.getParent();
						if (file.isDirectory()) 
						{
							//DeleteFile(file.getAbsolutePath());
						}

						if (file.delete()) 
						{
							System.out.println(fileName + " deleted successfully");
						} else {
							System.out.println("Failed to delete " + fileName);
						}
					}
				}

				String currFileName = currFile.getName() + " at " + currFile.getParent();
				if (currFile.delete()) 
				{
					System.out.println("deleted successfully");
				} 
				else 
				{
					System.out.println("File Not Found");
				}
			}
			

	
	public void findFile(String name,File file)
	{
	File[] list = file.listFiles();
	if(list!=null)
	for (File fil : list)
	{
	if (fil.isDirectory())
	{
	findFile(name,fil);
	}
	else if (name.equalsIgnoreCase(fil.getName()))
	{
	System.out.println("File Is Present");
	}
	}
	}	
 	
}
  
 
