package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro (int linhas, int colunas, int minas) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
	
		gerarCampos(); 
		AssociarOsVizinhos();
		sortearMinas();
		
	}
	
		private void gerarCampos() {
			for (int linha = 0; linha < linhas; linha++) {
				for (int coluna = 0; colunas < colunas; colunas++) {
					campos.add(new Campo(linha, coluna));
				}
			}
			
		}
		
		private void AssociarOsVizinhos() {
			for (Campo c1: campos) {
				for (Campo c2: campos) {
					c1.adicionarVizinho(c2);
				}
			}
			
		}
		
		private void sortearMinas() {
			
		
		}

	

	
}
