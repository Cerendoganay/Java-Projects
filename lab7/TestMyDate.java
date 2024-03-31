public class TestMyDate {


	public static void main(String[] args) {
		MyDate date = new MyDate(2017,2,28);

		String strRep = date.toString();
		System.out.println("1. Expected output: 2017-02-28");
		System.out.println("       current date "+strRep+"\n");
		//Expected output: 2017-02-28

		date.incrementDay();
		System.out.println("2. Expected output: 2017-03-01");
		System.out.println(" day increased by 1 "+date.toString()+"\n");
		//Expected output: 2017-03-01


		date.incrementYear(3);
		System.out.println("3. Expected output: 2020-03-01");
		System.out.println("year increased by 3 "+date.toString()+"\n");
		//Expected output: 2020-03-01

		date.decrementDay();
		System.out.println("4. Expected output: 2020-02-29");
		System.out.println(" day decreased by 1 "+date.toString()+"\n");
		//Expected output: 2020-02-29

		date.decrementYear();
		System.out.println("5. Expected output: 2019-02-28");
		System.out.println("year decreased by 1 "+date.toString()+"\n");
		//Expected output: 2019-02-28

		date.decrementMonth();
		System.out.println("6. Expected output:  2019-01-28");
		System.out.println("month decreased by 1 "+date.toString()+"\n");
		//Expected output: 2019-01-28


		date.incrementDay(3);
		System.out.println("7. Expected output: 2019-01-31");
		System.out.println(" day increased by 3 "+date.toString()+"\n");
		//Expected output: 2019-01-31

		date.decrementMonth(2);
		System.out.println("8. Expected output:  2018-11-30");
		System.out.println("month decreased by 2 "+date.toString()+"\n");
		//Expected output: 2018-11-30

		date.decrementDay(30);
		System.out.println("9. Expected output: 2018-10-31");
		System.out.println("day decreased by 30 "+date.toString()+"\n");
		//Expected output: 2018-10-31

		date.incrementMonth(16);
		System.out.println("10. Expected output:  2020-02-29");
		System.out.println("month increased by 16 "+date.toString()+"\n");
		//Expected output: 2020-02-29

		date.decrementYear(4);
		System.out.println("11. Expected output: 2016-02-29");
		System.out.println("year  decreased by 4 "+date.toString()+"\n");
		//Expected output: 2016-02-29

		date.incrementMonth();
		System.out.println("12. Expected output: 2016-03-29");
		System.out.println("month increased by 1 "+date.toString()+"\n");
		//Expected output: 2016-03-29

		date.incrementYear();
		System.out.println("13. Expected output: 2017-03-29");
		System.out.println(" year increased by 1 "+date.toString()+"\n");
		//Expected output: 2017-03-29

		MyDate anotherDate = new MyDate(2017,3,29);


		date = new MyDate(2017,2,28);
		boolean before = date.isBefore(anotherDate);
		System.out.println(anotherDate.toString()+ " is before " + date.toString()+ " : " + before);
		//Expected output: 2017-03-29 is before 2017-02-28 : false

		boolean after = date.isAfter(anotherDate);
		System.out.println(anotherDate.toString()+ " is after " + date.toString()+ " : " + after);
		//Expected output: 2017-03-29 is after 2017-02-28 : true
		//return !isBefore(anotherDate);
		int dayDiff = date.dayDifference(anotherDate);
		System.out.println("Day difference between " + date.toString()+ " and " + anotherDate.toString()+ " is " + dayDiff);
		//Expected output: Day difference between 2017-03-29 and 2017-02-28 is 29


	}



}