package gametemplate.forca;

import java.util.ArrayList;
import java.util.Scanner;
import gametemplate.*;
import gametemplate.Util;
import java.util.Random;

public class gameForca  extends Game {
	
        Random sorteio = new Random();
	pegaPalavras palavraUtil = new pegaPalavras();
	Scanner in = new Scanner(System.in);
        animacao anima = new animacao();
        
	String letra;
        String palavraAtual;
        String palavraSortiada;
        String caminho = "src\\Palavras";
        String palavras = "Palavras\\palavras.txt";
      
        int erros = 0;
        
	ArrayList<String>ListaManeira =  new ArrayList<>();
	ArrayList<String>LetrasTentadas= new ArrayList<>();
	ArrayList<String>LetrasCorretas= new ArrayList<>();
			
        @Override
	public void criaNovo() {
		//aqui devera somente gerar a nova palavras escolhidas
                // vai gerar um novo objeto do jogo
		try {   
                         palavraUtil.lendoArquivo(palavras, ListaManeira);
                         palavraSortiada = ListaManeira.get(sorteio.nextInt(ListaManeira.size())).toLowerCase();
			 palavraAtual = palavraSortiada;
                         
		}catch(Exception e) {
			System.out.println("Ocorreu um erro ao criar o novo game" + e);
		}
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
                //adicionar o mescanismo principal aqui
                try{
                     
                    while(erros <=6 || palavraAtual.isEmpty()) {
                                        
                                        Util.clearScreen();
                                         
                                        if(palavraAtual.isEmpty()){
                                            Util.clearScreen();
                                            System.out.println("voce ganhou");
                                            anima.ganhou();
                                            System.out.println("A palavra eh:"+ palavraSortiada);
                                            break;
                                          }  
					if(erros == 0) {
						System.out.println("##########################################################################");
                                                System.out.println("O tema eh : Alimentos");
                                                System.out.println("Sua quantidade de erros = : "+ erros);
						System.out.println("Caracteres errados : "+ LetrasTentadas);
						System.out.println("Letras corretas :"+ LetrasCorretas);
                                                System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                                System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                                System.out.println("##########################################################################");
						 anima.desenhoInicial();
						System.out.println("Digite o caractere a ser tentada:");
						letra = in.next().substring(0,1).toLowerCase();
						
						if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}
					}else if(erros == 1){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
				        System.out.println("Caracteres errados : "+ LetrasTentadas);
				        System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
                                         anima.desenhaCabeca();
					System.out.println("Digite a letra a ser buscada:");
                                            letra = in.next().substring(0,1).toLowerCase();

						if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}
                                        }else if(erros == 2){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
				        System.out.println("Caracteres errados : "+ LetrasTentadas);
				        System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
					 anima.desenhaTronco();
					System.out.println("Digite a letra a ser buscada:");
                                            letra = in.next().substring(0,1).toLowerCase();

					if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}			
					}else if(erros == 3){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
					System.out.println("Caracteres errados : "+ LetrasTentadas);
					System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
					 anima.desenhaBracoDireito();
					System.out.println("Digite a letra a ser buscada:");
                                            letra = in.next().substring(0,1).toLowerCase();

						if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}
					}else if(erros == 4){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
					System.out.println("Caracteres errados : "+ LetrasTentadas);
					System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
				         anima.desenhaBracoEsquerdo();
					System.out.println("Digite a letra a ser buscada:");
					letra = in.next().substring(0,1).toLowerCase();

						if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}
				
					}else if(erros == 5){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
					System.out.println("Caracteres errados : "+ LetrasTentadas);
					System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
					 anima.desenhaPernaDireita();
					System.out.println("Digite a letra a ser buscada:");
					letra = in.next().substring(0,1).toLowerCase();

						if(palavraAtual.contains(letra)) {
                                                        String[] faltantes = palavraAtual.split(letra);
                                                        palavraAtual = String.join("", faltantes);
                                                        LetrasCorretas.add(letra);
                                                }else {
                                                    if(LetrasTentadas.contains(letra)||LetrasCorretas.contains(letra)){
                                                        System.out.println("Essa letra ja foi usada");

                                                    }else{
                                                        LetrasTentadas.add(letra);
                                                        erros += 1;
                                                    }

						}
				
					}else if(erros == 6){
					System.out.println("##########################################################################");
                                        System.out.println("O tema eh : Alimentos");
                                        System.out.println("Sua quantidade de erros = : "+ erros);
					System.out.println("Caracteres errados : "+ LetrasTentadas);
					System.out.println("Letras corretas :"+ LetrasCorretas);
                                        System.out.println("seus acertos: "+ pegaPalavras.escondePalavra(palavraAtual, palavraSortiada));
                                        System.out.println("A palavra sortiada possui:" + palavraSortiada.length() + "Caracteres");
                                        System.out.println("##########################################################################");
					System.out.println("A palavra era :" + palavraSortiada);
					 anima.gameOver();
					break;
                                        
				}
			}
                }catch(Exception e ){
                    System.out.println("Ocorreu um erro durante a  execucao do game " + e);
                }
	}

	@Override
	public void carrega() {
		// TODO Auto-generated method stub
		
	}
}
