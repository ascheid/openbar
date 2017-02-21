package br.com.scheid.mbean;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.scheid.model.Configuracoes;

@ManagedBean
@SessionScoped
public class ApplicationMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Configuracoes configuracoes;
	public Locale locale;

	
	
	


	public Configuracoes getConfiguracoes() {
		return configuracoes;
	}

	public void setConfiguracoes(Configuracoes configuracoes) {
		this.configuracoes = configuracoes;
	}

	public Locale getLocale() {
		return locale;
	}

	public String init(){
		return "config?faces-redirect=true";
	}
	
	public void alterarIdioma(){
		this.locale = new Locale(this.configuracoes.getLingua());
	}


	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	

}
