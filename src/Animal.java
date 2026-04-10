public abstract class Animal {

    protected String nombre;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void comer() {
        System.out.println(nombre + " está comiendo");
    }

    public abstract void hacerSonido();
}
