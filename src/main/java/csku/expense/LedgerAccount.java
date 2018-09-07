package csku.expense;

import java.util.ArrayList;

public class LedgerAccount {

    private int balance;
    private int currentIncome;
    private int currentExpense;
    private int totalIncome;
    private int totalExpense;
    private ArrayList<Integer> incomeList = new ArrayList<>();
    private ArrayList<Integer> expenseList = new ArrayList<>();

    public LedgerAccount(){ }

    public void addBalance(int balance){
        this.balance = balance;
    }

    public void addIncome(int amount){
        this.balance += amount;
        this.currentIncome = amount;
        this.incomeList.add(amount);

    }

    public void addExpense(int amount)throws NotEnoughBalanceException{
        if (amount > this.balance){
            throw new NotEnoughBalanceException("You can't add expense ,because expense more than balance.");
        }
        this.balance -= amount;
        this.currentExpense = amount;
        this.expenseList.add(amount);
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalIncome() {
        int total = 0;
        for (int income : this.incomeList){
            total += income;
        }
        this.totalIncome = total;
        return totalIncome;
    }

    public int getTotalExpense() {
        int total = 0;
        for (int expense : this.expenseList){
            total += expense;
        }
        this.totalExpense = total;
        return totalExpense;
    }
}
