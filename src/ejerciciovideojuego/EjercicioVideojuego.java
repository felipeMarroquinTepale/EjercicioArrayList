package ejerciciovideojuego;

import logica.VideJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {

        //crear arrayList de tipo Videojuego
        List<VideJuego> listaVideoJuegos = new ArrayList<VideJuego>();
        //Crear 5 videojuego y agregar a la arrayList
        VideJuego video1 = new VideJuego(123,"Gear of war","xBox",3,"Plataforma");
        VideJuego video2 = new VideJuego(1230,"Mario","Nitendo 64",3,"Plataforma");
        VideJuego video3 = new VideJuego(124,"Fifa 2012","PS3",3,"Plataforma");
        VideJuego video4 = new VideJuego(193,"Counter strike 1.6","xBox",3,"Plataforma");
        VideJuego video5 = new VideJuego(103,"Mario kart 64","Nitendo 64",3,"Plataforma");

        //Agregar videojuegos a la Lista que creamos
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);
        listaVideoJuegos.add(video4);
        listaVideoJuegos.add(video5);

        //Recorremos array list y mostramos titulo,consola y cant jugadores
        for (VideJuego listaV: listaVideoJuegos){
            System.out.println("Titulo: "+listaV.getTitulo()+"\n"+"Consola: "+listaV.getConsola() +"\n"+ "Cantidad jugadores: "+ listaV.getCantJugadores());
            System.out.println("-------------------------------");
        }

        //Elegimos cualquier videojuego y cambiemos el nombre y cant de jugadores
        video2.setTitulo("Call of Duty");
        video2.setCantJugadores(2);

        System.out.println("-------------------modifcado----------------");
        for (VideJuego listaV: listaVideoJuegos){
            System.out.println("Titulo: "+listaV.getTitulo()+"\n"+"Consola: "+listaV.getConsola() +"\n"+ "Cantidad jugadores: "+ listaV.getCantJugadores());
            System.out.println("-------------------------------");
        }

        //Mostrar unicamente los videjuegos que la consola sea de tipo nitendo 64

        System.out.println("-------------------Consola tipo nitendo 64----------------");
        for (VideJuego listaV: listaVideoJuegos){
            if (listaV.getConsola().equals("Nitendo 64")){
                System.out.println(listaV.toString());
            }
        }


    }
}
