package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de Saida com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		bw.newLine();
		bw.newLine();
		bw.write("Fimmmmmmm");
		
//		fw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
//		fw.write(System.lineSeparator()); //Devolve um separador de linha para cada sistema operacional
//		fw.write(System.lineSeparator());
//		fw.write("Fimmmmmmmmmmmmmm");
		
//		fw.close();
		bw.close();
	}

}
