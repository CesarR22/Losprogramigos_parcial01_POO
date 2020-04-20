package com.CARCx00015319;

public final class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

    protected CalculadoraImpuestos(){}

    public static double calcularPago(Empleado e){

        double pago = 0.0;

        if(e instanceof ServicioProfesional){

            totalRenta = 0.1*e.salario;
            pago = e.salario-totalRenta;

        }else {

            totalAFP = 0.0625 * e.salario;
            totalISSS = 0.03 * e.salario;

            double saldoRestante = e.salario-(totalISSS+totalAFP);

            if(saldoRestante>0 && saldoRestante<=472)

                pago = saldoRestante;

            else{

                if(saldoRestante>472 && saldoRestante<=895.24){
                    totalRenta = 0.1*(saldoRestante-472) +17.67;
                    pago = saldoRestante-totalRenta;

                }else{

                    if(saldoRestante>895.24 && saldoRestante<= 2038.10){
                        totalRenta = 0.2*(saldoRestante-895.24)+60;
                        pago = saldoRestante-totalRenta;

                    } else{

                        if(saldoRestante>2038.10){
                            totalRenta = 0.3*(saldoRestante-2038.10)+ 288.57;
                            pago =saldoRestante-totalRenta;

                        }else
                            System.out.println("Error");
                    }
                }
            }
        }

        return pago;
    }


    public static String mostrarTotales(){
        String descripcion ="Detalle de descuentos:\n -- AFP: " + totalAFP + "\n "+ "-- ISSS: " + totalISSS + "\n " +
                "-- Renta: " + totalRenta + "\n ";
        return descripcion;
    }

}
/*
// BASEEEEE
public class CalculadoraImpuestos {
    private  double _Salario;
    private  double _Afp;
    private  double _Isss;
    private  double _Liquido;
    private int _clase; // 0 = A; 1 = B; 2 = C; 3 = D;
    private String _claseLetra; // 0 = A; 1 = B; 2 = C; 3 = D;
    private double _calRenta;

        public void CalculadoraImpuestos(double salario){
            this._Salario = salario;
            this._Afp = 0.0;
            this._Isss = 0.0;
            this._Liquido = 0.0;
            this._clase = 0;
            this._calRenta = 0;
            this._claseLetra = "A";
        }

        public void rangoSalarial(){
            double salario = this._Salario;
            int clase = 0;
            String claseL = "A";

            if (salario < 0.01){
                System.out.println("Tu salario no puede ser menos a $0.01");
            }
            else if(salario < 472){
                clase = 0;
                claseL = "A";
            }else if(salario > 472 && salario < 895.24){
                clase = 1;
                claseL = "B";
            }else if(salario > 895.24 && salario < 2038.10){
                clase = 2;
                claseL = "C";
            }else{
                clase = 3;
                claseL = "D";
            }

            this._clase = clase;
            this._claseLetra = claseL;
            System.out.println("Tu clase es: " + this._claseLetra);
        }

        public void calculoRango(){
            switch(this._clase){
                case 0:
                    this._calRenta = 0;
                    break;
                case 1:
                    this._calRenta = (0.10 * (this._Salario - 472)) + 16.77;
                    break;
                case 2:
                    this._calRenta = (0.20 * (this._Salario - 895.24)) + 60;
                    break;
                default:
                    this._calRenta = (0.30 * (this._Salario - 2038.10)) + 288.07;
                    break;
            }


            System.out.println("El valor de la renta a pagar es de: " + this._calRenta);
        }

        public void calculoAfp(){
            double Salario = this._Salario;
            double AFP = this._Afp;

            if (Salario < 0.01){
                System.out.println("Su Salario no puede ser menos a $0.01");

            }
            else{
                this._Afp = 0.0625 * (this._Salario) ;
            }

            System.out.println("El valor de AFP: " + this._Afp);
        }

        public void calculoIsss(){
            double Salario = this._Salario;
            double ISSS = this._Isss;

            if (Salario < 0.01){
                System.out.println("Su Salario no puede ser menos a $0.01");

            }
            else{
                this._Isss = 0.03 * (this._Salario) ;
            }

            System.out.println("El valor de ISSS: " + this._Isss);
        }

        public void SalarioLiquido(){
            double Salario = this._Salario;
            double Liquido = this._Liquido;
            double Descuentos = (this._calRenta + this._Isss + this._Afp);

            if (Salario < 0.01){
                System.out.println("Su Salario no puede ser menos a $0.01");

            }
            else{
                this._Liquido = this._Salario - Descuentos ;
            }

            System.out.println("Su salario liquido es : " + this._Liquido);
        }





    public CalculadoraImpuestos(double salario) {
    }

    public double getSalario() {
        return _Salario;
    }

*/