package br.com.itask.data.tarefas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    private Connection con = null;              //Variável para conexao
    
    private String servidor = "localhost";      //Localização de servidor
    private String nomeDoBanco = "itask";    //Nome do banco de dados
    private String usuario = "postgres";            //Nome do usuário
    private String senha = "ghendalle01";          //Senha do usuário
    
    public Conexao(){}
    
    public Conexao(String pServidor, String pNomeDoBanco, String pUsuario, String pSenha){
        this.servidor = pServidor;
        this.nomeDoBanco = pNomeDoBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }

    public Connection conectar(){
        try {
            //Driver do sql
            Class.forName("org.postgresql.Driver");

            //local do banco, nome do banco, usuario e senha
            String url = "jdbc:postgresql://" + servidor + "/" + nomeDoBanco;
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));
        } catch (ClassNotFoundException e) {
            // Erro caso o driver JDBC não foi instalado
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro caso haja problemas para se conectar ao banco de dados
            e.printStackTrace();
        }
        return this.getCon();
        
    }

 
    public boolean fecharConexao(){
       try {
           this.getCon().close();
           return true;
       } catch(SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       return false;
    }
    
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}