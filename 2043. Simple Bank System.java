class Bank {
        long[] bankAccount;
        int n;
    public Bank(long[] balance) {
         n = balance.length;
        bankAccount = new long[n];
        for(int i=0; i<n; i++){
            bankAccount[i] = balance[i];
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 > n || account2> n) return false;
        if(money > bankAccount[account1-1]) return false;
        bankAccount[account1-1]-=money;
        bankAccount[account2-1]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account >n) return false;
        bankAccount[account-1]+= money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account >n || bankAccount[account-1]<money) return false;
        bankAccount[account-1]-= money;
        return true;
    }
}
