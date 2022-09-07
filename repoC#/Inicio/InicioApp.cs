using System.Collections;

class InicioApp
    {
    public static void Main()
    {
        int []jugadores = { 3, 4, 5 };
        double[] jugadoras = { 3.0, 4.5, 5 };
        char[] pulsaciones = { 'a', 'b', 'c' };
        double[] notas = new double[10];
        notas[0] = 5.5;
        jugadores[2] = 6;
        jugadoras[2] = 16;
        char []masPulsaciones = {'a', 'b', 'c' };
        ImprimirVectorCaracteres(masPulsaciones);
        Console.WriteLine(notas.Length);
        Console.WriteLine("La primera nota es: " + notas[0]);
    }
    /**@function es un metodo que nos imprime por consola un vector de caracteres
     * @params vector de caracteres que queremos imprimir
     * @return no hay, es un metodo void
     */
    public static void ImprimirVectorCaracteres(char []vector)
    {
        String cadena = "";
        foreach (char element in vector)
            cadena += element;
        Console.WriteLine(cadena);
    }
    /**
     * @Funcionalidad -> rellenar una lista de 10 numeros leidos por teclado
     * @params vacio
     * @return el contenido de la lista
     */
    public static ArrayList SumaLista()
    {
        ArrayList listas = new ArrayList();
        int contador = 0;
        while (contador<10)
        {
            listas.Add(Console.Read());
            if (listas[contador]==0)
            {

            }
            contador++;
        }
        return listas;
    }
}