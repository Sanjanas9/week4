import java.util.Scanner;
interface Atm{
  void withdraw();
  void deposit();
  int getBalance();
}

class Sbi implements Atm{
  Scanner s=new Scanner(System.in);

  int balance=getBalance();
  int minBalance=500;
  public void withdraw(){
    System.out.println("Enter the amount to withdraw");
    int amount=s.nextInt();
    if(balance>minBalance){
      balance=balance-amount;
      System.out.println("After withdrawing the amount the balance is "+balance);
    }
    else{
      System.out.println("Insufficient balance");
    }
  }
    public int getBalance(){
       int balance=20000;
       return balance; 
    }

  public void deposit(){
    System.out.println("Enter the amount to deposite");
    int amount=s.nextInt();
    balance=balance+amount;
    System.out.println("The balance after deposit is "+balance);
  }
}

class AtmDemo{
  public static void main(String args[]){
    Atm obj=new Sbi();
    obj.deposit();
    obj.withdraw();
  }
}