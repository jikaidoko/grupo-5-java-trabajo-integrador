import prode.datos.Participante;
import prode.datos.Partido;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {

        //SE CREAN UNA INSTANCIA DE LA CLASE "PERSONA"

        Participante persona1 = new Participante("Juan", "LOPEZ");

        //CODIGO PARA LEER ARCHIVO

        String resultadoPartidos = "C:\\Users\\SDM\\Documents\\Curso Java\\Repositorio\\Partidos.csv";
        for (String linea: Files.readAllLines(Paths.get(resultadoPartidos))) {
            System.out.println("Ejemplo: " + linea);
        }

        //CODIGO PARA CREAR UN ARRAY DE 2 DIMESIONES

        String tablaPartidos[][] = new String[3][6];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("Indice[" + i + "][" + j + "] = " + tablaPartidos[i][j]);
            }
            System.out.println();
        }
    }
}

