package contenment.in;

public class Vitamin 
{
String vitaminName;
float  vitaminQuantity ;
String vitaminParpose;
Fruit f1;


public  Vitamin(String vn,float vq,String vp, Fruit f)
{
	vitaminName=vn;
	vitaminQuantity=vq;
	vitaminParpose=vp;
	f1=f;
}

public String toString()
{
	return "the vitamin  Name is "+vitaminName+"The vitamin Quantity\n"+vitaminQuantity+"the vitamin perpose\n"+vitaminParpose+"has one of the Fruit\n"+ f1;
}



}