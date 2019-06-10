package login_signup;

public interface CustomerDAO {
	
	public int insertCustomer(Customer c);
	public Customer getCustomer(String username,String pass);
}
