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
public class Punto {

    private float x;
    private float y;

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public Punto (float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto (){
        this.x =4;
        this.y =5;
    }
     
}
