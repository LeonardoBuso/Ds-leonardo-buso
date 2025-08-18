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
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Inserir_Dados 
{
    public static void InserirAluno(String codigo_aluno,String nome_aluno){
        String url = "jdbc:mysql://localhost:3306/ConectaBanco";
        String usuario = "root";
        String senha = "";
        
        Conexao.Conectabanco();
     
     String sql = "Insert Into alunos (codigo_aluno, nome_aluno) Values (?,?)";
     
     try    (
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                PreparedStatement stmt  = conn.prepareStatement(sql)
             )
        {
             
             stmt.setString(1, "4444");
             stmt.setString(2,"Helena Viegas");
          
             stmt.executeUpdate();
             System.out.println("Dados inseridos com Sucesso");
             
             
        }catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());      
    }
    }
}
