public class test implements Runnable{
    private int ticket;
    public test(int ticket){
        this.ticket=ticket;
    }
    @Override
    public void run(){

        while (ticket>0){
            try {
                //为了表示攻击需要时间，每次攻击暂停1000毫秒
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ticket--;
            System.out.println("剩余"+ticket+"张票");
        }
    }
    public static void main(String[] args) {
        System.out.println("开始卖票!");

        Thread a=new Thread(new test(100));
        a.start();

        Thread b=new Thread(new test(20));
        b.start();
    }
}
