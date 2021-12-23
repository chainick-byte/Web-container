package com.emptyWeb.context.buissnes.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
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

@Embeddable
@Entity
@Table(name = "PROVINCIAS")
public class Provincia {

  @Id
  private Long id_prov;

  @Column(name = "NOM_PROVINCIA")
  private String nombre_prov;

  @Column(name = "CREACION_PROVINCIA")
  @Temporal(TemporalType.DATE)
  private Date fecha_creacion;

  @Column(name = "MODIFICACION_PROVINCIA")
  @Temporal(TemporalType.DATE)
  private Date fecha_modificacion;

  @Column(name = "USER_PROV_CREATE")
  private String usuario_creacion;

  @Column(name = "USER_PROV_MODIF")
  private String usuario_modificacion;

  @Column(name = "PROV_ESTADO_REGISTRO")
  private int estado_registro;

  @Embedded
  private Municipio provincia;

  public Provincia() {
  }

  public Long getId_prov() {
    return id_prov;
  }

  public void setId_prov(Long id_prov) {
    this.id_prov = id_prov;
  }

  public String getNombre_prov() {
    return nombre_prov;
  }

  public void setNombre_prov(String nombre_prov) {
    this.nombre_prov = nombre_prov;
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

  public Municipio getProvincia() {
    return provincia;
  }

  public void setProvincia(Municipio provincia) {
    this.provincia = provincia;
  }

}
