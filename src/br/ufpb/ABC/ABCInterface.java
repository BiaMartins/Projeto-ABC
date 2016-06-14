package br.ufpb.ABC;
import java.util.List;

import br.ufpb.entidades.ExercicioDeAssociacao;
import br.ufpb.entidades.RespostaDoExercicio;
import br.ufpb.execoes.DesafioInsuficientesException;
import br.ufpb.execoes.ExercicioJaExistenteException;
import br.ufpb.execoes.ExercicioNaoExisteException;
import br.ufpb.execoes.RespostaJaExistenteException;
import br.ufpb.execoes.RespostaNaoExisteException;
import br.ufpb.execoes.RespostasInsuficienteException;


public interface ABCInterface {
	
	public void cadastrarExercicio(ExercicioDeAssociacao exercicio) throws ExercicioJaExistenteException;
	
	public List<ExercicioDeAssociacao> obterDesafios(int numDesafio) throws DesafioInsuficientesException;
	
	public void cadastraRespostaDoExercicio(RespostaDoExercicio resposta) throws RespostaJaExistenteException;
	
	public ExercicioDeAssociacao pesquisarExercicio(String enunciado) throws ExercicioNaoExisteException;
	
	//public RespostaDoExercicio pesquisarResposta(String resposta) throws RespostaNaoExisteException;
	
	public List<ExercicioDeAssociacao> getExercicios();
	
	public List<RespostaDoExercicio> getRespostas();

}
