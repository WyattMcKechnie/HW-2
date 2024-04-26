public class Meteor implements Comparable<Meteor> {
    //latitude and longitude indicate the location where the meteor will make impact
    double latitude;
    double longitude;
    //hours indicates the number of hours before the meteor crashes into Earth
    int hours;
    //creates a meteor with a specified time of impact, latitude, and longitude
    public Meteor(int h, double la, double lo){
        hours = h;
        latitude = la;
        longitude = lo;
    }
    //creates a meteor with a specified time of impact, latitude, and longitude, then adds it to a given MeteorTracker
    public Meteor(int h, double la, double lo, MeteorTracker t){
        hours = h;
        latitude = la;
        longitude = lo;
        t.addMeteor(this);
    }
    //compareTo compares the difference in time between two meteors
    @Override public int compareTo(Meteor a) {
        return this.hours - a.hours;
    }

    public String toString() {
        return "Meteor at (" + latitude + ", " + longitude + ") in " + hours + " hours";}
}
