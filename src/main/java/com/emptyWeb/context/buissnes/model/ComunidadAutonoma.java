package com.emptyWeb.context.buissnes.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Claudia Badila
 */
@Entity
@Table(name = "COMUNIDADES_AUTONOMAS")
public class ComunidadAutonoma {

  @Id
  private Long id_ccaa;

  @Column(name = "NOMBRE")
  private String nombre_ccaa;

  @Column(name = "F_CREACION")
  @Temporal(TemporalType.DATE)
  private Date fecha_creacion;

  @Column(name = "F_MODIFICACION")
  @Temporal(TemporalType.DATE)
  private Date fecha_modificacion;
  private String usuario_creacion;
  private String usuario_modificacion;
  private int estado_registro;

  @Embedded
  private Provincia provincia;

  public ComunidadAutonoma() {
  }

  public Long getId_ccaa() {
    return id_ccaa;
  }

  public void setId_ccaa(Long id_ccaa) {
    this.id_ccaa = id_ccaa;
  }

  public String getNombre_ccaa() {
    return nombre_ccaa;
  }

  public void setNombre_ccaa(String nombre_ccaa) {
    this.nombre_ccaa = nombre_ccaa;
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

  public Provincia getProvincia() {
    return provincia;
  }

  public void setProvincia(Provincia provincia) {
    this.provincia = provincia;
  }

}
