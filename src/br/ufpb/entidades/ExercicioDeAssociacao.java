package br.ufpb.entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import br.ufpb.execoes.*;

public class ExercicioDeAssociacao {
	private String enunciado;
	private String Idimagem; // caminho da imagem
	private ModeloDeLetra modeloDeLetras;
	private TipoDeLetra tipoDeLetras;
	private String gabarito;
	//opçoes de respostas;
	
	
	
	public ExercicioDeAssociacao(){
		this.tipoDeLetras = TipoDeLetra.BASTAO;
		this.modeloDeLetras = ModeloDeLetra.MINUSCULA;
	}
	
	public ExercicioDeAssociacao(String gabarito){
		this.gabarito= gabarito;
	}

	public ModeloDeLetra getModeloDeLetras() {
		return modeloDeLetras;
	}

	public void setModeloDeLetras(ModeloDeLetra modeloDeLetras) {
		this.modeloDeLetras = modeloDeLetras;
	}

	public TipoDeLetra getTipoDeLetras() {
		return tipoDeLetras;
	}

	public void setTipoDeLetras(TipoDeLetra tipoDeLetras) {
		this.tipoDeLetras = tipoDeLetras;
	}



	public String getEnunciado() {
		return enunciado;
	}



	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}



	public String getIdImagem() {
		return Idimagem;
	}



	public void setIdImagem(String Idimagem) {
		this.Idimagem = Idimagem;
	}



	public String getGabarito() {
		return gabarito;
	}



	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}
	
	
	
	/*public void setIdDesafio(List<ExercicioDeAssociacao> desaf){
		this.desafios = desaf;
	}
	
	public void apagarDesafio(String IdDesafio) throws ExercicioNaoExisteException{
		ExercicioDeAssociacao questao = pesquisarExercicio(IdDesafio);
		desafios.remove(questao);
	}
	*/
	
	
}
	
	