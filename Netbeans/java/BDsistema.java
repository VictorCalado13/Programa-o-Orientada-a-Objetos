//Nome: Victor Ribeiro Calado
//RA: 2313553

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class BDsistema {

    private  Cliente clin = new Cliente();
    private Funcionario funci = new Funcionario();


    public List<Cliente> bdC = new ArrayList<Cliente>();

    
    public List<Cliente> getBdCli(){

        return bdC;

    }

    public Cliente cadCli(Cliente cli){

        if(impCliNum(cli) == null){
            bdC.add(cli);
            return cli;
        }
        else{
            return null;
        }

    }

    public Cliente impCliNum(Cliente cli){
        for(int i = 0; i<bdC.size(); i++){
            if(cli.getCpf() == bdC.get(i).getCpf()){
                return bdC.get(i);
            }
        }

        return null;
    }

    public Cliente removeClienteNum(Cliente cli){
        cli = impCliNum(cli);

        if(cli != null){

            bdC.remove(cli);
            return null;

        }
        else{

            return cli;

        }

    }

    public Cliente alteraClienteNum(Cliente cli){

        for(int i = 0; i<bdC.size(); i++){

            if(cli.getCpf() == bdC.get(i).getCpf()){

                String nome, endereco, cidade, pagamento;
                int idade;
                nome = JOptionPane.showInputDialog(null,"Nome:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade:", "Alterar",JOptionPane.INFORMATION_MESSAGE));
                endereco = JOptionPane.showInputDialog(null,"Endereco:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                cidade = JOptionPane.showInputDialog(null,"Cidade:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                pagamento = JOptionPane.showInputDialog(null,"Pagamento:", "Alterar",JOptionPane.INFORMATION_MESSAGE);

                cli.setNome(nome);
                cli.setIdade(idade);
                cli.setEndereco(endereco);
                cli.setCidade(cidade);
                cli.setPagamento(pagamento);

                bdC.set(i, cli);

                return bdC.get(i);

            }

        }

        return null;

    }

    private Funcionario fu = new Funcionario();


    public List<Funcionario> bdf = new ArrayList<Funcionario>();


    public List<Funcionario> getBdfu(){

        return bdf;

    }

    public Funcionario cadfu(Funcionario fu){

        if(impfuNum(fu) == null){
            bdf.add(fu);
            return fu;
        }
        else{
            return null;
        }

    }

    public Funcionario impfuNum(Funcionario fu){
        for(int i = 0; i<bdf.size(); i++){
            if(fu.getCpf() == bdf.get(i).getCpf()){
                return bdf.get(i);
            }
        }

        return null;
    }

    public Funcionario removeFuncionarioNum(Funcionario fu){
        fu = impfuNum(fu);

        if(fu != null){

            bdf.remove(fu);
            return null;

        }
        else{

            return fu;

        }

    }

    public Funcionario alteraFuncionarioNum(Funcionario fu){

        for(int i = 0; i<bdf.size(); i++){

            if(fu.getCpf() == bdf.get(i).getCpf()){

                String nome, endereco, cidade;
                long salario;
                int idade;
                nome = JOptionPane.showInputDialog(null,"Nome:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade:", "Alterar",JOptionPane.INFORMATION_MESSAGE));
                endereco = JOptionPane.showInputDialog(null,"Endereco:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                cidade = JOptionPane.showInputDialog(null,"Cidade:", "Alterar",JOptionPane.INFORMATION_MESSAGE);
                salario = Long.parseLong(JOptionPane.showInputDialog(null,"Salario:", "Alterar",JOptionPane.INFORMATION_MESSAGE));

                fu.setNome(nome);
                fu.setIdade(idade);
                fu.setEndereco(endereco);
                fu.setCidade(cidade);
                fu.setSalario(salario);

                bdf.set(i, fu);

                return bdf.get(i);

            }

        }

        return null;

    }

}