/*
* welcome user
* - ask for name
* - ask for age
* - birthyear
*
*
* have a total balance
*
* withdraw
*
* deposit
*
* get balance back after
*/
import java.util.Scanner;


public class HackRu23
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);


}
}


class BankAccount
{
int amount;
double balance;
int lastTransAction;
String name;


void deposit (int amount)
{
if (amount != 0)
{
balance = balance + amount;
lastTransAction = amount;
}
}
void withdraw (int amount)
{
if (amount !=0)
{
balance = balance - amount;
lastTransAction = -amount;
}
}


void getlastTransaction()
{
if (lastTransAction > 0)
{
System.out.println("You have deposited: " + lastTransAction);
}
else if (lastTransAction < 0)
{
System.out.println("You have withdrawn: " + lastTransAction);
}
}
}







