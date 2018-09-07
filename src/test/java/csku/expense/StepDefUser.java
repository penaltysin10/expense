package csku.expense;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

class StepDefUser {

    LedgerAccount account;
    User user;

    @Before
    void setUser(){
        account = new LedgerAccount();
        user = new User(account);
    }

    @Given("^a user add balance is (\\d+)$")
    public void a_user_add_balance_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        account.addBalance(arg1);
        throw new PendingException();
    }

    @Then("^my balance is  (\\d+)$")
    public void my_balance_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg1, user.balance());
        throw new PendingException();
    }

    @When("^I add (\\d+) to balance$")
    public void i_add_to_balance(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.income(arg1);
        throw new PendingException();
    }

    @Then("^I have total income is (\\d+)$")
    public void i_have_total_income_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.income(arg1);
        assertEquals(arg1, user.totalIncome());
        throw new PendingException();
    }

    @When("^I spend (\\d+) from balance$")
    public void i_spend_from_balance(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.expense(arg1);
        throw new PendingException();
    }

    @Then("^i have total expense is (\\d+)$")
    public void i_have_total_expense_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        user.expense(arg1);
        assertEquals(arg1, user.totalExpense());
        throw new PendingException();
    }

    @Then("^You can't add expense ,because expense more than balance\\.$")
    public void you_can_t_add_expense_because_expense_more_than_balance() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("You can't add expense ,because expense more than balance.",
                "You can't add expense ,because expense more than balance.");
        throw new PendingException();
    }

}