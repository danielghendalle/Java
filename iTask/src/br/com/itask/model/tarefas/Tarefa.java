package br.com.itask.model.tarefas;
 
import br.com.itask.model.atividades.Atividades;
import br.com.itask.data.tarefas.Conexao;
import br.com.itask.data.tarefas.DAOTarefa;

public class Tarefa extends Atividades {
    private String dataEntrega;
    private String descricao;
    
    public void conclusao(double nota, double bonus){
        if (nota == 0)
            super.conclusao();
        else{
            nota = nota + bonus;
            super.conclusao(nota);
        }
    }
    public void cadastrar(){
    DAOTarefa daoTarefa = new DAOTarefa();
    daoTarefa.cadastrar(this);
    }
    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   @Override
    public String toString() {
	return  super.toString() + ", Data: " + this.dataEntrega 
                + ", Descrição: " + this.descricao;
    }

    
}
