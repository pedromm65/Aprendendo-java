public class TestaCondicional {
    public static void main(String[] args) {
        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Voce tem mais de 18 anos");
        } else if (quantidadePessoas >= 2){
            System.out.println("Voce não tem 18 mas pode entrar");
        } else {
            System.out.println("Voce não pode entrar");  
        }
    }
}
