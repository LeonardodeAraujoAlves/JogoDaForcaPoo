package gametemplate.forca;

public class animacao extends desenha{	
	

void desenhoInicial() {
	String Inicial[] = {"-------------","|            |","|            |","|             ","|           ","|           ","|","|","-------------"};
	desenhaForca(Inicial);
}	
void desenhaCabeca() {
		String cabeca[] = {"-------------","|            |","|            |","|            O","|           ","|           ","|","|             ","-------------"};
		desenhaForca(cabeca);
	}
void desenhaTronco() {
		String tronco[] = {"-------------","|            |","|            |","|            O","|            |","| ",           "|","|","-------------",};
		desenhaForca(tronco);
	}
void desenhaBracoDireito() {
		String bracoDireito[] = {"-------------","|            |","|            |","|            O","|           /|","|            ","|","|","-------------"};
		desenhaForca(bracoDireito);
	}
void desenhaBracoEsquerdo() {
		String bracoEsquerdo[] = {"-------------","|            |","|            |","|            O","|           /|\\","|           ","|","|","-------------"};
		desenhaForca(bracoEsquerdo);
	}
void desenhaPernaDireita() {
		String pernaDireita[] = {"-------------","|            |","|            |","|            O","|           /|\\","|           / ","|","|","-------------"};
		desenhaForca(pernaDireita);
	}
void desenhaPernaEsquerda() {
		String pernaEsquerda[] = {"-------------","|            |","|            |","|            O","|           /|\\","|           / \\","|","|","-------------"};
		desenhaForca(pernaEsquerda);
	}
void ganhou(){
    String venceu[] = {"--------------","| Voce       |","|    ganhou  |","|","| UHUUUUU!!!!","|       \\O/","|        |","|       / \\","--------------"};
    desenhaForca(venceu);
}
void gameOver() {
		String gameOver[] = {"-------------","G            |","A            |","M            O","E           /|\\","O           / \\","V","E","R------------"};
		desenhaForca(gameOver);
	}
}

