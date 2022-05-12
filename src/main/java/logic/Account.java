package logic;

public class Account {

    public final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (this.name.length() >= 3
                && this.name.length() <= 19
                && checkOneChar(this.name, ' ')
                && !this.name.startsWith(" ")
                && !this.name.endsWith(" ")) {
            return true;
        }
        return false;
    }

    private boolean checkOneChar(String string, char symbol) {
        int count = 0;
        for (char litera : string.toCharArray()) {
            if (litera == symbol) {
                if (count >= 1) return false;
                count++;
            }
        }
        return count == 1;
    }
}


















