package com.KeyRepositories;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HandleOperationKey
{
  public static void handleWelcomeScreenInput() 
	{
	 
	  boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				FileOperationKey.welcome2();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					System.out.println("Enter the directory where to display ");
					String directory = sc.next();
					FileOperationKey.displayAllFiles(directory);
					//PractiseArray2.displayAllFiles("C:\\Users\\91993\\Desktop\\JAVA\\New_Project001\\");
					break;
				case 2:
					HandleOperationKey.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}


public static void handleFileMenuOptions() {
	boolean running = true;
	
	Scanner sc = new Scanner(System.in);
	do {
		try {
			
		  //FileOperationKey.createMainFolderIfNotPresent("SimpliLearn");
			FileOperationKey.displayMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1:
				
				FileOperationKey.AddFile();
				
				break;
			case 2:
				// File/Folder delete
				FileOperationKey.DeleteFile();
				break;
			case 3:
               
				// File Folder Search//
				FileOperationKey pc = new FileOperationKey();
				System.out.println("Enter the file to be searched.. " );
				String name = sc.next();
				System.out.println("Enter the directory where to search ");
				String directory = sc.next();
				pc.findFile(name,new File(directory));
				break;
			case 4:
				
				   return;
				 
			case 5:
				//Exit//
				System.out.println("Program exited successfully.");
				running = false;
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please select a valid option from above.");
			}
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
			handleFileMenuOptions();
		}
	} while (running == true);
}
}
