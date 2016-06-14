package br.ufpb.fachada;
import java.util.List;

import br.ufpb.*;
import br.ufpb.ABC.ABCInterface;
import br.ufpb.ABC.GerenteDeExcercicio;
import br.ufpb.ABC.GerenteDeResposta;
import br.ufpb.entidades.ExercicioDeAssociacao;
import br.ufpb.entidades.RespostaDoExercicio;
import br.ufpb.execoes.DesafioInsuficientesException;
import br.ufpb.execoes.ExercicioJaExistenteException;
import br.ufpb.execoes.ExercicioNaoExisteException;
import br.ufpb.execoes.RespostaJaExistenteException;
import br.ufpb.execoes.RespostaNaoExisteException;
import br.ufpb.execoes.RespostasInsuficienteException;

public class ABCfachada implements ABCInterface {
	private GerenteDeExcercicio gerenteExerc;
	private GerenteDeResposta gerenteResp;
	
	public ABCfachada() throws Exception{
		this.gerenteExerc = new GerenteDeExcercicio();
		this.gerenteResp = new GerenteDeResposta();
	}

	@Override
	public void cadastrarExercicio(ExercicioDeAssociacao exercicio) throws ExercicioJaExistenteException {
		gerenteExerc.cadastraExercicio(exercicio);
		
	}

	@Override
	public List<ExercicioDeAssociacao> obterDesafios(int numDesafio) throws DesafioInsuficientesException {
		return this.gerenteExerc.obterDesafios(numDesafio);
	}

	@Override
	public void cadastraRespostaDoExercicio(RespostaDoExercicio resposta) throws RespostaJaExistenteException {
		gerenteResp.cadastraRespostaDeExercicio(resposta);
		
	}

	
	@Override
	public ExercicioDeAssociacao pesquisarExercicio(String enunciado) throws ExercicioNaoExisteException {
		return this.gerenteExerc.pesquisarExercicio(enunciado);
	}
	
	/**@Override
	public RespostaDoExercicio pesquisarResposta(String resposta) throws RespostaNaoExisteException {
		return this.gerenteResp.pesquisarResposta(resposta);
	}*/

	@Override
	public List<ExercicioDeAssociacao> getExercicios() {
		return this.gerenteExerc.getExercicios();
	}

	@Override
	public List<RespostaDoExercicio> getRespostas() {
		return this.gerenteResp.getRespostas();
	}

	

}
