package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\windows";
		String path = "C\\TEMP\\relatorio";
		String nome = "relatorio.txt";
		
		try {
			arqCont.readDir(dirWin);
			//arq.createFile(path, nome);
			arqCont.readFile(path,  nome);
			arqCont.openFile(path,  nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
