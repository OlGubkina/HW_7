package com.company;

// Реализовать класс User, с полями login, password, type
public class User { //Ctrl+Alt+F7 - кто использует класс
    private String login; // видимость в пределах package
    private String password;
    private UserTypes type;

    private boolean setLogin(String login) {
        if (login == null) {return false;}
        else {this.login = login;
            return true;}
    }

    public User(String login, String password, UserTypes type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    //  Реализовать toString(), equals(), hashCode() для объектов User

    @Override
    public String toString() {
        return "User [" +
                "login=" + login +
                " password=" + password +
                " type= " + type + ']';

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        User that = (User) obj;
        if
                (this.login.equals(that.login)&&
                this.password.equals(that.password)&&
                (this.type == that.type))
        return true;
        return false;

        }

    @Override
    public int hashCode() {
        return this.login.hashCode() + 11 * this.password.hashCode() + type.ordinal();
    }
}
