public class Pajaro extends Animal implements Volador {

    public Pajaro() {
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Pajaro(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    public void volar() {
        System.out.println(nombre + " está volando");
    }
}
