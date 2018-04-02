package arrayunidimensional;
import java.util.Arrays;
public class ArrayUnidimensional {
	public static void main(String[] args) {
		/* Array � um conjunto indexado de informa��es */
		// Criar um array (alunos), recebe string
		// Primeira forma � mais utilizada na orienta��o a objeto
		String alunos[] = new String [5];
		
		alunos[0] = "Rodrigo";
		alunos[1] = "Vitin";
		alunos[2] = "Vit�o";
		alunos[3] = "Junin";
		alunos[4] = "Erick";
		
		// Segunda forma mais usada na Programa��o estruturada
		// String alunos [] = ["Rodrigo", "Vitin", "Vit�o", "Junin", "Erick"];
		double notas[] = new double [5];
		
		notas[0] = 8.5;
		notas[1] = 7.4;
		notas[2] = 8.2;
		notas[3] = 7.6;
		notas[4] = 9.5;
		
		//double notas[] = [5.5, 6.4, 8.4, 7.3, 9.5];
		
		// Se desejar trocar algum valor:
		// notas[0] = 10.0;
		// alunos[4] = "Pablo";
		
		// Para exibir o comprimento do array
		System.out.println("Array alunos possui " + alunos.length + " posi��es.");
		System.out.println("Array notas possui " + notas.length + " posi��es.");
		// Para exibir o contador do array
		// .toString joga na tela o vetor exibido em forma de string
		System.out.println("Alunos: " + Arrays.toString(alunos));
		System.out.println("Notas: " + Arrays.toString(notas));
		// Para exibir um determinado elemento do array de acordo com seu �ndice
		System.out.println("Aluno no �ndice 3: " + alunos[3]);
		System.out.println("Nota no �ndice 3: " + notas[3]);
		
		System.out.println("-----------------------------------------------------");
		
		// Pesquisar no array
		// Utilizar o m�todo binarySearch
		int indice = Arrays.binarySearch(alunos, "Vitin");
		System.out.println("O aluno Vitin se encontra no �ndice " + indice + " do array.");
		
		// Ordena��o do array m�todo Sort
		Arrays.sort(notas, 0, notas.length);
		Arrays.sort(alunos, 0, alunos.length);
		System.out.println("Notas ordenadas: " + Arrays.toString(notas));
		System.out.print("Alunos ordenados: " + Arrays.toString(alunos));
	}

}
