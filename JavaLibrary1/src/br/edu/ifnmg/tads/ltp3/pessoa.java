/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class pessoa {
    private int id;
    private String nome;
    private List<email> emails;
    private List<endereco> enderecos;
    private List<telefone> telefones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final pessoa other = (pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public void setNome(String pnome) throws Exception {
        if(pnome.length()>3 && pnome.length()<250 ){
        nome=pnome;
    }
    
    throw new Exception("Não pode haver nomes com menos de 3 letras"
            + "e mais de 250 letras");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }

    public List<email> getEmails() {
        return emails;
    }

    public void setEmails(List<email> emails) {
        this.emails = emails;
    }

    public List<endereco> getEndecos() {
        return enderecos;
    }

    public void setEndecos(List<endereco> endecos) {
        this.enderecos = endecos;
    }

    public List<telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void addEmail(email obj){
        if(!emails.contains(obj)){
        emails.add(obj);
        }        
    }
    public void removeEmail(email obj){
        if(emails.contains(obj)){
            emails.remove(obj);
        }
    }
    public void addEndereco(endereco obj){
        if(!enderecos.contains(obj)){
        enderecos.add(obj);
        }        
    }
    public void removeEndereco(endereco obj){
        if(enderecos.contains(obj)){
            enderecos.remove(obj);
        }
    }
    public void addTelefone(telefone obj){
        if(!telefones.contains(obj)){
        telefones.add(obj);
        }        
    }
    public void removeTelefone(telefone obj){
        if(telefones.contains(obj)){
            telefones.remove(obj);
        }
    }
}