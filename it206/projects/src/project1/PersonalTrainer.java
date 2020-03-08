package project1;

public class PersonalTrainer {

	private String firstName;
   private String lastName;
	private double salary;
	private int noOfClients;
	
	public PersonalTrainer() {
      
	}

	public String getFirstName() {return this.firstName;}
   public String getLastName() {return this.lastName;}
	public double getSalary() {return this.salary;}
	public int getNoOfClients() {return this.noOfClients;}
	
	public void setFirstName(String firstName) {
      this.firstName = firstName;
	}
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
	}
   
	public boolean setSalary(double salary) {
      if (salary > 0.0) {
         this.salary = salary;
         return true;
      }
      else {
         return false;
      }
	}

   public boolean setNoOfClients(int noOfClients) {
      if (noOfClients >= 0) {
   		this.noOfClients = noOfClients;
   		return true;      
      }
      else {
			return false;
      }
	}
	
	public double calculateRevenue() {
		return (195 * this.noOfClients) - this.salary;
	}
   
   public String toString() {
      return this.getFirstName() + " " + this.getLastName() + " trainer has " 
      + this.getNoOfClients() + " clients and earns " + this.getSalary();
           
   }
}

