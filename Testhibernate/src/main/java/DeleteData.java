import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {
		blic static void main(String[] args) {
			Configuration configuration = new Configuration();
			 configuration.configure("hibernate.cfg.xml");
			
			 SessionFactory factory =configuration.buildSessionFactory();
			 Session session=factory.openSession();
			 Transaction transaction=session.beginTransaction();
			 Employee employee = new Employee();
			
			 Scanner scanner=new Scanner(System.in);
			 employee.setName(scanner.next());
			 System.out.println("Enter Id");
			 int id=scanner.nextInt();
			 Employee employee=session.get(Employee.class, id);
			 session.delete(employee);
			 transaction.commit();
			 session.close();
			 System.out.println("Data Deleted Successfully");

	}

}
