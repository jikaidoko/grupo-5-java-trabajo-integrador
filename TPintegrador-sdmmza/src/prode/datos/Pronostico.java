package prode.datos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pronostico {

    //DEFINIR ARGUMENTOS PARA PARTICIPANTE
    private Participante persona;


    //DEFINIR ARGUMENTO PARA "PRONOSTICO" MEDIANTE LECTURA DE ARCHIVO EXTERNO

    private static void resultadoPronosticos() throws IOException{

        String resultadoPronosticos = "C:\\Users\\SDM\\Documents\\Curso Java\\Repositorio\\Pronosticos.csv";
        for (String linea: Files.readAllLines(Paths.get(resultadoPronosticos))) {
        }

        //-----------METODOS-----------

        //SIGUIENTE: CONVERTIR LOS DATOS EN UN ARRAY DE 2 DIMENSIONES
        //SIGUIENTE: COMPARAR X CON POSICIONES VACIAS PARA DETERMINAR EL PRONOSTICO DE LA PERSONA
        //SIGUIENTE: DEVOLVER (RETURN) "PRONOSTICO SELECCIONADO"

    }

}
