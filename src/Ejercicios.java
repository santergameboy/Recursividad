public class Ejercicios {
    //Recursividad Clase 1
    /*public static int factorial(int n){
        int factorial;
        if (n==1){
            factorial=n;
        }else {
            factorial = n * factorial(n-1);
        }

        return factorial;
    }
    */
    /*Maximo Comun Divisor mcd con algoritmo de Euclides Clase 2
    a=412 ; b=184;
     */
    /*public static int mcd(int a , int b){
        int mcd;
        if (a==b){
        mcd= b;

        }else {
            if (a>b){
                a = a-b;
            }else {
                b= b-a;
            }
            mcd = mcd(a, b);
        }
        return mcd;
    }
    */
    //SUMA DE ELEMENTOS DE UN VECTOR
   /*public static int sumavector(int[]vector,int indice){
        int suma;
        if(indice==vector.length -1){
            suma = vector[indice];
        }else{
            suma = vector[indice]+sumavector(vector,indice+1);

        }
        return suma;
    }*/
   // invertir caracteres con recursividad
    public static void main(String[] args) {

        String palabra = "EJEMPLO gaa";
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
