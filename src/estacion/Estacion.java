package estacion;

public class Estacion {

    private int id = 0;
    private String direccion = null;
    private int numeroAnclaje = 0;
    private int[] anclajes = null;

    public Estacion(int id, String direccion, int numeroAnclaje, int[] anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclaje = numeroAnclaje;
        this.anclajes = anclajes;
    }

    public void consultarEstacion() {
        System.out.println("La estación actual es la " + this.id + ", está situada en " + this.direccion + " y tiene " + this.numeroAnclaje + " anclajes");
    }

}
