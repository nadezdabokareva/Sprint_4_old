package logic;

public class Praktikum {

    private static Account account;
    private static logic.Account Account;

    public static void main(String[] args) {
        String nameSurname = "Тимоти Шаламе";
        Account account = new Account(nameSurname);
        account.checkNameToEmboss();
    }
}
