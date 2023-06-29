public class Main {

    public static void main(String[] args) {
        int[] arrayInteiros = {1,2,3,4,9,8,5,4,3,8,10};

    //Solução 1
        int soma = somar(arrayInteiros);
        System.out.println(soma);

    //Solução 2
        int maior = encontrarMaior(arrayInteiros);
        System.out.println(maior);

    //Solução 3
        int elemento = 5;

        System.out.println(isPresent(5, arrayInteiros));


    }

    private static boolean isPresent(int i, int[] arrayInteiros) {
        for(int x:arrayInteiros){
            if(x == i){
                return true;
            }
        }
        return false;
    }

    private static int encontrarMaior(int[] arrayInteiros) {
        int maior = 0;
        for(int x: arrayInteiros){
            if(x>maior){
                maior = x;
            }
        }
        return  maior;
    }


    public static int somar(int[] arraySoma){
        int soma = 0;
        for(int x:arraySoma ){
            soma += x;
        }
        return soma;
    }





}