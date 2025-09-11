class ExcepcionCapturada
{
    public static void main( String args[] )
    {
        int a, b; 
        try
        { //controla el código peligroso
            a = 0;
            b = 10/a;
            System.out.println( "Esto ya no se imprime" );
        }
        catch (ArithmeticException objetoExcep)
        {
            System.out.println( "División por cero" + objetoExcep );
        }
        System.out.println( "Continua el programa ..." );
    }
}
