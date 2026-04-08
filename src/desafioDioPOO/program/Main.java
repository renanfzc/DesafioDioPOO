package desafioDioPOO.program;

import java.time.LocalDate;

import desafioDioPOO.entities.Bootcamp;
import desafioDioPOO.entities.Curso;
import desafioDioPOO.entities.Dev;
import desafioDioPOO.entities.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso JAVA");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("MENTORIA JAVA");
		mentoria.setDescricao("descricao JAVA");
		mentoria.setData(LocalDate.now());
	
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println();
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("JAVA Developer");
		bootcamp.setDescricao("Descição Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRenan = new Dev();
		devRenan.setNome("Renan");
		devRenan.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Renan: " + devRenan.getConteudosInscritos());
		devRenan.progredir();
		devRenan.progredir();
		devRenan.progredir();
		System.out.println("---------------------");
		System.out.println("Conteudos inscritos Renan: " + devRenan.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Renan: " + devRenan.getConteudosConcluidos());
		System.out.println("XP: " + devRenan.calcularTotalXp());
		
		System.out.println("====================");
		
		Dev devLorenzo = new Dev();
		devLorenzo.setNome("Lorenzo");
		devLorenzo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Lorenzo: " + devLorenzo.getConteudosInscritos());
		devLorenzo.progredir();
		System.out.println("---------------------");
		System.out.println("Conteudos inscritos Lorenzo: " + devLorenzo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Lorenzo: " + devLorenzo.getConteudosConcluidos());
		System.out.println("XP: " + devLorenzo.calcularTotalXp());
		

		
	}

}
