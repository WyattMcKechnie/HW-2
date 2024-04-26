import org.junit.*;

public class Tests {
   @Test
   public static void test1() {
      MeteorTracker mt = new MeteorTracker();
      Assert.assertEquals(mt.getNextMeteor(), null);
      
   }
   public static void test2() {
      MeteorTracker mt = new MeteorTracker();
      Meteor a = new Meteor(5, 38.8899, 77.0091, mt);
      Meteor b = new Meteor(3, 48.8584, 2.2945, mt);
      Meteor c = new Meteor(6, 51.5074, 0.1278, mt);
      Assert.assertEquals(mt.getNextMeteor(), b);
      Assert.assertEquals(mt.getNextMeteor(), a);
      Assert.assertEquals(mt.getNextMeteor(), c);
      Assert.assertEquals(mt.getNextMeteor(), null);
   }
   public static void test3(){
      MeteorTracker mt = new MeteorTracker();
      Meteor a = new Meteor(5, 38.8899, 77.0091, mt);
      Meteor b = new Meteor(5, 48.8584, 2.2945, mt);
      Assert.assertEquals(mt.getNextMeteor(), a);
      Assert.assertEquals(mt.getNextMeteor(), b);
      Assert.assertEquals(mt.getNextMeteor(), null);
   }
}

