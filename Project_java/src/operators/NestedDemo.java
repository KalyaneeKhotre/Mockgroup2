package operators;

public class NestedDemo {
public static void main(String[] args)
{
	int mob=1234;
	String otp="BC";
	if( mob==1234)
	{
		System.out.println("Mobile no. is correct");
		//System.out.println("Payment Successful");
	if(otp=="ABC")
	{
		System.out.println("OTP is correct");
		System.out.println("Payment Successful");
	}
	else
	{
		System.out.println("Wrong OTP");
		System.out.println("Payment failed");
	}
	}
	else
	{
		System.out.println("Wrong Mobile no.");
		System.out.println("Payment failed");
	}
}

}
