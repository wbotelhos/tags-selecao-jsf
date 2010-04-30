package com.wbotelhos.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

/**
 * @author Washington Botelho dos Santos
 * @artigo http://wbotelhos.com/2009/07/24/tags-de-selecao-com-jsf
 */

public class Bean {

	private boolean ativo;
	private String[] materias;
	private Map<String, Object> materiasItems;
	private String sexo;
	private SelectItem femininoItem;
	private int ano;
	private Collection<SelectItem> anosItems;
	private String[] diasSemana;

	private SelectItem[] diasSemanaItems = {
			new SelectItem("Domingo"), new SelectItem("Segunda"),
			new SelectItem("Terça"), new SelectItem("Quarta"),
			new SelectItem("Quinta"), new SelectItem("Sexta"), new SelectItem("Sábado")
	};

	private String aprovado;
	private SelectItem[] aprovadoItems = {
			new SelectItem("Sim"), new SelectItem("Não"), new SelectItem("Em andamento")
	};

	private String[] requisitos;
	private SelectItem[] requisitosItems = {
			new SelectItem("1º Grau"), new SelectItem("2º Grau"),
			new SelectItem("Bacharelado"), new SelectItem("Pós Graduação"),
			new SelectItem("Mestrado"), new SelectItem("Doutorado")
	};
	
	private SelectItem[] javaItems = {
			new SelectItem("Java SE"), new SelectItem("Java EE"), new SelectItem("JSP")
	};

	private SelectItem[] conhecimentosItems = {
			new SelectItem("JSF"), new SelectItem("Hibernate"),
			new SelectItem("EJB"), new SelectItem("Facelets")
	};
	
	private SelectItemGroup javaGroup = new SelectItemGroup("Java", "Linguagens Java", true, javaItems);
	private SelectItemGroup requisitosGroup = new SelectItemGroup("Requisitos",	"Conhecimentos", true, requisitosItems);
	
	private String[] curriculo;
	private SelectItem[] curriculoItems = { javaGroup, requisitosGroup };

	public Bean() { // "public" se faz necessário.
		femininoItem = new SelectItem("F", "Feminino");

		anosItems = new ArrayList<SelectItem>();
		for (int i = 1990; i <= 2000; i++) {
			anosItems.add(new SelectItem(i));
		}

		materiasItems = new LinkedHashMap<String, Object>();
		materiasItems.put("Português", "pt");
		materiasItems.put("Inglês", "en");
		materiasItems.put("Espanhol", "es");
		materiasItems.put("Italiano", "it");
	}

	/*** CONCATENADOS ***/
	public String getMateriasDisplay() {
		return concatenar(materias);
	}

	public String getDiasSemanaDisplay() {
		return concatenar(diasSemana);
	}

	public String getRequisitosDisplay() {
		return concatenar(requisitos);
	}

	public String getCurriculoDisplay() {
		return concatenar(curriculo);
	}

	/*** MÉTODOS ***/
	private String concatenar(Object[] vetor) {
		if (vetor == null) {
			return "";
		}

		StringBuilder builder = new StringBuilder();

		for (Object item : vetor) {
			if (builder.length() > 0) {
				builder.append(", ");
			}
			builder.append(item.toString());
		}

		return builder.toString();
	}

	/*** GETTERS AND SETTERS ***/
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Collection<SelectItem> getAnosItems() {
		return anosItems;
	}

	public void setAnosItems(Collection<SelectItem> anosItems) {
		this.anosItems = anosItems;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String[] getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(String[] diasSemana) {
		this.diasSemana = diasSemana;
	}

	public SelectItem[] getDiasSemanaItems() {
		return diasSemanaItems;
	}

	public void setDiasSemanaItems(SelectItem[] diasSemanaItems) {
		this.diasSemanaItems = diasSemanaItems;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public Map<String, Object> getMateriasItems() {
		return materiasItems;
	}

	public void setMateriasItems(Map<String, Object> materiasItems) {
		this.materiasItems = materiasItems;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public SelectItem getFemininoItem() {
		return femininoItem;
	}

	public void setFemininoItem(SelectItem femininoItem) {
		this.femininoItem = femininoItem;
	}

	public String getAprovado() {
		return aprovado;
	}

	public void setAprovado(String aprovado) {
		this.aprovado = aprovado;
	}

	public SelectItem[] getAprovadoItems() {
		return aprovadoItems;
	}

	public void setAprovadoItems(SelectItem[] aprovadoItems) {
		this.aprovadoItems = aprovadoItems;
	}

	public String[] getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String[] requisitos) {
		this.requisitos = requisitos;
	}

	public SelectItem[] getRequisitosItems() {
		return requisitosItems;
	}

	public void setRequisitosItems(SelectItem[] requisitosItems) {
		this.requisitosItems = requisitosItems;
	}

	public SelectItem[] getConhecimentosItems() {
		return conhecimentosItems;
	}

	public void setConhecimentosItems(SelectItem[] conhecimentosItems) {
		this.conhecimentosItems = conhecimentosItems;
	}

	public SelectItem[] getJavaItems() {
		return javaItems;
	}

	public void setJavaItems(SelectItem[] javaItems) {
		this.javaItems = javaItems;
	}

	public String[] getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String[] curriculo) {
		this.curriculo = curriculo;
	}

	public SelectItem[] getCurriculoItems() {
		return curriculoItems;
	}

	public void setCurriculoItems(SelectItem[] curriculoItems) {
		this.curriculoItems = curriculoItems;
	}

}