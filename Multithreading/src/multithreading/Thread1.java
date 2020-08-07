/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Fahmii
 */
    class Multithreading implements Runnable{
        String nama;
        public Multithreading(String id){
        nama = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread : "+nama+" : Posisi : "+i);
        }
    }
}
    public class Thread1{
        public static void main(String[] args) {
            Thread t1 = new Thread(new Multithreading("M-1"));
            Thread t2 = new Thread(new Multithreading("M-2"));
            t1.start();
            t2.start();
        }
    }
