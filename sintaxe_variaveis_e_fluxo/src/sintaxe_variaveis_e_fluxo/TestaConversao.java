package sintaxe_variaveis_e_fluxo;

public class TestaConversao{

    public static void main(String[] args){

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
        
        //colocar f para indicar float
        float pontoFlutuante = 3.14f;
        
        //colocar l para indicar long, maior que int
        long numeroGrande = 20000000000l;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}