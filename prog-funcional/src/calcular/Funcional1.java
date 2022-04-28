package calcular;

import java.util.List;
import java.util.stream.Collectors;

import interfaces.IContar;
import interfaces.IVisualizar;

public class Funcional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(1,28,3,6,15,4,5,92);
		int counter = 0;
		for (Integer integer : numbers) {
			if (integer>10) {
				counter++;
			}
		}
		
		System.out.println("Hay "+counter+" números mayores que 10");
		
		
		
//		Programación funcional, con una interfaz funcional. 
		IVisualizar listaFuncional = (lista) -> {
			lista.forEach(n -> System.out.println("numeros de la lista " + n));
		};
		listaFuncional.visualizarLista(numbers);
		

//		IVisualizar listaMayores = (lista) -> {
//			lista.forEach(n -> n.max(n, 10));
//		};
//		System.out.println(listaMayores);
//		listaMayores.visualizarLista(numbers);
		
		Object streamNumbers = numbers.stream()
		.filter(n -> n > 10)
		.peek(System.out::println)
		.collect(Collectors.toList());
		
		System.out.println(streamNumbers);
		
		counter = 0;
		
		IContar contar = (lista) -> numbers.stream()
				.filter(n -> n > 10).count();
		System.out.println("cantidad de numeros mayores a 10: " + contar.contarLista(numbers));
		
	}

}
