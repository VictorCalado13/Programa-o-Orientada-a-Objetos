//Nome:Victor Ribeiro Calado
//RA: 2313553

import java.util.List;
import  java.util.ArrayList;
public class Principal {
    private static Cliente cl = new Cliente();
    private static Funcionario fu = new Funcionario();
    private static Entrada en = new Entrada();
private static List<Cliente> bcliente = new ArrayList<Cliente>();
private static List<Funcionario> bfuncionário = new ArrayList<Funcionario>();

    public static void main(String arg[]) {


        System.out.println("\nCadastro Cliente");
        boolean controlecl = true;
        String menuentrada;
        String menupedido;
        while (controlecl) {
            cl = new Cliente();
            cl.setNome(en.EntradaTec("\nDigite o NOME do Cliente: "));
            cl.setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF: ")));
            cl.setEndereco(en.EntradaTec("\nInforme o ENDERECO: "));
            cl.setIdade(Integer.parseInt(en.EntradaTec("\nInforme a Idade: ")));


            cl.setEntrega(Integer.parseInt(en.EntradaTec(("\nOnde o cliente ira consumir\n\t1: CASA\n\t2: ESTABELECIMENTO\n"))));
            menuentrada = cl.EntrMenu();

            cl.setPedido(Integer.parseInt(en.EntradaTec("\nQual dos produtos foi escolhido:\n\t1: Pizza s/ Borda\n\t2: Pizza c/ Borda\n\t3: COCA COLA\n ")));
            cl.PedidoMenu();
            menupedido = cl.PedidoMenu();

            cl.setPagamento(en.EntradaTec("\nQual e a forma de pagamento: "));
            bcliente.add(cl);
            String escolha = en.EntradaTec("\nVoce ira cadastrar outro cliente: S/N");
            if (escolha.equalsIgnoreCase("N")) {
                controlecl = false;
            }
        }
        boolean controlefu = true;
        while (controlefu) {
            fu = new Funcionario();
            fu.setNome(en.EntradaTec("\nInforme o NOME do Funcionario: "));
            fu.setEndereco(en.EntradaTec("\nInforme o ENDERECO do Funcionario: "));
            fu.setCidade(en.EntradaTec("\nInforme a CIDADE: "));
            fu.setIdade(Integer.parseInt(en.EntradaTec("\nInforme a IDADE do Funcionario: ")));
            fu.setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF do Funcionário: ")));

            try {

                fu.setHorario_ent(Integer.parseInt(en.EntradaTec("\nInforme o HORARIO em Horas de Entrada: ")));

            } catch (HorarioExc hor) {

                hor.horarioValido();
                fu = hor.correcaoHor(fu);
            } catch (NumberFormatException numf) {

                System.out.println("\nERROR informe numeros !!! ");
            }

            try {

                fu.setHorario_sai(Integer.parseInt(en.EntradaTec("\nInforme o HORARIO em Horas de Saida: ")));

            } catch (HorarioExc hor) {

                hor.horarioValido();
                fu = hor.correcaoHor(fu);

            } catch (NumberFormatException numf) {

                System.out.println("\nERROR informe numeros !!! ");

            }


            fu.setCargo(en.EntradaTec("\nInforme o CARGO do Funcionario: "));
            fu.setSalario(Long.parseLong(en.EntradaTec("\nInforme o SALARIO do Funcionario: ")));
            fu.setEntrada(en.EntradaTec("\nInforme a data de ENTRADA na Pizzaria: "));

            bfuncionário.add(fu);
            String escolha = en.EntradaTec("\nVoce ira cadastrar outro funcionario: S/N");
            if (escolha.equalsIgnoreCase("N")) {
                controlefu = false;
            }

        }
        System.out.println("\nCalculo da carga Horaria Total: " + fu.Calculo() + " Hora(s)");

        //Impressao de Dados Cliente
        System.out.println("\nDados do cliente: ");
        Cliente cl2 = new Cliente();
        cl2.setNome(en.EntradaTec("\nEntre com o nome do Cliente:"));
        for (int i = 0; i < bcliente.size(); i++) {
            if (cl2.getNome() == bcliente.get(i).getNome()) {
                System.out.println("\nNome: " + bcliente.get(i).getNome());
                System.out.println("\nCpf: " + bcliente.get(i).getCpf());
                System.out.println("\nEndereco: " + bcliente.get(i).getEndereco());
                System.out.println("\nLocal de Entrega: " + bcliente.get(i).EntrMenu());
                System.out.println("\nPedido: " + bcliente.get(i).PedidoMenu());
                System.out.println("\nPagamento: " + bcliente.get(i).getPagamento());
                System.out.println("\nIdade: " + bcliente.get(i).getIdade());
                System.out.println("\n---------=============--------");

            }
        }
        //Impressao de Dados Funcionario
        System.out.println("\nDados do Funcionario: ");
        Funcionario fu2 = new Funcionario();
        fu2.setNome(en.EntradaTec("\nEntre com o nome do Funcionario:"));
        for (int i = 0; i < bfuncionário.size(); i++) {
            if (cl2.getNome() == bfuncionário.get(i).getNome()) {
                System.out.println("\nNome: " + bfuncionário.get(i).getNome());
                System.out.println("\nEnderco: " + bfuncionário.get(i).getEndereco());
                System.out.println("\nCidade: " + bfuncionário.get(i).getCidade());
                System.out.println("\nIdade: " + bfuncionário.get(i).getIdade());
                System.out.println("\nCpf: " + bfuncionário.get(i).getCpf());
                System.out.println("\nSalario: " + bfuncionário.get(i).getSalario());
                System.out.println("\nData de Entrada: " + bfuncionário.get(i).getEntrada());
            }
        }
        Cliente cl3 = new Cliente();
        cl3.setNome(en.EntradaTec("\nEntre com o nome do cliente que deseja alterar:"));
        for (int i = 0; i < bcliente.size(); i++) {
            if (cl3.getNome() == bcliente.get(i).getNome()) {
                bcliente.get(i).setNome(en.EntradaTec("\nDigite o NOME do Cliente: "));
                bcliente.get(i).setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF: ")));
                bcliente.get(i).setEndereco(en.EntradaTec("\nInforme o ENDERECO: "));
                bcliente.get(i).setIdade(Integer.parseInt(en.EntradaTec("\nInforme a Idade: ")));
                bcliente.get(i).setEntrega(Integer.parseInt(en.EntradaTec(("\nOnde o cliente ira consumir\n\t1: CASA\n\t2: ESTABELECIMENTO\n"))));
                menuentrada = bcliente.get(i).EntrMenu();
                bcliente.get(i).setPedido(Integer.parseInt(en.EntradaTec("\nQual dos produtos foi escolhido:\n\t1: Pizza s/ Borda\n\t2: Pizza c/ Borda\n\t3: COCA COLA\n ")));
                bcliente.get(i).PedidoMenu();
                menupedido = bcliente.get(i).PedidoMenu();

                bcliente.get(i).setPagamento(en.EntradaTec("\nQual e a forma de pagamento: "));
            }
        }

        Funcionario fu3 = new Funcionario();
        fu3.setNome(en.EntradaTec("\nEntre com o nome do cliente que deseja alterar:"));
        for (int i = 0; i < bfuncionário.size(); i++) {
            if (fu3.getNome() == bfuncionário.get(i).getNome()) {
                bfuncionário.get(i).setNome(en.EntradaTec("\nInforme o NOME do Funcionario: "));
                bfuncionário.get(i).setEndereco(en.EntradaTec("\nInforme o ENDERECO do Funcionario: "));
                bfuncionário.get(i).setCidade(en.EntradaTec("\nInforme a CIDADE: "));
                bfuncionário.get(i).setIdade(Integer.parseInt(en.EntradaTec("\nInforme a IDADE do Funcionario: ")));
                bfuncionário.get(i).setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF do Funcionário: ")));
                bfuncionário.get(i).setCargo(en.EntradaTec("\nInforme o CARGO do Funcionario: "));
                bfuncionário.get(i).setSalario(Long.parseLong(en.EntradaTec("\nInforme o SALARIO do Funcionario: ")));
                bfuncionário.get(i).setEntrada(en.EntradaTec("\nInforme a data de ENTRADA na Pizzaria: "));

            }
        }
        Cliente cl4 = new Cliente();
        cl4.setNome(en.EntradaTec("\nEntre com o nome do cliente que deseja excluir:"));
        for (int i = 0; i < bcliente.size(); i++) {
            if (cl4.getNome() == bcliente.get(i).getNome()) {
                bcliente.remove(bcliente.get(i));
            }
        }

        Funcionario fu4 = new Funcionario();
        fu4.setNome(en.EntradaTec("\nEntre com o nome do cliente que deseja excluir:"));
        for (int i = 0; i < bfuncionário.size(); i++) {
            if (fu4.getNome() == bfuncionário.get(i).getNome()) {
                bfuncionário.remove(bfuncionário.get(i));
            }
        }
    }
}
