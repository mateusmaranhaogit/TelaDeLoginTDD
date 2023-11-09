package com.teladelogin;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe simples para autenticação de usuários, simulando um banco de dados de usuários.
 */
public class TelaDeLogin {

	/**
	 * Banco de dados simulado de usuários (nome de usuário, senha)
	 */
	private Map<String, String> userDatabase;

	/**
	 * Constrói uma nova instância da tela de login e inicializa o banco de dados de usuários.
	 */
	public TelaDeLogin() {
		userDatabase = new HashMap<>();
		userDatabase.put("mateus", "mateus123");
		userDatabase.put("lucas", "lucas321");
	}

	/**
	 * Tenta autenticar o usuário com base em seu nome de usuário e senha.
	 * 
	 * @param username O nome de usuário do usuário que está tentando fazer login.
	 * @param password A senha digitada pelo usuário.
	 * @return {@code true} se a autenticação for bem-sucedida, {@code false} caso contrário
	 */
	public boolean login(String username, String password) {
		// Verifica se o nome de usuário inserido existe no banco de dados
		if (!userDatabase.containsKey(username)) {
			return false; // Autenticação falhou
		}

		// Verifica se a senha inserida corresponde à senha no banco de dados
		String storedPassword = userDatabase.get(username);
		if (!storedPassword.equals(password)) {
			return false; // Autenticação falhou
		}

		return true; // Autenticação bem-sucedida
	}

	/**
	 * Adiciona um novo usuário ao banco de dados de usuários.
	 * 
	 * @param username O nome de usuário do novo usuário.
	 * @param password A senha do novo usuário.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}
