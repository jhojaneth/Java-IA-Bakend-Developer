import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //datos primitivos
        int edad;
        double salario;
        float promedio;
        char genero;
        boolean esMayor;
        //datos no primitivos
        String nombre;
            //entrada de datos por consola
          /* Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su salario: ");
        salario = entrada.nextDouble();
        System.out.println("Ingrese su promedio: ");
        promedio = entrada.nextFloat();
        //salida de datos por consola
        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu salario es: " + salario);
        System.out.println("Tu promedio es: " + promedio);*/
        //entrada de datos por ventana
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su promedio: "));
        //salida de datos por ventana
        JOptionPane.showMessageDialog(null, "Hola " + nombre +"\nTu edad es: " + edad + "\nTu salario es: " + salario + "\nTu promedio es: " + promedio);
       
        
    }
}
