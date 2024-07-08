class FizzBuzz {
    private final int n;
    private final Phaser phaser = new Phaser(4);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            var shouldPrint = i % 3 == 0 && i % 5 != 0;
            if (shouldPrint) printFizz.run();
            phaser.arriveAndAwaitAdvance();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            var shouldPrint = i % 5 == 0 && i % 3 != 0;
            if (shouldPrint) printBuzz.run();
            phaser.arriveAndAwaitAdvance();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            var shouldPrint = i % 5 == 0 && i % 3 == 0;
            if (shouldPrint) printFizzBuzz.run();
            phaser.arriveAndAwaitAdvance();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            var shouldPrint = i % 3 != 0 && i % 5 != 0;
            if (shouldPrint) printNumber.accept(i);
            phaser.arriveAndAwaitAdvance();
        }
    }
}