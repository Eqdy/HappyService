package com.happyPaw.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Tusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Tusuario.findAll", query="SELECT t FROM Tusuario t")
public class Tusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDUSUARIO")
	private String idusuario;

	@Column(name="ACTIVO")
	private String activo;

	@Column(name="CONTRASENIA")
	private String contrasenia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FMODIFICACION")
	private Date fmodificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FREGISTRO")
	private Date fregistro;

	@Column(name="IDDISPOSITIVO")
	private String iddispositivo;

	@Column(name="IDTIPOUSUARIO")
	private int idtipousuario;

	@Column(name="MAIL")
	private String mail;

	@Column(name="USUARIO")
	private String usuario;

	public Tusuario() {
	}

	public String getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFmodificacion() {
		return this.fmodificacion;
	}

	public void setFmodificacion(Date fmodificacion) {
		this.fmodificacion = fmodificacion;
	}

	public Date getFregistro() {
		return this.fregistro;
	}

	public void setFregistro(Date fregistro) {
		this.fregistro = fregistro;
	}

	public String getIddispositivo() {
		return this.iddispositivo;
	}

	public void setIddispositivo(String iddispositivo) {
		this.iddispositivo = iddispositivo;
	}

	public int getIdtipousuario() {
		return this.idtipousuario;
	}

	public void setIdtipousuario(int idtipousuario) {
		this.idtipousuario = idtipousuario;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}