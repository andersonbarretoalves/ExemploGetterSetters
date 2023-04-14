package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();		
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
		//Resultado no console
		//O Aluno Felipe tem 8 Anos
	}
}
