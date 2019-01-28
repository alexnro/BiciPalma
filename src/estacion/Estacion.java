package estacion;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {


    private int id = 0;
    private String direccion = null;
    private int numeroAnclaje = 0;
    private Bicicleta[] anclajes = null;

    public Estacion(int id, String direccion, int numeroAnclaje) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclaje = numeroAnclaje;
        this.anclajes = new Bicicleta[numeroAnclaje];
    }

    public int getId() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclaje() {
        return this.numeroAnclaje;
    }

    public void consultarEstacion() {
        System.out.println("id: " + this.id);
        System.out.println("direccion: " + this.direccion);
        System.out.println("numeroAnclajes: " + this.numeroAnclaje);
    }
    
    public int anclajesLibres() {
        int anclajesLibre = 0;

        for (Bicicleta anclaje: this.anclajes) {
            if (anclaje == null) {
                anclajesLibre++;
            }
        }
        return anclajesLibre;
    }

    public void consultarAnclajes() {

        int posicion = 0;

        for (Bicicleta bicicleta : this.anclajes){
            posicion++;
            if (bicicleta == null ){
                System.out.println("Anclaje " +  posicion + " libre" );
            } else {
                System.out.println("Anclaje " + posicion + " " + bicicleta.getId() );
            }
        }
    }

    public void anclarBicicleta(Bicicleta bicicleta) {

        int posicion = 0;
        int numeroAnclaje = posicion + 1;

        for (Bicicleta anclaje: this.anclajes) {
            if (anclaje == null) {
                this.anclajes[posicion] = bicicleta;
                mostrarAnclaje(bicicleta, numeroAnclaje);
                break;
            } else {
                posicion++;
                numeroAnclaje++;
            }
        }
    }

    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje) {
        System.out.println("Bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + numeroAnclaje);
    }

    public Boolean leerTarjetaUsuario (TarjetaUsuario tarjetaUsuario) {
        return tarjetaUsuario.getActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        //TODO
    }

    public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
        System.out.println("Bicicleta " + bicicleta.getId() + " en el anclaje " + numeroAnclaje);
    }

    public int generarAnclaje() {
        int numeroEntero = ThreadLocalRandom.current().nextInt(0, this.anclajes.length);
        return numeroEntero;
    }
}
