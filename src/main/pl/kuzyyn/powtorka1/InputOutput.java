package main.pl.kuzyyn.powtorka1;

import java.io.*;

public class InputOutput {
	void fileOutputTest(){
	String message = "Nowa linia diehehe124125";
	File plikTestowy = new File ("src/pl/kuzyyn/powtorka1/testowy1.txt");
	PrintWriter output;
	
	try {
		output = new PrintWriter(new BufferedWriter(new FileWriter(plikTestowy, true)));
	//	for (int i = 0 ; i<message.length();i++){
		output.println(message);
	//	}
		output.close();
	}catch (FileNotFoundException e){
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	void fileInputTest(){
		File plikTestowy = new File ("src/pl/kuzyyn/powtorka1/testowy1.txt");
		FileInputStream input;
		try{
			input= new FileInputStream(plikTestowy);
			int c;
			String tekst="";
			while ((c=input.read()) !=-1){
				tekst=tekst+(char)c;
				
			}
			System.out.print(tekst);
			input.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void readDirectory(){
		
		String[] paths;
		try {
			File dir = new File("src/pl/kuzyyn/powtorka1");
			paths=dir.list();
			for (String path: paths){
				System.out.println(path);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	void readFromUserInput(){
		System.out.println("Wprowadz jakieœ znaki, quit by wyjsc");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
		while(true){
			line=reader.readLine();
			System.out.println("Napisa³eœ: "+line+"\n");
			if (line.equals("quit")) break;
		} 
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

