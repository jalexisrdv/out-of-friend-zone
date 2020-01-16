package models;

public class RandomPosition {
    
    /**
        @param limit limite donde se dibujara el boton.
        @param sizeButton tamaño del boton, ancho o alto.
        @return la posicion sin salir del limite establecido.
     **/
    public int getRandomPosition(int limit, int sizeButton) {
        int p = (int) Math.abs((Math.random() * limit - sizeButton));
        return p;
    }

}
