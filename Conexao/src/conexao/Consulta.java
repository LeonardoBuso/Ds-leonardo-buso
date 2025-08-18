/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

/**
 *
 * @author CAROLAR
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {

    public static void Consultar_Dados() {
        String url = "jdbc:mysql://localhost:3306/ConectaBanco";
        String usuario = "root";  // ou use variáveis: String usuario = ..., senha = ...
        String senha = "";

        try {
            // 1. Carregar driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Conectar ao banco
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✅ Conectado ao banco!");

            // 3. Consulta SQL
            String sql = "SELECT * FROM alunos";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // 4. Executar e exibir resultados
            ResultSet resultado = stmt.executeQuery();

            System.out.println("📋 Lista de alunos:");
            while (resultado.next()) {
                String nome_aluno = resultado.getString("nome_aluno");
                String codigo_aluno = resultado.getString("codigo_aluno");
                System.out.println("Nome: " + nome_aluno + " | Codigo Aluno " + codigo_aluno);
            }

            // 5. Fechar
            resultado.close();
            stmt.close();
            conexao.close();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ou consultar: " + e.getMessage());
        }
    }
}
