class AmazonTester
{
public static void main(String[] args)
{
Amazon amz=new Amazon("India");
Alexa ale=new Alexa(3);
amz.initAlexa(ale);
  ale.version=4;
 amz.displayProperties();

}

}