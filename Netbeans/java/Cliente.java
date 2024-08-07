//Nome:Victor Ribeiro Calado
//RA: 2313553

public class Cliente extends Pessoa {

    private int pedido;
    private int entrega;
    private String pagamento;

    //Polimorfismo por Sobrecarga
    public Cliente(){

        pedido = 0;
        entrega = 0;
        pagamento = "";

    }

    public Cliente(int pedido, int entrega, String pagamento){

        this.pedido = pedido;
        this.entrega = entrega;
        this.pagamento = pagamento;

    }

    public Cliente(Cliente c){

        this.pedido = c.getPedido();
        this.entrega = c.getEntrega();
        this.pagamento = c.getPagamento();

    }
    public  String EntrMenu(){

        String s_Entrega = Integer.toString(getEntrega());

        switch (getEntrega()) {
            case 1:
                s_Entrega = "CASA";
                break;

            case 2:
                s_Entrega = "ESTABELECIMENTO";
                break;


            default:
                System.out.println("\nERROR: NUMERO INVALIDO");

        }
        return s_Entrega;




    }
    public String PedidoMenu(){

        String s_Pedido = Integer.toString(getPedido());

        switch (getPedido()) {
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
        return s_Pedido;





    }
    //Getters
    public int getPedido() {
        return pedido;
    }

    public int getEntrega() {
        return entrega;
    }

    public String getPagamento() {
        return pagamento;
    }

    //Setters
    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
