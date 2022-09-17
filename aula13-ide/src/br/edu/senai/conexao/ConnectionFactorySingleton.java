package br.edu.senai.conexao;

public class ConnectionFactorySingleton {

	private static String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private static String usuario = "postgres";
	private static String senha = "postgres";
	private static Connection connection = null;

	private static Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Não foi possível abrir a conexão");
		}
		return con;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
			System.out.println("Conectado com sucesso !");
		}
		return connection;
	}
	
}
