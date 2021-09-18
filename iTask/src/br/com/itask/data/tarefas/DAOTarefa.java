package br.com.itask.data.tarefas;
import br.com.itask.model.tarefas.Tarefa;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DAOTarefa {
    public void cadastrar (Tarefa tarefa){
     Conexao conexao = new Conexao();
     
     Statement stm;
     try{
        conexao.conectar();
        
        String sql = "INSERT INTO Tarefa (nome, nota, dataEntrega,descricao) VALUES ("
                    + "'" + tarefa.getNome() + "'," 
                    + tarefa.getNota() + "," 
                    + "'" + tarefa.getDataEntrega() + "'," 
                    + "'" + tarefa.getDescricao() + "');";
                            //INSERT INTO Tarefa (nome , nota) Values ('Daniel',12
                             stm = conexao.getCon().createStatement();
                             stm.executeUpdate(sql);
     }
     catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Erro no Cadastro");
     }
     finally{
       conexao.fecharConexao();
     }
     
    }
}
