
import java.util.Scanner;
import javax.swing.JOptionPane;

//CREAR UN PROGRAMA QUE DETERMINE EL SALARIO FINAL DE UN TRABAJADOR
//SI ES PROGRAMADOR SE AGREGA UN 25% AL SALARIO TOTAL 
//SI ES MEDICO SE AGREGA $100 AL SALARIO TOTAL
//SI ES ADMINISTRADOR SE AGREGA 2% DEL SALARIO TOTAL
//SI TIENE MULTA SE DDESCUENTA $15 AL SALARIO FINAL
//EL PROGRAMA DEBE RECIBIR EL NOMBRE Y EL SALARIO DEL TRABAJADOR

public class main {


    public static void main(String[] args){

        String NOMBRE; 
        double SALARIO=600
        int opcion; 

        Scanner entrada =new Scanner(System,in);

        System.out.println("#####################");
        System.out.println("1. Es Programador");
        System.out.println("2. Es Medico");
        System.out.println("3. Es Administrador\n");
        System.out.println("Ingrese una opcion ");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                SALARIO = SALARIO +(SALARIO*0.25)
                
            
            case 2:


            case 3:
            
        }
    JOptionPane.showMessageDialog(null, "El salario es:"+ 6 SALARIO);

    }
}