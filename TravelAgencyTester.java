class TravelAgencyTester{

public static void main(String[] arr){
	TravelAgency.displayAgencies();
TravelAgency.addAgency("VRS");
TravelAgency.addAgency("Orange");
TravelAgency.addAgency("Marco Polo");
TravelAgency.addAgency("Sky Tours");
TravelAgency.addAgency("SRS");
TravelAgency.displayAgencyAtIndex(3);
TravelAgency.printFoundIfAgency("SRS");
}

}