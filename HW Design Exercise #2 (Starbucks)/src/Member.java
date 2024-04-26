import java.util.HashMap;

public class Member {
    //Members are differenciated by their id, while name and favorite provide additional information to the barista
    int id;
    String name;
    String favorite;
    //Members are stored in a hashmap. Inputing their id will return the associated member
    static HashMap<Integer, Member> members = new HashMap<Integer, Member>();
    static int idCounter = 1;
    //coffee keeps track of the number of coffees a member has bought, while coupon keeps track of the number of free coffees they have
    int coffee;
    int coupon;


    //Constructor and toString for the Member class. When a member is created, they are added to the hashmap and given an id
    public Member(String name, String favorite) {
        this.id = idCounter;
        this.name = name;
        this.favorite = favorite;
        members.put(id, this);
        System.out.println(name + " has been registered as a member with the following ID: " + id);
        idCounter++;
    }
    public String toString() {
        return "Name: " + name + "\nFavorite: " + favorite + "\nCoupons: " + coupon;
    }

    //Method to print a member and return the member object
    public static Member getMember(int id) {
        Member member = members.get(id);
        return member;
    }
    //Similar to getMember, but prints the member's information as well
    public static Member getInfo(int id) {
        Member member = members.get(id);
        System.out.println(member);
        return member;
    }

    //Method to buy coffee. The member's coffee count is increased by the quantity of coffee bought. If the member has bought 3 or more coffees, they earn free coffee coupons
    //returns the current number of coupons the member has
    public static int buyCoffee(int id, int quantity) {
        Member member = members.get(id);
        if(quantity < 0) {
            System.out.println("Invalid quantity. Please enter a positive number.");
            return member.coupon;
        }
        member.coffee += quantity;
        System.out.println(member.name + " has bought " + quantity + " coffee(s).");
       
        if(member.coffee > 2) {
            member.coupon += member.coffee / 3;
            System.out.println(member.name + " has earned " + member.coffee / 3 + " free coffee coupon(s)!");
            member.coffee = member.coffee % 3;
        }
        return member.coupon;
    }
    //Method to redeem a coupon. If the member has enough coupons, the quantity of coupons is subtracted from the member's coupon count.
    //If the member does not have enough coupons, a message is printed to the console.
    //returns true or false depending on whether the member was able to redeem the coupons
    public static boolean redeemCoupon(int id, int quantity) {
        Member member = members.get(id);
        if(quantity < 0) {
            System.out.println("Invalid quantity. Please enter a positive number.");
            return false;
        }
        if(member.coupon >= quantity) {
            member.coupon -= quantity;
            System.out.println(member.name + " has redeemed " + quantity + " free coffee(s).");
            return true;
        }
        System.out.println(member.name + " does not have enough coupons to redeem.");
        return false;
    }
    
    


    public static void main(String[] args) throws Exception {
        Tests.test1();
        Tests.test2();
        Tests.test3();
    }
}
