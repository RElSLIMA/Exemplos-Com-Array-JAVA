import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cores = new ArrayList<String>();
    
    cores.add("Vermelho");
    cores.add("Azul");
    cores.add("Verde");
    cores.add("Amarelo");
    System.out.println(cores);

    cores.remove("Vermelho");
    cores.remove("Amarelo");
    System.out.println(cores);

    cores.add(0, "Roxo");
    cores.add(1, "Laranja");
    System.out.println(cores);

    cores.add(cores.indexOf("Verde"), "Cinza");
    System.out.println(cores);

    cores.clear();
    System.out.println(cores);
    
  }
}