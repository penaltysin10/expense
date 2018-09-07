package csku.expense;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    LedgerAccount account;

    @BeforeEach
    public void init(){
        account = new LedgerAccount();
        account.addBalance(1000);
        user = new User(account);

    }

    @Test
    public void testCheckBalance(){
        assertEquals(1000, user.balance());
    }

    @Test
    public void testAddIncomeAndCheckTotalIncome(){
        user.income(100);
        user.income(150);
        user.income(300);
        assertEquals(550, user.totalIncome());
    }

    @Test
    public void testAddExpenseLessThanBalance() throws NotEnoughBalanceException {
        user.expense(250);
        assertEquals(750, user.balance());
    }

    @Test
    public void testAddExpenseMoreThanBalance(){
        user.expense(1100);
        assertEquals("You can't add expense ,because expense more than balance.",
                "You can't add expense ,because expense more than balance.");
    }

    @Test
    public void testCheckTotalExpense() throws NotEnoughBalanceException{
        user.expense(200);
        user.expense(300);
        user.expense(300);
        assertEquals(800, user.totalExpense());
    }
}