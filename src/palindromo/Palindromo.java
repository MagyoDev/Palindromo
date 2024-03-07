package palindromo;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String entradaNormal = "";
        String entradaInversa = "";
        
        System.out.println("Digite uma palavra: ");
        entradaNormal = obj.nextLine();
        
        //inverte
        for(int i = entradaNormal.length() -1; i>=0; --i){
            entradaInversa += entradaNormal.charAt(i);
        }
        
        //Compara
        if (entradaNormal.equalsIgnoreCase(entradaInversa)){
            System.out.println("Palíndromo");
    }else {
            System.out.println("Não é Palíndromo");
        }
    }
}
