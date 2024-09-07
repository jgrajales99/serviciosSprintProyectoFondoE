package com.Fondo.Empleados.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Actualizacion")
public class Actualizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "Act_Id")
    private int id;

    @Column(name = "Act_Nombres")
    private String nombres;

    @Column(name = "Act_Apellidos")
    private String apellidos;

    @Column(name = "Act_Sexo")
    private String sexo;

    @Column(name = "Act_Documento")
    private String documento;

    @Column(name = "Act_FechaNacimiento")
    private String fechaNacimiento;

    @Column(name = "Act_Email")
    private String email;

    @Column(name = "Act_Direccion")
    private String direccion;

    @Column(name = "Act_Celular")
    private String celular;
    
    @Column(name = "Act_CelularAlternativo")
    private String celularAlternativo;

    @Column(name = "Act_CampoActualizado")
    private String campoActualizado;

    @Column(name = "Act_ValorAnterior")
    private String valorAnterior;

    @Column(name = "Act_ValorNuevo")
    private String valorNuevo;

    @Column(name = "Act_Fecha")
    private String fecha;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelularAlternativo() {
        return celularAlternativo;
    }

    public void setCelularAlternativo(String celularAlternativo) {
        this.celularAlternativo = celularAlternativo;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampoActualizado() {
        return campoActualizado;
    }

    public void setCampoActualizado(String campoActualizado) {
        this.campoActualizado = campoActualizado;
    }

    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getValorNuevo() {
        return valorNuevo;
    }

    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

