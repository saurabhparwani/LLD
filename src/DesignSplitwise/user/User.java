package DesignSplitwise.user;

import DesignSplitwise.UserExpenseBalanceSheet;
import lombok.Getter;

@Getter
public class User {
    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String id, String userName){
        this.userId = id;
        this.userName = userName;
        userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

}
