class MultiplesCatch
{
    public static void main( String args[] )
    {
        int a; 
        int b[];
        int c = args.length; // número de argumentos: línea de comandos.

        try {
            a = 10 / c; // error si no. de argumentos = 0 
            System.out.println( "valor de a = " + a );
            b = new int[5];
            for (int i=0; i<a; i++) { //si c = 1, se produce un error 
                b[i] = i;
                System.out.print( "\t" + i );
            }
        }
        catch (ArithmeticException e){
            System.out.println( "Primera excepción. División por cero:: " + e );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println( "Segunda excepción. Índice fuera de límites =>" + e );
        }
    }
}
