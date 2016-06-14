package br.ufpb.entidades;


public class RespostaDoExercicio {
	private final int numerosDeTentativas = 3;//numero de tentativas
	private String matriculaDoAluno;
	private ExercicioDeAssociacao exercicio;
	private String resposta;// lista
	
	public RespostaDoExercicio(){
		
	}

	public int getQuantidadeMaxDeAcerto() {
		return numerosDeTentativas;
	}

	public String getMatriculaDoAluno() {
		return matriculaDoAluno;
	}

	public void setMatriculaDoAluno(String matriculaDoAluno) {
		this.matriculaDoAluno = matriculaDoAluno;
	}
	public String getResposta(){
		return resposta;
	}
	public void setResposta(String resposta){
		this.resposta= resposta;
	}
	public boolean EstahCorreta() {
		if (exercicio.getGabarito().equals(resposta)) {
			return true;
		}
		return false;

	}
	
	

}	