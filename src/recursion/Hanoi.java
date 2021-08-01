package recursion;

import java.util.Stack;

/**
 * Created by prategar on 5/16/17.
 */
public class Hanoi {
    public static void main(String[] args) {
//        Tower[] towers = new Tower[3];
//        for (int i = 0; i < 3; i++) {
//            towers[i] = new Tower(i);
//        }
//        for (int i = 5; i > 0; i--) {
//            towers[0].add(i);
//        }
//        towers[0].move(5, towers[2], towers[1]);
        towerOfHanoi(3,'A','C','B');
    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

}

class Tower {
    Stack<Integer> disks;
    int index;

    public Tower(int index) {
        this.disks = new Stack<>();
        this.index = index;
    }

    public void add(int d) {
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    public void moveTopTo(Tower t){
        int top = disks.pop();
        t.add(top);
        System.out.println("Move disk " + top + " from " + index() +
                " to " + t.index());
    }

    public int index(){
        return this.index;
    }

    public void move(int n, Tower destination, Tower buffer){
        if (n>0){
            move(n - 1, buffer, destination);
            moveTopTo(destination);
            buffer.move(n-1, destination, this);
        }
    }
}
