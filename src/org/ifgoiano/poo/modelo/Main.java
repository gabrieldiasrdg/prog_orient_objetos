package org.ifgoiano.poo.modelo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String meuNome = new String("Meu nome");
        modificaString(meuNome);
        System.out.println("---------------");
        System.out.println("ID de memória: " + System.identityHashCode(meuNome));
        System.out.println("Endereço Hex: " + Integer.toHexString(System.identityHashCode(meuNome)));

    }

    public static void modificaString(String minhaString) {
        System.out.println("ID de memória: " + System.identityHashCode(minhaString));
        System.out.println("Endereço Hex: " + Integer.toHexString(System.identityHashCode(minhaString)));
        System.out.println("======");
        minhaString = ("Minha String");
        System.out.println("ID de memória: " + System.identityHashCode(minhaString));
        System.out.println("Endereço Hex: " + Integer.toHexString(System.identityHashCode(minhaString)));
    }
}