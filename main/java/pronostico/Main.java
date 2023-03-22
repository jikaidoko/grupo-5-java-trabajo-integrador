package pronostico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Partido;
import modelo.Ronda;
import modelo.Pronostico;
import modelo.Equipo;
public class Main {
 
    public static void main(String[] args) {
    String partidoArchivo = "ronda.csv";
    String separador = ",";
    ArrayList<Partido> partidos = new ArrayList<>();
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    
    try {
        fileReader = new FileReader(partidoArchivo);
        bufferedReader = new BufferedReader(fileReader);
        String renglon;
    
    while ((renglon = bufferedReader.readLine()) != null) {
        String[] partidoArray = renglon.split(separador);
        partidos.add(new Partido((partidoArray[0]),Integer.valueOf (partidoArray[1]),
        Integer.valueOf (partidoArray[2]),(partidoArray[3]));
     }
    }
    catch ( FileNotFoundException e ) {
      System.out.println( "Archivo inexistente."
                        + "\nEl programa se cancela." );
    }

    catch ( IOException e ) {
      System.out.println( "Error en el uso o cierre del archivo"
                        + "\nEl programa se cancela." );
    }

    catch ( Exception e ) {
      System.out.println( "Error."
                        + "\nEl programa se cancela." );
    }
}
}


    
    /*            
    int resultadoPartido = 0;
    
    switch (resultadoPartido){
        case golesEquipo1>golesEquipo2: resultadoPartido=1;
        System.out.println(equipo1 + " ganó, " + equipo2 + " perdió."; break;
        case golesEquipo1<golesEquipo2;resultadoPartido=2;
        System.out.println(equipo2 + " ganó, " + equipo1 + " perdió."; break;
        case golesEquipo1=golesEquipo2;resultadoPartido=0;
        System.out.println(equipo1 + " y " + equipo2 + " empataron"; break;
                
    }*/

