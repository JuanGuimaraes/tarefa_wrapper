package br.com.juan;

public class Main {
    public static void main(String[] args) {
        int numeroPrimitivo = 50;
        System.out.println(numeroPrimitivo);

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);
        System.out.println(numeroWrapper);
    }
}
