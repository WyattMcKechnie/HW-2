import org.junit.*;

public class Tests {
    @Test
    public static void test1() {
        Member a = new Member("John", "Latte");
        Member b = new Member("Jack", "Espresso");
        Member c = new Member("Jimmy", "Black Coffee");

        Assert.assertEquals(Member.getMember(1), a);
        Assert.assertEquals(Member.getMember(3), c);
        Assert.assertEquals(Member.getMember(2), b);
    }

    public static void test2() {
        Member.buyCoffee(1, 2);
        Member.buyCoffee(2, 4);

        Assert.assertEquals(Member.getMember(1).coffee, 2);
        Assert.assertEquals(Member.getMember(1).coupon, 0);
        Assert.assertEquals(Member.getMember(2).coffee, 1);
        Assert.assertEquals(Member.getMember(2).coupon, 1);

        Assert.assertEquals(Member.redeemCoupon(1, 1), false);
        Assert.assertEquals(Member.redeemCoupon(2, 1), true);
    }

    public static void test3() {
        Assert.assertEquals(Member.getInfo(3), Member.getMember(3));

        Assert.assertEquals(Member.buyCoffee(3, 100), 33);
        Assert.assertEquals(Member.getMember(3).coffee, 1);
        Assert.assertEquals(Member.redeemCoupon(3, 10), true);

        Assert.assertEquals(Member.redeemCoupon(3, -10), false);
        Assert.assertEquals(Member.buyCoffee(3, -50), 23);
        Assert.assertEquals(Member.getMember(3).coffee, 1);
    }

}