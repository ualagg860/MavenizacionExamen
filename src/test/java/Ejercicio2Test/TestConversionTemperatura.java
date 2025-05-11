package Ejercicio2Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import Ejercicio2.ConversionTemperatura;

public class TestConversionTemperatura {

	
@ParameterizedTest

@CsvFileSource(files = "src/test/java/Ejercicio2Test/datosTest.csv")


void testTemperatura(double temperatura, String fromUnit, String toUnit, double expected) {
	
	
    ConversionTemperatura convr = new ConversionTemperatura(); 
    double temperaturaCalculada = convr.convertTemperature(temperatura, fromUnit, toUnit); 
    
    assertEquals(expected, temperaturaCalculada, 0.000001); 
	

}

}


