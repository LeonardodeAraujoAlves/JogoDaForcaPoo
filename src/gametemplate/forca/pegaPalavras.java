package gametemplate.forca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//classe responsavel por realizar a leitura do aruivo de texto e armazaenar em um arrayList

public class pegaPalavras {
	 
        boolean verificaCaminho(Path caminho) {
                if(Files.isDirectory(caminho)) {
			//System.out.println("O diretoio existe");
			return true;
		}else {
			//System.out.println("Existe nao");
			return false;
		}
	}
	//funcao para verifica a existencia do arquivo
	boolean verificaArquivo(Path arquivo) {
		if(Files.exists(arquivo)) {
			
			return true;
		}else {
			
			return false;
		}
	}
	//
	public void lendoArquivo(String arquivoComCaminho, ArrayList<String>ListaParaAdicionar ){
            try {   
                        File arq = new File(arquivoComCaminho);
                        Scanner leitor = new Scanner(arq);
                        while(leitor.hasNextLine()){
                                 ListaParaAdicionar.add(leitor.nextLine());
                        }
            }catch(Exception e) {
			System.out.println("Ocorreu um erro ao carregar o aquivo, ou o arquivo foi corrompido ou nao existe" + e);
		}     
        }
        //função que esconde a palavra usada durante o jogo e substitui os caracteres
        static String escondePalavra(String faltantes, String palavra) {
        StringBuilder forca = new StringBuilder();
        
        for (String caracteres : palavra.split("")) {
            if(faltantes.contains(caracteres)) {
                forca.append("#");
            }
            else {
                forca.append(caracteres);
            }
        }
        return forca.toString();
        }
            
}
