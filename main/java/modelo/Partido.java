/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
//import com.opencsv.bean.CsvBindByPosition
        
/**
 *
 * @author 54113
 */
public class Partido {
    String equipo1;
    int golesEquipo1;
    int golesEquipo2;
    String equipo2;
int resultado;

    public Partido() {
    }

    public Partido(String equipo1, int golesEquipo1, int golesEquipo2, String equipo2) {
        this.equipo1 = equipo1;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.equipo2 = equipo2;
    }
//public class Partido {
   // @CsvBindByPosition(position = 0)
   // private String equipo1;
   //@CsvBindByPosition(position = 1)
   // private int golesEquipo1;
   // @CsvBindByPosition(position = 2)
   // private int golesEquipo2;
   // @CsvBindByPosition(position = 3)
   // private String equipo1;
 
    
    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }
    
    switch (resultado){
        case golesEquipo1>golesEquipo2=1; 
        
        System.out.println(equipo1 + " ganó, " + equipo2 + " perdió."; break;
        case golesEquipo1<golesEquipo2=2;
        System.out.println(equipo2 + " ganó, " + equipo1 + " perdió."; break;
        case golesEquipo1=golesEquipo2=0;
        System.out.println(equipo1 + " y " + equipo2 + " empataron"; break;
                
    }
}
