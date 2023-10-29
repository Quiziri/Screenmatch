package br.com.screenmatch.service;

// Cria uma Interface para Converter Dados de forma com que eu não saiba o tipo de dado.

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
