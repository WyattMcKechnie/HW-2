Most of Member's methods are static and take a user id as an arguement. This way members are accessed by their id number, not by storing the member objects themselves. It was a weird thing to do, and I definitely should have only used a static get method instead of doing what I did, but at this point I don't feel like changing it.

The use of a static id counter means that the tests must be run in sequencial order.

redeeming coffees with coupons is implemented as a seperate method from buying coffee. This is for the sake of simplicity. 