package com.sinc.intern.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileObj {
	public void saveToFile(File file, String msg) {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(msg);
			System.out.println("save file clear");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void loadToFile(File file) {
		BufferedReader bw = null;
		
		try {
			bw = new BufferedReader(new InputStreamReader(new FileInputStream(file), "euc-kr"));
			String read = bw.readLine();
			System.out.println(read);
			System.out.println("file load clear");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
