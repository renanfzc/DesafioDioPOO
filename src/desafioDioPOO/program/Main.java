package desafioDioPOO.program;

import java.time.LocalDate;

import desafioDioPOO.entities.Curso;
import desafioDioPOO.entities.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso JAVA");
		curso1.setCargaHoraria(22);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso JavaScript");
		curso2.setCargaHoraria(30);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("MENTORIA JAVA");
		mentoria.setDescricao("descricao JAVA");
		mentoria.setData(LocalDate.now());
	
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println();
		System.out.println(mentoria);
		
		
		
	}

}
