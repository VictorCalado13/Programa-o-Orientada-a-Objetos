//Nome:Victor Ribeiro Calado
//RA: 2313553

public class Funcionario extends Pessoa implements CalcHorario {

    private int horario_ent;
    private int horario_sai;
    private String cargo;
    private long salario;
    private String entrada;

    //Polimorfismo por Sobrecarga
    public Funcionario(){

        horario_ent = 0;
        horario_sai = 0;
        cargo = "";
        salario = 0;
        entrada = "";

    }

    public Funcionario(int horario_ent, int horario_sai, String cargo, long salario, String entrada){

        this.horario_ent = horario_ent;
        this.horario_sai = horario_sai;
        this.cargo = cargo;
        this.salario = salario;
        this.entrada = entrada;

    }

    public Funcionario(Funcionario f){

        this.horario_ent = f.getHorario_ent();
        this.horario_sai = f.getHorario_sai();
        this.cargo = f.getCargo();
        this.salario = f.getSalario();
        this.entrada = f.getEntrada();

    }

    public int Calculo(){
        //Calculo da carga Horaria Total

        int calculo;
        calculo = getHorario_sai()-getHorario_ent();
        return calculo;

    }

    //Getters
    public int getHorario_ent() {
        return horario_ent;
    }

    public int getHorario_sai() {
        return horario_sai;
    }

    public String getCargo() {
        return cargo;
    }

    public long getSalario() {
        return salario;
    }

    public String getEntrada() {
        return entrada;
    }

    //Setters
    public void setHorario_ent(int horario_ent) throws HorarioExc {
        if (horario_ent>0&&horario_ent<25){
            this.horario_ent = horario_ent;
        }
        else{
            throw new HorarioExc();
        }
    }

    public void setHorario_sai(int horario_sai) throws HorarioExc {
        if (horario_sai>0&&horario_sai<25){
            this.horario_sai = horario_sai;
        }
        else{
            throw new HorarioExc();
        }
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
}
