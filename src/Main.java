public class Main {
    //public static void main(String[] args) {
        //System.out.println(Ejercicios.mcd(412,184));
        //int[] vector = {2,4,2};
       // System.out.println(Ejercicios.sumavector(vector,0));
    //}
    public static void main(String[] args) {

        String palabra = "EJEMPLO";
        System.out.println(palabra);
        System.out.println(invertirPalabra(palabra, palabra.length() - 1));
    }
    public static String invertirPalabra(String palabra, int longitud) {
        if (longitud == 0) {
            return  palabra.charAt(longitud)+"";

        } else{
            return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud -1));
        }
    }

}
