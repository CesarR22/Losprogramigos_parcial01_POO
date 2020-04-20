package com.CARCx00015319;


import java.util.ArrayList;


public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado empleado){

        planilla.add(empleado);

    }

    public void quitEmpleado(String eliminar){

        planilla.removeIf(s-> s.nombre == eliminar);

    }

    public void setPlanilla(ArrayList<Empleado> planilla) {

        this.planilla = planilla;
    }



}

