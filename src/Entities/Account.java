package Entities;

public class Account {
	private int    number;  //numero da conta
	private String holder;  //nome do correntista
	private double balance; //saldo da conta
	
	//------------------------------------------------------------------------------------------------
	//Contruct
	//------------------------------------------------------------------------------------------------
	public Account(int number, String holder, double inicialDeposit) {
		//super(); n�o precisa porque estamos criando um construct simples que n�o deriva de outra class
		this.number  = number;
		this.holder  = holder;
		//this.balance = balance; como o saldo inicial � um depisito chamamos o metodo de deposito 
		deposit(inicialDeposit);                                                                //
		//----------------------------------------------------------------------------------------
	}

	public Account(int number, String holder) {
		this.number  = number;
		this.holder  = holder;
	}
	
	
	//------------------------------------------------------------------------------------------------
	//Getter and Setters
	//------------------------------------------------------------------------------------------------
	public int getNumber() {
		return number;
	}

    //set da conta , n�o vamos precisar pois ela n�o podera ser mudada depois da cria��o
	/*
	public void setNumber(int number) {
		this.number = number;
	}*/


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

    //set do saldo, n�o vamos precisar pois ela n�o podera ser mudada depois da cria��o
    /*   
	public void setBalance(double balance) {
		this.balance = balance;
	} */

	
	//------------------------------------------------------------------------------------------------
	//Methods
	//------------------------------------------------------------------------------------------------
	
	//deposit 
	public void deposit (double amount) {
 		balance += amount; //soma o valor do deposito
	}
	
	//withdraw (saque) 
	public void withdraw (double amount) {
		balance -= amount + 5.00; //subtrai o valor do saque + o valor da taxa de saque
	}

	public String toString() {
		return "Account : "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance : $ "
				+ String.format("%.2f", balance);
	}
	
}
