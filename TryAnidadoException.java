public class TryAnidadoException
{
    public static void main( String args[] )
    {
        try{
            int c = args.length; //número de argumentos: linea de comandos 
            int a = 10 / c; //error si no. de argumentos = 0; 
            System.out.println( "valor de a = " + a );
            try {
                if (c == 1)
                    a = a / (c-1);
                if (c == 2){
                    int[]b = {100, 5}; //el array contiene dos elementos 
                    b[3] = 0; //fuera de límites
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Segunda excepcion. Indice fuera de limites ==> " + e);
            }
            catch( Exception e){
                System.out.println("Excepcion GENERICA... " + e);
            }
        }
        catch(ArithmeticException e ){
            System.out.println("Primera excepcion. División por cero:: " + e);
        }
    } // fin de main
} // fin de TryAnidadoException
