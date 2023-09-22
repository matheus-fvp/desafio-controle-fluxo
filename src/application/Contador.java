package application;

import application.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o valor do parâmetro 1: ");
            int parametro1 = sc.nextInt();
            System.out.print("Informe o valor do parâmetro 2: ");
            int parametro2 = sc.nextInt();

            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 > parametro2) throw new ParametrosInvalidosException("Erro! O parametro 1 deve ser menor que o parametro 2");
        int contagem = parametro2 - parametro1;
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Numero: " + i);
        }
    }

}
