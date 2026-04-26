package javapoo.training.test;

import javapoo.training.domain.estudante;

public class estudanteTest {
    public static void main(String[] args) {
        estudante estudante = new estudante();
        estudante.nome = "Pedro";
        estudante.idade = 23;
        estudante.sexo = 'M';
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);




    }
}
