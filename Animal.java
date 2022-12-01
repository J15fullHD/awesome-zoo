public class Animal {

	private boolean volador;
	private float dimensiones;

	public Animal(boolean esVolador, float dimensionesAnimal) {
		volador = esVolador;
		dimensiones = dimensionesAnimal;
	}

	public boolean vuela() {
		return volador;
	}

	public float getDimensiones() {
		return dimensiones;
	}

	public void imprimirDetalles() {
		System.out.println("Volador: " + volador);
		System.out.println("Dimensiones: " + dimensiones);
	}
}
