public class ClasseBancaria {
    //ATRIBUTOS
    private String titular;
    private String numero;
    private double saldo;

    //CONSTRUTOR
    public ClasseBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    //METOTODS
    public boolean depositar(double valor){
        if (valor <= 0 ){
            System.out.println("Não é possivel depositar valor abaixo ou igual a 0!");
            return false;
        }else{
            this.saldo += valor;
            return true;
        }
    }
    public boolean sacar(double valor){

    }
    public boolean transferir(double valor, ContaBancaria destino){

    }

    //GET
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
