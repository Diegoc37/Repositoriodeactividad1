/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciop12;

public class Ejerciciop12 {

    public static void main(String[] args) {
    double horas_trabajadas,valor_hora;
    double retencion,porcentaje_retencion;
    double salario_bruto,salario_neto;
    valor_hora=5000;
    horas_trabajadas =48;
    salario_bruto = valor_hora*horas_trabajadas;
    retencion = salario_bruto*(12.5/100);
    salario_neto = salario_bruto - retencion;
    System.out.println("valor de hora trabajadas es "+ valor_hora);
    System.out.println("horas trabajadas "+ horas_trabajadas);        
    System.out.println("la retencion es de "+ retencion);
    System.out.println("salario bruto es "+ salario_bruto);
    System.out.println("salario neto es "+ salario_neto);
    }
    
}