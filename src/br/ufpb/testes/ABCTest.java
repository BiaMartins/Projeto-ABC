package br.ufpb.testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufpb.entidades.ExercicioDeAssociacao;
import br.ufpb.entidades.RespostaDoExercicio;
import br.ufpb.execoes.DesafioInsuficientesException;
import br.ufpb.execoes.ExercicioJaExistenteException;
import br.ufpb.execoes.ExercicioNaoExisteException;
import br.ufpb.execoes.RespostaJaExistenteException;
import br.ufpb.execoes.RespostaNaoExisteException;
import br.ufpb.fachada.ABCfachada;
import br.ufpb.imagens.*;

public class ABCTest {
	
	ABCfachada abc;

	@Before
	public void setUp() throws Exception {
		abc = new ABCfachada();
	}

	@Test
	public void cadastrarExercicioAssociacaoTest() {
		ExercicioDeAssociacao exc = criarExercicioDeAssociacaoPadrao_1();
		try {
			abc.cadastrarExercicio(exc);
			assertEquals("Questão 1: Associe a imagem a sua palavra.", abc.pesquisarExercicio(exc.getEnunciado()).getEnunciado());
		} catch (ExercicioJaExistenteException e) {
			fail("Lançou exception sem necessidade");
		} catch (ExercicioNaoExisteException e) {
			fail("Lançou exception sem necessidade");
		}
	
	}
	
	@Test
	public void cadastrarRespostaDoExercicioTest(){
		RespostaDoExercicio resp = criarRespostaDoExercicioPadrao_1();
		try {
			abc.cadastraRespostaDoExercicio(resp);
			assertEquals("Casa", abc.getRespostas().get(0).getResposta());
		} catch (RespostaJaExistenteException e) {
			fail("Lançou exception sem necessidade");
		} 
		
	}
	
	@Test
	public void obterExercicioDeAssociacao(){
		ExercicioDeAssociacao exc1 = criarExercicioDeAssociacaoPadrao_1();
		ExercicioDeAssociacao exc2 = criarExercicioDeAssociacaoPadrao_2();
		try {
			abc.cadastrarExercicio(exc1);
			abc.cadastrarExercicio(exc2);
			abc.obterDesafios(2);
			assertEquals(2,abc.getExercicios().size());
			assertTrue(abc.getExercicios().get(0).getGabarito().equalsIgnoreCase("Casa"));
			assertTrue(abc.getExercicios().get(1).getGabarito().equalsIgnoreCase("Bola"));
		} catch (ExercicioJaExistenteException e) {
			fail("Lançou exception sem necessidade");
		} catch (DesafioInsuficientesException e) {
			fail("Lançou exception sem necessidade");
		}
	
	}
	
	/**@Test
	public void pesquisarRespostaDoExercicio() throws RespostaJaExistenteException{
		RespostaDoExercicio resp1 = criarRespostaDoExercicioPadrao_1();
		RespostaDoExercicio resp2 = criarRespostaDoExercicioPadrao_2();
			try {
				abc.cadastraRespostaDoExercicio(resp1);
				abc.cadastraRespostaDoExercicio(resp2);
				assertEquals(2, abc.getRespostas().size());
				assertTrue(abc.pesquisarResposta(resp1.getResposta()).getResposta().equalsIgnoreCase("Casa"));
				assertTrue(abc.pesquisarResposta(resp2.getResposta()).getResposta().equalsIgnoreCase("Bola"));
				
			} catch (RespostaJaExistenteException e) {
				fail("Lançou exception sem necessidade");
			} catch (RespostaNaoExisteException e) {
				fail("Lançou exception sem necessidade");
				
			} 
	}*/
	
	
	public ExercicioDeAssociacao criarExercicioDeAssociacaoPadrao_1(){
		ExercicioDeAssociacao exercicio = new ExercicioDeAssociacao();
		exercicio.setEnunciado("Questão 1: Associe a imagem a sua palavra.");
		exercicio.setGabarito("Casa");
		return exercicio;
		 
	}
	
	public ExercicioDeAssociacao criarExercicioDeAssociacaoPadrao_2(){
		ExercicioDeAssociacao exercicio = new ExercicioDeAssociacao();
		exercicio.setEnunciado("Questão 2: Associe a imagem a sua palavra.");
		exercicio.setGabarito("Bola");
		return exercicio;
		 
	}
	
	public RespostaDoExercicio criarRespostaDoExercicioPadrao_1(){
		RespostaDoExercicio resposta = new RespostaDoExercicio();
		resposta.setMatriculaDoAluno("82321113");
		resposta.setResposta("Casa");
		return resposta;
	}
	
	public RespostaDoExercicio criarRespostaDoExercicioPadrao_2(){
		RespostaDoExercicio resposta = new RespostaDoExercicio();
		resposta.setMatriculaDoAluno("82321110");
		resposta.setResposta("Bola");
		return resposta;
	}
	

}
