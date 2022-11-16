package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaFunc {

	public static void main(String[] args)throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS func ("
			
			+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
			+ "nome VARCHAR(80) NOT NULL,"
			+ "cargo VARCHAR(20) NOT NULL,"
			+"end VARCHAR(80) NOT NULL"
			+ ")";
		Sta
		
	
	}
}
