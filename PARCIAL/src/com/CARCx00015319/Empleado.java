package com.CARCx00015319;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Empleado {

    protected String nombre;
    protected String puesto;
    protected List<Documentos> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        documentos = new ArrayList<Documentos>();
    }



    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documentos> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documentos d) {
        documentos.add(d);
    }


    public void removeDocumento(String borrar)
    {
        if (documentos.size()!=0) {
            documentos.removeIf(Documento -> (Documento.getNombre().equals(borrar)));
        }
        else{
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}





