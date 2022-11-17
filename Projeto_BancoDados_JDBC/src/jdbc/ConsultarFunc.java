package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarFunc {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM Func";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Func> func = new ArrayList<>();
		
		while(resultado.next()) {
			
		int codigo = resultado.getInt("codigo");
		String nome = resultado.getString("nome");
		String cargo = resultado.getString("cargo");
		String endereco = resultado.getString("endereco");
		
		func.add(new Func(codigo, nome, cargo, endereco));
		}
		
		for(Func p: func) {
		System.out.println(p.getCodigo() + " ==> " + p.getNome() + " ==> " + p.getCargo() + " ==> " + p.getEndereco());
		}
		
		
		stmt.close();
		conexao.close();	

	}
}


