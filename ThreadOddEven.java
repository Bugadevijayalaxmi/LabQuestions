package LabQuestins;
public class OddEvenThreads {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());
        
        oddThread.start();
        evenThread.start();
    }
}

class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenPrinter implements Runnable {
    @Override
    public void run(){
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}