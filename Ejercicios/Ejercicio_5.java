
package com.mycompany.proyecto1;

import javax.swing.JOptionPane;


public class Ejercicio_5 {
    double auxilio=80000;
    public void mostar( int salario, int comisiones, int prestamo)
    {
    JOptionPane.showMessageDialog(null,"El salario es: "+salario);
        JOptionPane.showMessageDialog(null,"la comision es: "+comisiones);
        JOptionPane.showMessageDialog(null,"el prestamo es: "+prestamo);
        
    }
    public int calculo( int salar,int comi, int presta ){
        
      
            int salarioNeto=(int) ((int) ((salar+comi)-presta)+auxilio);
        return salarioNeto;
    }

    
    public static void main(String[] args) {
        Ejercicio_5 var=new Ejercicio_5();
        int salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));
        int comision=Integer.parseInt(JOptionPane.showInputDialog("Ingrese comisiones"));
        int pres=Integer.parseInt(JOptionPane.showInputDialog("Ingrese prestamos"));
        var.mostar( salario,comision,pres);
        var.calculo(salario, comision, pres);
        JOptionPane.showMessageDialog(null,"el salario neto es: "+var.calculo(salario, comision, pres));
    }
    
}
