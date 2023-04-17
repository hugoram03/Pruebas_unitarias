/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricad;

/**
 *
 * @author Alumno
 */
public class Empleat {
    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException{
        double salariBase = 0;
        double salariBrut = 0;
        if (tipusEmpleat.equalsIgnoreCase("vendedor")) {
            salariBase = 1000;
        }
        if (tipusEmpleat.equalsIgnoreCase("encarregat")) {
            salariBase = 1500;
        }
        if (vendesMes > 2500) {
            salariBase += 200;
        }
        if (vendesMes >= 1000) {
            salariBase += 100;
        }
        horesExtra *= 18.57;
        salariBrut = horesExtra + salariBase;
        if (tipusEmpleat == null || !(tipusEmpleat.equalsIgnoreCase("vendedor") && tipusEmpleat.equalsIgnoreCase("encarregat"))) {
            throw new MaException("el tipus de vendedor no es correcte");
        }
        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("el valor no pot ser negatiu");
        }
        
        return salariBrut;
        
    }
    
    public double calculaSalariNet(double salariBrut) throws MaException{
        
        if (salariBrut >= 1000 && salariBrut <= 1500) {
            salariBrut *= 0.16;
        }
        if (salariBrut >= 1501) {
            salariBrut *= 0.2;
        }
        
        if (salariBrut < 0) {
            throw new MaException("El salario bruto no puede ser negativo");
        }
        
        return salariBrut;
        
    }
    
    
}
