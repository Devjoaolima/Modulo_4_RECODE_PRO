package model;
import java.util.Date;
 
public class Contato {
 
	private int id;
	private String nome;
	private String telefone;
	private Date dataCadastro;
 
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
 
	public String gettelefone() {
		return telefone;
	}
 
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
 
	public Date getDataCadastro() {
		return dataCadastro;
	}
 
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}