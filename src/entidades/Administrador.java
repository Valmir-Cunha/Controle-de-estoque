package entidades;


import servicos.Estoque;
import servicos.Administracao;

public class Administrador extends Funcionario {
    private Estoque estoque; 
    private Administracao gerencia;

    public Administrador(Estoque estoque, Administracao gerencia) {
        super();
        this.estoque = estoque;
        this.gerencia = gerencia;
    }

    //Não mexer
    public Administrador(String nome, String endereco, String numeroTelefone, int id,double salario, Estoque estoque, Administracao gerencia) {
        super(nome, endereco, numeroTelefone, id, salario);
        this.estoque = estoque;
        this.gerencia = gerencia;
    }
    
    //Não mexer
    public void cadastrarCliente(int id,String nome,String numero,String endereco){
        Cliente cliente = new Cliente(nome,numero,endereco,id);
        gerencia.getClientes().add(cliente);
        gerencia.setIdClientes();   
    }
    
    //Não mexer
    public boolean excluirCliente(int id) {
        Cliente cliente;
        cliente = gerencia.buscarClienteCod(id);
        gerencia.getClientes().remove(cliente);
        gerencia.getClientesExcluidos().add(cliente);
        return true;
    }
    //Não mexer
    public boolean editarCliente(int id,String nome,String numero,String endereco){
        Cliente cliente;
        cliente = gerencia.buscarClienteCod(id);
        if(cliente != null){
            cliente.setNome(nome);
            cliente.setNumeroTelefone(numero);
            cliente.setEndereco(endereco);
            return true;
        }else{
            return false;
        }
    }
    
}
