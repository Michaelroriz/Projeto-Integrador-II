package database;

//import static database.ConexaoDB.ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Para a conexão temos uma classe que faz a função de fábrica de conexões.
 * Obeserve que para outros bancos de dados você deve alterar a fábrica, essa só
 * tem a parte do MySql.
 */
public class Conexao {

    // Configura essas variáveis de acordo com o seu banco  
    private static final String URL = "jdbc:mysql://localhost/DBagendamento",
            NOME = "root", SENHA = "1234";

    public static Connection con;
    public static Statement comando;

    public static final int MYSQL = 0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";

    public static Connection abreConexao(String url, String nome, String senha,
            int banco) throws ClassNotFoundException, SQLException {

        switch (banco) {
            case MYSQL:
                Class.forName(MySQLDriver);
                break;
        }
        return DriverManager.getConnection(url, nome, senha);
    }

    public static void main(String[] args) {
        conectar();
    }

    public static void conectar() {
        try {
            con = abreConexao(URL, NOME, SENHA, Conexao.MYSQL);
            comando = con.createStatement();
            JOptionPane.showMessageDialog(null,"Conectado ao Banco de Dados");
            } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao realizar consulta ao Banco de Dados");
            imprimeErro("Erro ao carregar o driver", e.getMessage());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fechar() {
        try {
            comando.close();
            con.close();
            System.out.println("Conexão Fechada");
        } catch (SQLException e) {
            imprimeErro("Erro ao fechar conexão", e.getMessage());
        }
    }

    public static void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
       
    }

}
