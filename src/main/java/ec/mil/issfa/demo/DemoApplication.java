package ec.mil.issfa.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.mil.issfa.demo.models.Factura;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Factura facturaventas = new Factura();
		facturaventas.setTotal(20);
		facturaventas.setFecha(new Date());
		System.out.println(facturaventas);
		System.out.println(facturaventas.calcularImpuesto());

		String condicion;
		if (facturaventas.getTotal()<20){
			condicion = "calculado impuesto";
		}else{
			condicion = "no calculado";
		}

		System.out.println(condicion);

		for (int i=0;i<10; i++){
			System.out.println("paso "+i);
	}
	}
}
