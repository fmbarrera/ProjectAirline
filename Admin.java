package project;

import project.Person;

public class Admin extends Person
{  
private int IDnumber = 1000;
private String Firstname;
private String Lastname;
private String Address;
private String Zip;
private String State;
private String Username;
private String Password;
private String Email;
private String SSN;
private String SecurityQ;
private String AdminSecretCode;
	public Admin() {
		this.IDnumber = 1000;
		this.Firstname = "Tom";
		 this.Lastname = "Jason";
		 this.Address = "123 abc rd";
		 this.Zip = "12345";
		 this.State = "Ga";
		 this.Username = "Admin";
		 this.Password = "123456";
		 this.Email = "tom@email.com";
		 this.SSN = "123456789";
		 this.SecurityQ = "Admin";
		 this.AdminSecretCode = "Admin";
	}
	public Admin(
            int AdminIDnumber,
			String AdminFirstname,
			String AdminLastname,
			String AdminAddress,
			String AdminZip,
			String AdminState,
			String AdminUsername,
			String AdminPassword,
			String AdminEmail,
			String AdminSSN,
			String AdminSecurityQ)
	{
		super(AdminIDnumber, AdminFirstname, AdminLastname, AdminAddress, AdminZip,AdminState,AdminUsername,AdminPassword,
				AdminEmail, AdminSSN, AdminSecurityQ);    
	}  
	public int getAdminIDnumber() {
		return super.getIDnumber();
	}
	public void setAdminFirstname(String AdminFirstname) {
		super.setFirstname(AdminFirstname);
	}
	public void setAdminLastname(String AdminLastname) {
		super.setLastname(AdminLastname);
	}
	public String getAdminFirstname() {
		return super.getFirstname();
	}
	public String getAdminLastname() {
		return super.getLastname();
	}
	public void setAdminAddress(String AdminAddress) {
		super.setAddress(AdminAddress);	}
	public String getAdminAddress() {
		return super.getAddress();	}
	public void setAdminZip(String AdminZip) {
		super.setZip(AdminZip);
	}
	public String getAdminZip() {
		return super.getZip();
	}
	public void setAdminState(String AdminState) {
		super.setState(AdminState);
	}
	public String getAdminState() {
		return super.getState();
	}
	public void setAdminCode(String AdminUsername) {
		super.setUsername(AdminUsername);
	}
	public String getAdminCode() {
		return super.getUsername();
	}
	public void setAdminPassword(String AdminPassword) {
		super.setPassword(AdminPassword);
	}
	public String getAdminPassword() {
		return super.getPassword();
	}
	public void setAdminEmail(String AdminEmail) {
		super.setEmail(AdminEmail);
	}
	public String getAdminEmail() {
		return super.getEmail();
	}
	public void setAdminSSN(String AdminSSN) {
		super.setSSN(AdminSSN);
	}
	public void setAdminSecurityQ(String AdminSecurityQ) {
		super.setSecurityQ(AdminSecurityQ);
	}
	public String getAdminSecurityQ() {
		return super.getSecurityQ();
	}public String getAdminSecretCode() {
		return AdminSecretCode;
	}
	
	@Override
	public String toString() {
		return  "\n*ID Number: " + getAdminIDnumber() +
				"\n*Name: "+ getAdminFirstname() + " " + getAdminLastname()+
				"\n*Address: "+ getAdminAddress() + " " + getAdminState() + ", " + getAdminZip() + 
				"\n*Username: " + getAdminCode() +
				"\n*Password: " +  getAdminPassword() +
				"\n*Email: " +  getAdminEmail() +
				"\n*SQ: " +  getAdminSecurityQ();
	}
	}

