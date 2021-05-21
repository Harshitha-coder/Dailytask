class EarphoneTester{

public static void main(String[] xyz){

boolean checkconnected = Earphone.connected;
Earphone.connected=true;
Earphone.sound();
Earphone.connected=true;
Earphone.price=999.99;
Earphone.color="blue";
Earphone.sound();
Earphone.connected=false;
Earphone.sound();
}
}