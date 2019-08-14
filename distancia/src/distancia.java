/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class distancia {
    public distancia(){
        
    }
    public double calcular(double x2, double x1, double y2, double y1){
        double d = 0.0;
        d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return d;
    }
    


}
