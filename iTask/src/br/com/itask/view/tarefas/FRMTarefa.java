
package br.com.itask.view.tarefas;

import br.com.itask.model.tarefas.Tarefa;

public class FRMTarefa {
    
   public void cadastrar(){
     Tarefa tarefa = new Tarefa();
     tarefa.setNome("Daniel");
     tarefa.setDataEntrega("12/09/2021");
     tarefa.setDescricao("Bla");
     tarefa.conclusao(10 ,5);
     
     tarefa.cadastrar();
   

  
    }
}