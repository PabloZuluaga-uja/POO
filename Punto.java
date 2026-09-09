public class Punto {
    private int x, y;

    public Punto(){ // Metodo constructor de la clase Punto y va despues de los atributos
        this.setX(0);
        this.setY(0);
    }

    public double modulo(int x, int y){ // Metodo generico para calcular el modulo de un punto
        return 0;
    }

    public int getX(){ // Metodo para obtener el valor de x get=visualizar
        return this.x;
    }

    public int getY(){ // Metodo para obtener el valor de y get=visualizar
        return this.y;
    }

    public void setX(int x){ // Metodo para modificar el valor de x set=modificar
        this.x = x;
    }

    public void setY(int y){ // Metodo para modificar el valor de y set=modificar
        this.y = y;
    }

}