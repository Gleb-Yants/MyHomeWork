package task_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Gleb_Yants on 03.07.2016.
 */
public class Account {
    private int accountId;
    private HashMap<Integer, Integer> transactions = new HashMap<>();

    public Account(int accountId, ArrayList<Integer> trans) {
        this.accountId = accountId;
        if (trans.size() > 0) {
            for (int i = 0; i < trans.size(); i = i + 2) {
                if (transactions.containsKey(trans.get(i))) {
                    transactions.put(trans.get(i), trans.get(i + 1) + transactions.get(trans.get(i)));
                } else transactions.put(trans.get(i), trans.get(i + 1));
            }
        }
    }

    public HashMap<Integer, Integer> getTransactions() {
        return transactions;
    }
}
