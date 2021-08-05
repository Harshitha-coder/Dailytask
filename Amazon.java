class Amazon
{
String country;
String foundedDate="2014";
Alexa alexa;

Amazon(String country)
{
this.country=country;
}
void initAlexa(Alexa alexa)
{
this.alexa=alexa;
}
void displayProperties()
{
System.out.println("country: " +this.country);
System.out.println("foundedDate: " +foundedDate);
System.out.println("version: " +this.alexa.version);
System.out.println("noOfSensors :" +this.alexa.noOfSensors);

}
}