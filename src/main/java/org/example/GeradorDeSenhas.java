package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class GeradorDeSenhas {

    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private SecureRandom random = new SecureRandom();

    public String gerarSenha(int tamanho, boolean incluirMinusculas, boolean incluirMaiusculas,
                             boolean incluirNumeros, boolean incluirSimbolos) {

        if (!incluirMinusculas && !incluirMaiusculas && !incluirNumeros && !incluirSimbolos) {
            throw new IllegalArgumentException("Pelo menos uma categoria de caracteres deve ser selecionada.");
        }

        StringBuilder caracteresPermitidos = new StringBuilder();

        if (incluirMinusculas) {
            caracteresPermitidos.append(MINUSCULAS);
        }
        if (incluirMaiusculas) {
            caracteresPermitidos.append(MAIUSCULAS);
        }
        if (incluirNumeros) {
            caracteresPermitidos.append(NUMEROS);
        }
        if (incluirSimbolos) {
            caracteresPermitidos.append(SIMBOLOS);
        }

        List<Character> senha = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            senha.add(caracteresPermitidos.charAt(index));
        }

        StringBuilder resultado = new StringBuilder(senha.size());
        for (Character c : senha) {
            resultado.append(c);
        }

        return resultado.toString();
    }
}