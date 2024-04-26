import java.util.PriorityQueue;

public class MeteorTracker {
    //hazards holds our queue of meteors
    PriorityQueue<Meteor> hazards;

    public MeteorTracker() {
        hazards = new PriorityQueue<Meteor>();
    }
    //adds a given meteor to hazards
    public void addMeteor(Meteor a){
        hazards.add(a);
    }
    //returns the next meteor that will make impact and prints a message about it
    //returns null if there are no meteors
    public Meteor getNextMeteor(){
        Meteor a = hazards.poll();
        if(a == null)
            System.out.printf("There are no astroids that need to be destroyed!\n");
        else
            System.out.printf("The next meteor will impact at %f, %f in %d hours!\n", a.latitude, a.longitude, a.hours);
            return a;
    }

    public static void main(String[] args) {
       Tests.test1();
       Tests.test2();
       Tests.test3();
    }
}
