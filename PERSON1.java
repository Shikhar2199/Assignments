package personClass.assignment;

public class PERSON1 {
	private int PersonId;
	private String personName;
	private int personAge;
	private String personLocation;
	
	public PERSON1()
	{
		
	}
	
	public PERSON1(int personAge)
	{
		
	}
	
	public PERSON1(String personLocation)
	{
		
	}
	
	public void TesterA() 
	{
		System.out.println("Printing for Testing Dynamic Method invocation");
	}
	
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonLocation() {
		return personLocation;
	}
	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}
	
	
	
	
	

}
