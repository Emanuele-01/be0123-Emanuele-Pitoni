package emanuele.w3d2.entities;

import java.util.Date;

import emanuele.w3d2.designPatterns.AdapterUser;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Info extends AdapterUser{
	
	 private String nome; 
	 private String cognome; 
	 private Date dataDiNascita; 
	 public String getNome() { 
		 return nome;
		 } 
	 
	 
	 public void setNome(String nome) { 
		 this.nome = nome;
		 } 
	 
	 
	 public String getCognome() { 
		 return cognome;
		 } 
	 
	 
	 public void setCognome(String cognome) { 
		 this. cognome = cognome;
		 } 
	 
	 
	 public Date getDataDiNascita() { 
		 return dataDiNascita;
		 } 
	 
	 
	 public void DataDiNascita (Date dataDiNascita) { 
		 this. dataDiNascita = dataDiNascita;
		 }
}
