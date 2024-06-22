public class Operadores {
    public static void main(String[] args) throws Exception {
      
        //Operador ternário
        // ? <Expressão Condicional> ? <Caso condição seja true>
        // : <caso condição seja false>
        //Exemplo:

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a==b){
            resultado = "verdadeiro";
        }
        else{
            resultado = "falso";
        }

        System.out.println(resultado);

        //Forma utilizando Operador Ternário

        int c, d;
        c = 5;
        d = 6;

        String resultado2 = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado2);

    }
}
