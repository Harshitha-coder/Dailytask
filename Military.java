class Military
{
  String country;
  long capacity;
  String foundedDate;
  MilitaryType type;

  enum MilitaryType{
	  NAVIES,SPACENAVIES,AIRFORCES
  }
Military(String country,long capacity,String foundedDate,MilitaryType type)
{
	this.country=country;
	this.capacity=capacity;
	this.foundedDate=foundedDate;
	this.type=type;
}

 public int hashcode()
 {
	 System.out.println("invoked hashcode method in military");
	 return 13;
	 
 }
@Override
 public String toString()
 {
	 System.out.println("invoked toString method in military");
	 System.out.println("Country:"+this.country+" "+"Capacity:"+this.capacity+" "+"militaryType:"+this.type);
	 return "Military";
 }
@Override
 public boolean equals(Object ref)
 {
	 System.out.println("invoked equals method in military");
	 if(ref==null)
		 return false;
	 if(ref instanceof Military)
	 {
		 Military instance=(Military)ref;
		 if(this.country.equals(instance.country))
		 {
			 System.out.println("Military is equal");
			 return true;
		 }
		 else
		 {
			System.out.println(" Military is not equal"); 
			return false;
		 }
	 }
	 
	 return false;
 }
}