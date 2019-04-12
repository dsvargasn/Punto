/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiantes
 */
public class Punto2D extends Punto{
    
    public Punto2D (){
        super();
    }
    
    public float calcularDistancia(Punto2D p) {
        float distancia = 0;
        distancia = (float) Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2));
        return distancia;
    }
    
    public float calcularDistancia() {
        float distancia = 0;
        distancia = (float) Math.sqrt(Math.pow((this.getX() - 0), 2) + Math.pow((this.getY() - 0), 2));
        return distancia;
    }
    
}
