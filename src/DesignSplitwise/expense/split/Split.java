package DesignSplitwise.expense.split;

import DesignSplitwise.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Split {
    User user;
    double amountOwe;
}
