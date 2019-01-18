/*
import static org.junit.jupiter.api.Assertions.*;

class Test {
	@org.junit.jupiter.api.Test
	void testEncendido() {
		Radio radio = new Radio();
		// Revisar que este apagada la radio al instanciarla
    	assertEquals(false,radio.isOn());
    	// Encender la radio
    	radio.encendidoRadio();
    	assertEquals(true,radio.isOn());
    	// Apagar la radio
    	radio.encendidoRadio();
    	assertEquals(false,radio.isOn());
	}
	
	@org.junit.jupiter.api.Test
	void testSubirFrecuencia() {
		Radio radio = new Radio();
		// Encender la radio
    	radio.encendidoRadio();
		// Revisar que la frecuencia default sea 97.9 FM
		assertEquals(97.9,radio.subirFrecuencia(),0.01);
		// Revisar que la frecuencia ahora sea 98.1 FM
		assertEquals(98.1,radio.subirFrecuencia(),0.01);
	}

	@org.junit.jupiter.api.Test
	void testBajarFrecuencia() {
		Radio radio = new Radio();
		// Encender la radio
    	radio.encendidoRadio();
		// Revisar que la frecuencia default sea 97.9 FM
		assertEquals(97.5,radio.bajarFrecuencia(),0.01);
		// Revisar que la frecuencia ahora sea 97.5 FM
		assertEquals(97.3,radio.bajarFrecuencia(),0.01);
	}
	
	@org.junit.jupiter.api.Test
	void testFavorito() {
		Radio radio = new Radio();
		// Encender la radio
		for(int i = 0; i < 10; i++) {
			radio.subirFrecuencia();
		}
		// Agregar una emisora favorita
		radio.setFavorito(5);
		// Cambiar de emisora
		radio.subirFrecuencia();
		radio.subirFrecuencia();
		// Regresar a la guardada
		assertEquals(99.7,radio.getFavorito(5),0.01);
	}
}
*/
