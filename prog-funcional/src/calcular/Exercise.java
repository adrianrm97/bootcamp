package calcular;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
	   public static void main(String[] args) {
	      List<Producto> shopping = List.of(
	            new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
	            new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
	            new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
	            new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
	            new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
	            new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
	      
	      //// Implementacion
	      
	      String lista = shopping.stream()
	    		  .map(obj -> obj.name.toString())
	    		  .filter(pro -> pro.startsWith("C"))
	    		  .sorted()
	    		  .collect(Collectors.joining(", "));
	      
	      System.out.println("Los productos que empiezan por C son: "+ lista);
	      
	      Object coste = shopping.stream()
	    		  .map(obj -> obj.price.multiply(BigDecimal.valueOf(((100+obj.impuesto.getPercent())*0.01))))
	    		  .reduce(BigDecimal.ZERO, BigDecimal::add);

	      System.out.println(coste);
	      
//	      		(new BigDecimal(obj.impuesto.getPercent()).divide(BigDecimal.valueOf(obj.impuesto.getPercent())))
	      
	   }
	}
