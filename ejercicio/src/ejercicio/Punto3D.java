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
public class Punto3D extends Punto {
    
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public Punto3D (float x,float y,float z) {
        super(x,y);
        this.z = z;
    }
    
    public Punto3D (){
        super();
        this.z =0;
    }
    
    public float calcularDistancia(Punto3D p) {
        float distancia = 0;
        distancia = (float) Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2) + Math.pow((this.getZ() - getZ()), 2));
        return distancia;
    }
    
    public float calcularDistancia() {
        float distancia = 0;
        distancia = (float) Math.sqrt(Math.pow((this.getX() - 0), 2) + Math.pow((this.getY() - 0), 2) + Math.pow((this.getZ() - 0), 2));
        return distancia;
    }
    
}
