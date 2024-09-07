package com.Fondo.Empleados.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reg_Id")
    private int id;

    @Column(name = "Reg_Nombres")
    private String nombres;

    @Column(name = "Reg_Apellidos")
    private String apellidos;

    @Column(name = "Reg_Sexo")
    private String sexo;

    @Column(name = "Reg_Documento")
    private String documento;

    @Column(name = "Reg_FechaNacimiento")
    private String fechaNacimiento;

    @Column(name = "Reg_Email")
    private String email;

    @Column(name = "Reg_Direccion")
    private String direccion;

    @Column(name = "Reg_Celular")
    private String celular;
    
    @Column(name = "Reg_CelularAlternativo")
    private String celularAlternativo;

    
    public String getCelularAlternativo() {
		return celularAlternativo;
	}

	public void setCelularAlternativo(String celularAlternativo) {
		this.celularAlternativo = celularAlternativo;
	}

	public Registro() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}


