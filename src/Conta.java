public class Conta
{
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor)
	{
		this.saldo = this.saldo + valor;
	}
	
	public String saca(double valor)
	{
		if (this.saldo >= valor)
		{
			this.saldo = this.saldo - valor;
			return "Saque realizado!";
		}
		else
		{
			return "Saldo insuficiente.";
		}
			
	}
	
	public String transfere(double valor, Conta destino)
	{
		if (this.saldo >= valor)
		{
			this.saca(valor);
			destino.deposita(valor);
			return "Transferência realizada.";
		}
		
		return "Não foi possível realizar a transferência.";
	}
	
}