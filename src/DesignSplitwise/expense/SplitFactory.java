package DesignSplitwise.expense;

import DesignSplitwise.expense.split.EqualExpenseSplit;
import DesignSplitwise.expense.split.ExpenseSplit;
import DesignSplitwise.expense.split.PercentageExpenseSplit;
import DesignSplitwise.expense.split.UnequalExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }

}
