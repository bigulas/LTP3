/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

/**
 *
 * @author aluno
 */
public class telefone {
    public int Id;
    public int Ddd;
    public int Numero;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDdd() {
        return Ddd;
    }

    public void setDdd(int Ddd) {
        this.Ddd = Ddd;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "telefone{" + "Id=" + Id + ", Ddd=" + Ddd + ", Numero=" + Numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.Id;
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
        final telefone other = (telefone) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
    
}
