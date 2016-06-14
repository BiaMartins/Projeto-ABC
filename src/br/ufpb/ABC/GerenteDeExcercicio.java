package br.ufpb.ABC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import br.ufpb.entidades.ExercicioDeAssociacao;
import br.ufpb.execoes.*;

public class GerenteDeExcercicio {
	private List<ExercicioDeAssociacao> exercicios;
	
	public GerenteDeExcercicio(){
		exercicios= new LinkedList<ExercicioDeAssociacao>();
	}
	
	public void cadastraExercicio(ExercicioDeAssociacao exc) throws ExercicioJaExistenteException{
		for(ExercicioDeAssociacao x: exercicios){
			if(x.getEnunciado().equalsIgnoreCase(exc.getEnunciado())){ // verifica em todo mapa se existe o valor passado como parametro.
				throw new ExercicioJaExistenteException("Exercicio já existe!");
			}
			
		}
		exercicios.add(exc);
	}
	
	public List<ExercicioDeAssociacao> obterDesafios(int numDesafio) throws DesafioInsuficientesException {
		if(numDesafio <= this.exercicios.size()){
			Random gerador = new Random();
			List< ExercicioDeAssociacao> novaLista = new LinkedList<ExercicioDeAssociacao>();
			int i = 0;
 			while(i < numDesafio){
 				int contador = 0;
 				int indiceAleatorio = gerador.nextInt(this.exercicios.size());
 				for(ExercicioDeAssociacao k :novaLista){  // verifica se a questão a leatória já está na novaLista
 					if(k.getEnunciado().equalsIgnoreCase(this.exercicios.get(indiceAleatorio).getEnunciado())){
 						break;
 					}
 					else{
 						contador++;
 					}
 				}
 				if(contador == novaLista.size()){
 					novaLista.add(exercicios.get(indiceAleatorio));
 					i++;
 				}
 			}//fim do while
 			return novaLista;
		}//fim if
		
		throw new DesafioInsuficientesException("Não existe questões suficientes\n" + "Total de questões atual: " + 
		this.exercicios.size());
	}//fim do obterQuz
	
	public ExercicioDeAssociacao pesquisarExercicio(String enunciado) throws ExercicioNaoExisteException{
		for(ExercicioDeAssociacao x: exercicios){
			if(x.getEnunciado().equalsIgnoreCase(enunciado)){
				return x;
			}
		}
		throw new ExercicioNaoExisteException("Exercício inexistente!"); 
	}
	
	public List<ExercicioDeAssociacao> getExercicios(){
		return exercicios;
	}
	

}
