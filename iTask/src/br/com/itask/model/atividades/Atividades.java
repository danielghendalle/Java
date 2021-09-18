package br.com.itask.model.atividades;

public class Atividades {
    protected int id;
    protected String nome;
    protected double nota; 
    
    public void conclusao(double nota){
        this.nota = nota;
    }
    
    public void conclusao(){
        this.nota = 0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    } 

   @Override
    public String toString() {
	return "ID: " + this.id + ", Nome: " + this.nome 
                + ", Nota: " + this.nota;
    }
}

