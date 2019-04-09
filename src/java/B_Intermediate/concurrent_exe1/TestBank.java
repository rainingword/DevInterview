package java.B_Intermediate.concurrent_exe1;


public class TestBank {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    //修改代码，使得能正常运行，并且打印出的所有账户的accounts之和固定不变
    public static void main(String[] args) {
        //Bank bank = new Bank(NACCOUNTS , INITIAL_BALANCE);
        Bank2 bank = new Bank2(NACCOUNTS , INITIAL_BALANCE);
        for(int i =0 ; i < NACCOUNTS; i ++)
        {
            int fromAccount = i;
            Runnable r = () -> {
                try{
                    while(true)
                    {
                        int toAccount = (int)(bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount , toAccount , amount);
                        Thread.sleep((int)(DELAY * Math.random()));
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
