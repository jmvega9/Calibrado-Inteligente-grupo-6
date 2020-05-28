/*
 * Implemente un algoritmo que le permita ingresar los
Niveles de Automatizacion Industrial.
1. Los niveles de automatizacion Industrial
2. Administracion del Nivel de Campo
3. Administracion del Nivel de Control PLC
4. Administracion del Nivel de Supervision
5. Registro del Nivel MES
6. Registro del Nivel ERP
7. Imprimir Reportes
 */
package calibracioninteligentegrupo6;

/**
 *
 * @author Grupo 6
 * Taco Wiliam
 * Unda Erick
 * Vega Jessica
 * Yacelga Jose
 */
import java.util.Scanner;
public class CalibracionInteligenteGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner (System.in);
        System.out.println("Modelo computacional");
        System.out.println("Caso practico Robots en la Industria Automotriz");
        System.out.println("Calibracion Inteligente");

        System.out.println("1. Los niveles de Automatizacion Industrial: ");
        String nivel=objeto.nextLine();

        System.out.println("'1.1 Ingrese el significado de las siglas CNC");
        String siglas=objeto.nextLine();

        System.out.println("1.2 Para que esta diseñada la maquina CNC:");
        String diseño=objeto.nextLine();

        System.out.println("3. Administracion de Nivel de Control PLC");
        String control=objeto.nextLine();

        System.out.println("4. Administracion de Nivel de Supervision");
        String supervision=objeto.nextLine();

        System.out.println("5. Registro del Nivel MES");
        String mes=objeto.nextLine();

        System.out.println("6. Registro del Nivel ERP");
        String erp=objeto.nextLine();

        System.out.println("7. Imprimir Reportes");
        String reportes=objeto.nextLine();
        // TODO code application logic here
    }

}
