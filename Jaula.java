public class Jaula {
  
  private int tamanio;
  private String clima;
  private Animal residente;
  
  public Jaula(int tamanioJaula, String climaJaula, Animal residenteJaula) {
    tamanio = tamanioJaula;
    clima = climaJaula;
    residente = residenteJaula;
  }
  
  public int getTamanio() {
      return tamanio;
  }
  
  public String getClima() {
      return clima;      
  }
  
  public Animal getAnimal() {
      return residente;
  }

  public void setTamanio(int tamanioJaula) {
    tamanio = tamanioJaula;
  }

  public void setClima(String climaJaula) {
    clima = climaJaula;
  }

  public void setResidente(Animal residenteJaula) {
    residente = residenteJaula;
  }

  public void imprimirDetalles() {
    System.out.println("Tamaño de la jaula: " + tamanio);
    System.out.println("Clima de la jaula: " + clima);
    System.out.println("Características del residente de la Jaula: ");
    System.out.println("Volador: " + residente.vuela());
    System.out.println("Dimensiones: " + residente.getDimensiones());
  }
}