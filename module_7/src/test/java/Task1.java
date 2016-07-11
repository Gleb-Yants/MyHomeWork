import org.junit.Test;
import task_1.Account;
import task_1.AccountManagement;

import java.util.HashMap;

/**
 * Created by Gleb_Yants on 03.07.2016.
 */
public class Task1 {
    @Test
    public void getSomeTransactions() throws Exception {
        Account a = AccountManagement.getAccount(3);
        HashMap<Integer, Integer> b = a.getTransactions();
        assert (b.get(4) == 300);
    }

    @Test
    public void getSomeTransactions2() throws Exception {
        Account a = AccountManagement.getAccount(14);
        HashMap<Integer, Integer> b = a.getTransactions();
        assert (b.get(15) == 12000);
    }

    @Test
    public void addTrans() throws Exception {
        AccountManagement.addTransaction(5, 7, 300);
        Account a = AccountManagement.getAccount(5);
        HashMap<Integer, Integer> b = a.getTransactions();
        assert (b.get(7) == 1700);
    }
}
/*
3 4 300
14 15 12000
5 7 1400
 */
