class A6 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi1");
        }
    }
}

class B6 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello1");
        }

    }
}

class A7 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi2");
            try {
                // this will tell the thread to wait for 5 mili second after exceuting previous
                // Hi
                Thread.sleep(5);
            } catch (InterruptedException e) {

            }
        }
    }
}

class B7 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello2");
        }

    }
}

// Thread is smallest unit of a process
// i.e breaking of a process into smallest possible unit is thread
class ThreadsClass {
    public static void main(String[] args) {
        A6 obj1 = new A6();
        B6 obj2 = new B6();
        // start is used start the excution of run() function of thread class
        // there must be a run() function in thread classes
        obj1.start();
        obj2.start();

        // obj1.stop();
       // obj2.stop();

        System.out.println("for different class thread");

        A7 obj3 = new A7();
        B7 obj4 = new B7();

        // thread Prioritites
        // max - 10
        // min - 1
        // normal - 5
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj3.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
           
        }
        obj4.start();
        System.out.println(obj4.getPriority());
    }   
}