package mics;
/**
 * E(2,5)
 * E(2,3)
 * E(0,1)
 * E(7,10)
 */
public class EventConflict {
    public static void main(String[] args) {
        Event e1 = new Event();
        Event e2 = new Event();
        Event e3 = new Event();
        Event e4 = new Event();

        e1.start=2;
        e1.end=4;

        e2.start=2;
        e2.end=3;

        e3.start=0;
        e3.end=1;

        e4.start=7;
        e4.end=10;

        System.out.println(e2.isConflict(e4));
    }
}

class Event{
    int start;
    int end;

    public boolean isConflict(Event e){
        if ((this.end > e.start) && (this.start<e.end)){
            return true;
        }
        return false;
    }
}