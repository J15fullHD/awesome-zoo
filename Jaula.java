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
}