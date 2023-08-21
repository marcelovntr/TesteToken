import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leitor_de_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner (System.in);
	
		
	List<Double> notas=new ArrayList<>(); 
	int soma=0;	
	int cc=0;
	double menor=0;
	double maior=0;
	
	for(int i=0;i<5;i++) {
		System.out.println("digite a nota de 5 alunos:");
		notas.add(input.nextDouble());
		soma+=notas.get(i);
		double nota=notas.get(i);
		
		if(nota<6) {
			cc++;
		}
	
		if(i==0) {
			maior=nota;
			menor=nota;
		}
		
		else if(nota>maior) {
			maior=nota;
		}
	
		if(nota<menor) {
			menor=nota;
		}
	
	
	}
	
	double media=soma/5;
	System.out.println("total: "+notas.size());
	System.out.println("soma: "+soma);
	System.out.println("média: "+media);
	System.out.println("notas abaixo de 6: "+cc);
	System.out.println("nota maior: "+maior);
	System.out.println("nota maior: "+menor);
	
	System.err.println("Última Modificação");
	
	System.out.println("mais uma tokien");
	
	input.close();
	}

}
