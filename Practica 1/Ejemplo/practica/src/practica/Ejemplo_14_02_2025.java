package practica;

public class Ejemplo_14_02_2025 {

    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        
        //Llamamos al metodo
        //miMetodo();
        
        //Llamamos a la funcion
        //String valorDeFuncion = miFuncion();
        //System.out.println("Mi funcion me retorno esto: " + valorDeFuncion);
        
        //Llamamos al metodo con argumentos
        //Llamamos al metodo con argumentos en forma de valor
        //miMetodoConArgumentos( 5 , 10 );
        //Llmamos al metodo cona rgumentos por referencia
        //int numero1 = 20;
        //int numero2 = 43;
        //miMetodoConArgumentos( numero1 , numero2 );
        
        
       //Llamamos a la funcion con argumentos
       //int suma = miFuncionSuma(10,20);
       //System.out.println("La suma es: "+ suma);
       
       //Llamamos nuestra funcion de diferentes formas
       int resultado = operacionesAritmeticas(20,10,'+');
        System.out.println("La suma es: " + resultado);
        
        System.out.println("La resta es: " + operacionesAritmeticas(10,5,'-'));
        
        int num1 = 50;
        int num2 = 20;
        char signo = '*';
        System.out.println("La multiplicacion es: " + operacionesAritmeticas(num1 ,num2 , signo));
        
        //operacionesAritmeticas(20,10,'G');
        int resultado2 = operacionesAritmeticas(20,10,'G');
        System.out.println("resultado2: "+resultado2);
    }
    
    //Metodo
    public static void miMetodo(){
        System.out.println("Este es un metodo");
        int num1 = 2;
        int num2 = 4;
        int resultado = num1 * num2;
        System.out.println("miMetodo obtuvo esto: "+ resultado);
    }
    
    //Funcion
    public static String miFuncion(){
        //Para que una funcion devuelva algo, se agrega la sentencia "return" seguido del valor que se quiere enviar
        return "Valor";
    }
    
    //Metodos con argumentos
    public static void miMetodoConArgumentos(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println("miMetodoConArgumentos sumo: " + resultado);
    }
    
    //Funciones con argumentos
    public static int miFuncionSuma(int num1, int num2){
        int resultado = num1+num2;
        //Retornamos el valor resultado
        return resultado;        
    }
    
    //Se necista crear una funcion que devuelva suma, resta, o multiplicacion dependiendo el signo que se envie
    public static int operacionesAritmeticas(int num1, int num2, char signo){
        switch(signo){
            case '+':
                return (num1 + num2);
            case '-':
                return (num1 - num2);
            case '*':
                return (num1 * num2);
            default:
                    System.out.println("El simbolo es incorrecto");
        }
        return -1000;
    }
    
}
