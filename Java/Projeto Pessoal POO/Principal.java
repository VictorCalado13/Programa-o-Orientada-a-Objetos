//Nome:Victor Ribeiro Calado
//RA: 2313553

public class Principal {

    public static void main(String arg[]){

        Cliente cl = new Cliente();
        Funcionario fu = new Funcionario();
        Entrada en = new Entrada();

        System.out.println("\nCadastro Cliente");
        cl.setNome(en.EntradaTec("\nDigite o NOME do Cliente: "));
        cl.setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF: ")));
        cl.setEndereco(en.EntradaTec("\nInforme o ENDERECO: "));
        cl.setIdade(Integer.parseInt(en.EntradaTec("\nInforme a Idade: ")));

        cl.setEntrega(Integer.parseInt(en.EntradaTec("\nOnde o cliente ira consumir\n\t1: CASA\n\t2: ESTABELECIMENTO\n")));
        String s_Entrega = Integer.toString(cl.getEntrega());

        switch (cl.getEntrega()){
            case 1:
                s_Entrega = "CASA";
                break;

            case 2:
                s_Entrega = "ESTABELECIMENTO";
                break;


            default:
                System.out.println("\nERROR: NUMERO INVALIDO");

        }

        cl.setPedido(Integer.parseInt(en.EntradaTec("\nQual dos produtos foi escolhido:\n\t1: Pizza s/ Borda\n\t2: Pizza c/ Borda\n\t3: COCA COLA\n ")));

        String s_Pedido = Integer.toString(cl.getPedido());

        switch (cl.getPedido()){
            case 1:
                s_Pedido = "PIZZA S/ BORDA";
                break;

            case 2:
                s_Pedido = "PIZZA C/ BORDA";
                break;

            case 3:
                s_Pedido = "COCA COLA";
                break;

            default:
                System.out.println("ERRO: NUMERO INVALIDO");

        }

        cl.setPagamento(en.EntradaTec("\nQual e a forma de pagamento: "));


        fu.setNome(en.EntradaTec("\nInforme o NOME do Funcionario: "));
        fu.setEndereco(en.EntradaTec("\nInforme o ENDERECO do Funcionario: "));
        fu.setCidade(en.EntradaTec("\nInforme a CIDADE: "));
        fu.setIdade(Integer.parseInt(en.EntradaTec("\nInforme a IDADE do Funcionario: ")));
        fu.setCpf(Long.parseLong(en.EntradaTec("\nInforme o CPF do Funcionário: ")));

        try {

            fu.setHorario_ent(Integer.parseInt(en.EntradaTec("\nInforme o HORARIO em Horas de Entrada: ")));

        }
          catch (HorarioExc hor){

            hor.horarioValido();
            fu = hor.correcaoHor(fu);
          }
            catch (NumberFormatException numf){

            System.out.println("\nERROR informe numeros !!! ");
            }

        try {

            fu.setHorario_sai(Integer.parseInt(en.EntradaTec("\nInforme o HORARIO em Horas de Saida: ")));

        }
            catch (HorarioExc hor){

                hor.horarioValido();
                fu = hor.correcaoHor(fu);

            }

                catch (NumberFormatException numf){

                System.out.println("\nERROR informe numeros !!! ");

                }




        fu.setCargo(en.EntradaTec("\nInforme o CARGO do Funcionario: "));
        fu.setSalario(Long.parseLong(en.EntradaTec("\nInforme o SALARIO do Funcionario: ")));
        fu.setEntrada(en.EntradaTec("\nInforme a data de ENTRADA na Pizzaria: "));

        System.out.println("\nCalculo da carga Horaria Total: "+fu.Calculo()+" Hora(s)");

        //Impressao de Dados Cliente
        System.out.println("\nDados do cliente: ");
        System.out.println("\nNome: "+cl.getNome());
        System.out.println("\nCpf: "+cl.getCpf());
        System.out.println("\nEndereco: "+cl.getEndereco());
        System.out.println("\nLocal de Entrega: "+s_Entrega);
        System.out.println("\nPedido: "+s_Pedido);
        System.out.println("\nPagamento: "+cl.getPagamento());
        System.out.println("\nIdade: "+cl.getIdade());
        System.out.println("\n---------=============--------");

        //Impressao de Dados Funcionario
        System.out.println("\nDados do Funcionario: ");
        System.out.println("\nNome: "+fu.getNome());
        System.out.println("\nEnderco: "+fu.getEndereco());
        System.out.println("\nCidade: "+fu.getCidade());
        System.out.println("\nIdade: "+fu.getIdade());
        System.out.println("\nCpf: "+fu.getCpf());
        System.out.println("\nSalario: "+fu.getSalario());
        System.out.println("\nData de Entrada: "+fu.getEntrada());

    }


}
