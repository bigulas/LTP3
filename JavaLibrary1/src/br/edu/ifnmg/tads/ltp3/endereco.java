/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class endereco {
    public int Id;
    public String Rua;
    public int Num;
    public String Compl;
    public String Bairro;
    public int Cep;
    public String Cidade;
    public String Estado;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getCompl() {
        return Compl;
    }

    public void setCompl(String Compl) {
        this.Compl = Compl;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "endereco{" + "Id=" + Id + ", Rua=" + Rua + ", Num=" + Num + ", Compl=" + Compl + ", Bairro=" + Bairro + ", Cep=" + Cep + ", Cidade=" + Cidade + ", Estado=" + Estado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.Id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final endereco other = (endereco) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
}
