package prode.datos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Partido {

    //DEFINIR ARGUMENTOS PARA PARTICIPANTE
        //Nombre
        //Apellido

    //DEFINIR ARGUMENTOS DE "PARTIDO" MEDIANTE LECTURA DE ARCHIVO EXTERNO

    private static void resultadoPartidos() throws IOException {

        String resultadoPartidos = "C:\\Users\\SDM\\Documents\\Curso Java\\Repositorio\\Partidos.csv";
        for (String linea: Files.readAllLines(Paths.get(resultadoPartidos))) {
        }

        //DEFINIR ARGUMENTOS PARA EQUIPO

        //-----------METODOS-----------

        //SIGUIENTE: CONVERTIR LOS DATOS EN UN ARRAY DE 2 DIMENSIONES
        //SIGUIENTE: CONVERTIR LOS NUEMROS EN ENTEROS PARA PODER CALCULAR RESULTADOS DE PARTIDOS
        //SIGUIENTE: DEVOLVER (RETURN) "EQUIPO GANADOR"




    }

}
