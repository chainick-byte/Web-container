package com.emptyWeb.context.utils;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Claudia Badila
 */
@Embeddable
@Entity
@Table(name = "MUNICIPIOS")
class Municipio {

  @Id
  private Long id_municipio;
    @Column(name = "NOM_MUNICIPIO")
  private String nombre_municipio;

  @Column(name = "CREACION_MUNICIPIO")
  @Temporal(TemporalType.DATE)
  private Date fecha_creacion;

  @Column(name = "MODIF_MUNICIPIO")
  @Temporal(TemporalType.DATE)
  private Date fecha_modificacion;

  @Column(name = "USER_MUN_CREATE")
  private String usuario_creacion;

  @Column(name = "USER_MUN_MODIF")
  private String usuario_modificacion;

  @Column(name = "MUN_ESTADO_REGISTRO")
  private int estado_registro;

  public Municipio() {
  }

  public Long getId_municipio() {
    return id_municipio;
  }

  public void setId_municipio(Long id_municipio) {
    this.id_municipio = id_municipio;
  }

  public String getNombre_municipio() {
    return nombre_municipio;
  }

  public void setNombre_municipio(String nombre_municipio) {
    this.nombre_municipio = nombre_municipio;
  }

  public Date getFecha_creacion() {
    return fecha_creacion;
  }

  public void setFecha_creacion(Date fecha_creacion) {
    this.fecha_creacion = fecha_creacion;
  }

  public Date getFecha_modificacion() {
    return fecha_modificacion;
  }

  public void setFecha_modificacion(Date fecha_modificacion) {
    this.fecha_modificacion = fecha_modificacion;
  }

  public String getUsuario_creacion() {
    return usuario_creacion;
  }

  public void setUsuario_creacion(String usuario_creacion) {
    this.usuario_creacion = usuario_creacion;
  }

  public String getUsuario_modificacion() {
    return usuario_modificacion;
  }

  public void setUsuario_modificacion(String usuario_modificacion) {
    this.usuario_modificacion = usuario_modificacion;
  }

  public int getEstado_registro() {
    return estado_registro;
  }

  public void setEstado_registro(int estado_registro) {
    this.estado_registro = estado_registro;
  }

}
