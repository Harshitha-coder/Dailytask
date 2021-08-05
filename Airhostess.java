class Airhostess
{
   String name;
   int id;
   DressCode dressCode;
   boolean goodLooking;
   
 Airhostess(String name,int id,DressCode dressCode,boolean goodLooking)
 {
	 this.name=name;
	 this.id=id;
	 this.dressCode=dressCode;
	 this.goodLooking=goodLooking;
 }
 
 void displayProperties()
 {
	 System.out.println("name: "+this.name);
	 System.out.println("id: "+this.id);
	 System.out.println("dressCode: "+this.dressCode);
	 System.out.println("goodLooking: "+this.goodLooking);
	 
 }
 
 enum DressCode{
	 INDIAN,WESTERN,KOREAN
 }
}