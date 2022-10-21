package ifsc;

public class MainPessoa {
	
	public static void main(String[]args) {
		
		Professor prof = new Professor();
		prof.setNome("Bruna");
		prof.setSiape(00000000l);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Emily");
		aluno.setMatricula(202021807944l);
		
		System.out.println(prof.getNome());
		System.out.println(prof.getSiape());
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		
	}
}
