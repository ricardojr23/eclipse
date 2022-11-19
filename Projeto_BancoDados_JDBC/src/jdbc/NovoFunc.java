package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovoFunc {

	public static void main(String[] args) throws SQLException {
		try {
			String codigo = null;
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe o nome: ");
			String nome = entrada.nextLine();

			System.out.print("Informe o cargo: ");
			String cargo = entrada.nextLine();

			System.out.print("Informe o endereco: ");
			String endereco = entrada.nextLine();

			Connection conexao = FabricaConexao.getConexao();
			String sql = "INSERT INTO func (nome,cargo,endereco) VALUES (?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, cargo);
			stmt.setString(3, endereco);
			stmt.execute();

			System.out.println("Funcionario cadastrado com sucesso!");

			entrada.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
