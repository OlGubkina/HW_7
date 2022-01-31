package com.company;
/*
-реализовать enum класс состоящий из типов пользователей приложения (ADMIN, PREMIUM, AUTHORIZED, GUEST)
-добавить int параметр в enum описывающий приоритетность обслуживания этого пользователя (0, 1, 2, 3);
*/
public enum UserType {
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);

    private int priority;

    UserType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) { // не нужен. не можем менять?
        this.priority = priority;
    }


}
