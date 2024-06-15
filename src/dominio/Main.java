package dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devOsvaldo = new Dev();
		devOsvaldo.setNome("Osvaldo");
		devOsvaldo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Osvaldo" + devOsvaldo.getConteudosInscritos());
		devOsvaldo.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Osvaldo" + devOsvaldo.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Osvaldo" + devOsvaldo.getConteudosConcluidos());
		System.out.println("XP:" + devOsvaldo.calcularTotalXp());
		
		System.out.println("--------");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("_");
		System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Maria" + devMaria.getConteudosConcluidos());
		System.out.println("XP:" + devMaria.calcularTotalXp());
		
		
		
		
	}

}
