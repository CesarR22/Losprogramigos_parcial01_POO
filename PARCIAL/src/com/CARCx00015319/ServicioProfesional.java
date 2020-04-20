package com.CARCx00015319;

public class ServicioProfesional extends Empleado {
    private int MesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, int MesesContrato) {
        super(nombre, puesto, salario);
        this.MesesContrato = MesesContrato;
    }

    public int getMesesContrato() {
        return MesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        MesesContrato = mesesContrato;
    }

    @Override
    public String toString() {
        return "ServicioProfesional{" +
                "MesesContrato=" + MesesContrato +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", documentos=" + documentos +
                ", salario=" + salario +
                '}';
    }
}
