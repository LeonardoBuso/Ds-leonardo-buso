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

public class Conexao 
{
    public static void Conectabanco()
    {
        String url = "jdbc:mysql://localhost:3306/ConectaBanco";
        String usuario = "root";
        String senha = "";
       
        try {
            // Carrega o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conecta ao banco
            Connection conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ConectaBanco", usuario , senha
            );

            System.out.println("Conexao realizada com sucesso!");
            conexao.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
    
}
