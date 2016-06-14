package br.ufpb.ABC;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;








import br.ufpb.entidades.ExercicioDeAssociacao;
import br.ufpb.entidades.RespostaDoExercicio;
import br.ufpb.execoes.*;

public class GerenteDeResposta {
	private List<RespostaDoExercicio> respostas;
	
	public GerenteDeResposta(){
		respostas = new LinkedList<RespostaDoExercicio>();
		
	}
	
	public void cadastraRespostaDeExercicio(RespostaDoExercicio resposta) throws RespostaJaExistenteException{
		for(RespostaDoExercicio x: respostas){
			if(x.getResposta().equalsIgnoreCase(resposta.getResposta())){ 
				throw new RespostaJaExistenteException("Exercicio já existe!");
			}
		}
		respostas.add(resposta);
	}

	/**public RespostaDoExercicio pesquisarResposta(String resposta) throws RespostaNaoExisteException{
		for(RespostaDoExercicio x: respostas){
			if(x.getResposta().equalsIgnoreCase(resposta)){
				return x;
			}
		}
		throw new RespostaNaoExisteException("Resposta inexistente!");
	}*/
	
	public List<RespostaDoExercicio> getRespostas(){
		return respostas;
	}
}
