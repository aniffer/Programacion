/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc202.extraclase_2;
import javax.swing.JOptionPane;

/**
 *
 * @author Anifer
 */
public class Extraclase_2 {

    public static void main(String[] args) {
        String temp1=null;
    String temp2=null;
    String temp3=null;
    int years=0;  
    int working_hours=0;
    int pay=0;
    int salary=0;
    int bonus10=0;
    int bonus20=0;
    int total_salary=0;
    int tax_deductions=0;
    int new_salary1=0;
    int new_salary2=0;
    temp1=JOptionPane.showInputDialog("Ingrese sus años trabajados");
    temp2=JOptionPane.showInputDialog("Ingrese la canridad de horas por semana");
    temp3=JOptionPane.showInputDialog("Ingrese el precio que se le paga por hora");
    years=Integer.parseInt(temp1);
    working_hours=Integer.parseInt(temp2);    
    pay=Integer.parseInt(temp3);
    salary=(working_hours*pay)*4;
    System.out.println(salary);
    
    
    if (years>10){
    bonus20=(int) (salary*(0.10));
    System.out.println(bonus20);
    total_salary=salary+bonus20;
        if (total_salary>1000 && total_salary<2000){
            tax_deductions=(int) (total_salary*(0.10));
            new_salary1=total_salary-tax_deductions;
            JOptionPane.showMessageDialog(null,"El salario es de(-10%):  "+new_salary1);        
            JOptionPane.showMessageDialog(null,"El salario neto es de:  "+total_salary);
        }else if( total_salary>2000){
            tax_deductions=(int) (total_salary*(0.20));
            new_salary2=total_salary-tax_deductions;  
            JOptionPane.showMessageDialog(null,"El salario es de(-15%):  "+new_salary2);}
            JOptionPane.showMessageDialog(null,"El salario neto es de:  "+total_salary);
           
    }else{JOptionPane.showMessageDialog(null,"El salario es de:  "+salary);}
                
    }
}
