package soal_1;

import Model.Mahasiswa;

public class soal_1 {
    public static void getNo1() {
        StackQueue stack = new StackQueue(10);
        stack.push(new Mahasiswa("Andi", "22552011093", "TIF RM 22 A "));
        stack.push(new Mahasiswa("Sugara", "22552011193", "TIF RM 22 B "));
        stack.push(new Mahasiswa("Putra", "22552011154", "TIF RM 22 C "));

        stack.print();
        stack.peek();
        stack.pop();
        stack.print();
        stack.clear();
        stack.print();

        StackQueue queue = new StackQueue(10);
        queue.enqueue(new Mahasiswa("Andi", "22552011093", "TIF RM 22 A "));
        queue.enqueue(new Mahasiswa("Sugara", "22552011193", "TIF RM 22 B "));
        queue.enqueue(new Mahasiswa("Putra", "22552011154", "TIF RM 22 C "));

        queue.printQueue();
        queue.peekFront();
        queue.peekRear();
        queue.dequeue();
        queue.printQueue();
    }
}