package com.web.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToWriteFile_44 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the file name to write to: ");
	        String fileName = scanner.nextLine();

	        try {
	            FileWriter fileWriter = new FileWriter(fileName);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	            System.out.println("Enter text to write to the file (type 'exit' to finish):");
	            String line;
	            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
	                bufferedWriter.write(line);
	                bufferedWriter.newLine();
	            }

	            bufferedWriter.close();
	            System.out.println("Text has been written to the file successfully.");
	        } catch (IOException e) {
	            System.err.println("An error occurred while writing to the file: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}


