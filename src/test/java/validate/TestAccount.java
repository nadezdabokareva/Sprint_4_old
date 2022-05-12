package validate;

import logic.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAccount {

    @Test
    public void checkingCardsWithCorrectName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithoutWhiteSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithWhiteSpaceStart() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithWhiteSpaceEnd() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithWhiteSpaceMoreTwo() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithNameLessThreeSymbols() {
        Account account = new Account("Т ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkingCardsWithNameMoreNineteenSymbols() {
        Account account = new Account("Ирина СергеевнаКожемятько");
        assertFalse(account.checkNameToEmboss());
    }
}
