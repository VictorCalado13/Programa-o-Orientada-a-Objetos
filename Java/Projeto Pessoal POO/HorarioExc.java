//Nome:Victor Ribeiro Calado
//RA: 2313553

public class HorarioExc extends Exception{


    Entrada en = new Entrada();
    public void horarioValido(){

        System.out.println("\nERROR Informe um horario valido !!!");

    }

    public Funcionario correcaoHor(Funcionario func){

        try {

            func.setHorario_ent(Integer.parseInt(en.EntradaTec("\nInforme o HORARIO em Horas de Entrada: ")));

        }
        catch (HorarioExc hor){

            hor.horarioValido();
            func = hor.correcaoHor(func);
        }
        catch (NumberFormatException numf){

            System.out.println("\nERROR informe numero !!!");
        }

        return func;
   }



}
