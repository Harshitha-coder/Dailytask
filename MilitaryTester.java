class MilitaryTester
{
public static void main(String[] args)
{
Military military=new Military("India",43657,"13/08/1954",Military.MilitaryType.NAVIES);
Military military1=new Military("India",236574,"13/08/1954",Military.MilitaryType.SPACENAVIES);

System.out.println(military);

System.out.println("Both are equal:"+military1.equals(military));

}

}