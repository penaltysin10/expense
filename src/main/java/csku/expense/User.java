package csku.expense;

public class User {

    private LedgerAccount account;

    public User(LedgerAccount account){
        this.account = account;
    }

    public int balance(){
        return this.account.getBalance();
    }

    public void income(int money){
        this.account.addIncome(money);
    }

    public void expense(int money) {
        try {
            this.account.addExpense(money);
        } catch (NotEnoughBalanceException e) {
            System.out.println("You can't add expense ,because expense more than balance.");
        }
    }

    public int totalIncome(){
        return this.account.getTotalIncome();
    }

    public int totalExpense(){
        return this.account.getTotalExpense();
    }
}
