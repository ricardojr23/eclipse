package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirFunc {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o código: ");

		int codigo = entrada.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM func WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setInt(1, codigo);
		int contador = stmt.executeUpdate();

		if (contador > 0) {
			System.out.println("Funcionario(a) excluido com sucesso!");

		} else {
			System.out.println("Nada feito, ERRO!");
		}

		System.out.println("Linhas afetadas: " + contador);

		conexao.close();
		entrada.close();

	}

}
