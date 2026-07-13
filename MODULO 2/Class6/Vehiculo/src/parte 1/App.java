public class App {
    public static void main(String[] args) throws Exception {
         Moto moto = new Moto("Yamaha");
        moto.acelerar();
        moto.hacerCaballito();
    }
}

// Clase Moto añadida en el mismo archivo para resolver el error "cannot be resolved to a type"
class Moto {
    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println(marca + " está acelerando.");
    }

    public void hacerCaballito() {
        System.out.println(marca + " hace un caballito!");
    }
}
