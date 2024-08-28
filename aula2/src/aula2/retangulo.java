package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author kali
 */
public class retangulo {

	private int altura;
	private int comprimento;

	/**
	 *
	 * @param altura
	 */
	public void setAltura(int altura) {
		if (altura < 0){
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		this.altura = altura;
	}

	/**
	 *
	 * @param comprimento
	 */
	public void setComprimento(int comprimento) {
		if (comprimento < 0){
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		this.comprimento = comprimento;
	}

	public int getAltura() {
		return altura;
	}

	public int getComprimento() {
		return comprimento;
	}

	/**
	 *
	 * @return perimetro
	 */
	public int calcularPerimetro(){
		return 2 * (this.altura + this.comprimento);	
	}

	/**
	 *
	 * @return area
	 */

	public int area(){
		return this.altura * this.comprimento;		
	}
}