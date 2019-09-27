package com.lambton;

public class SecondThread implements Runnable {


   private String name;
    public SecondThread(String name)
    {
      this.name=name;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            System.out.println(this.name+ " : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
