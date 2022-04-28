package calcular;

import java.util.List;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colores = List.of("azul","verde","rojo","amarillo","rosa");
		
		
		//Utilizando el metodo stream() --> recorrer la lista, filtrar el color rojo y pasar a mayuscula
		
		Object listaColores = colores.stream()
				.filter(color -> !color.equals("rojo"))
				.map(color -> color.toString().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(listaColores);
	}

}
