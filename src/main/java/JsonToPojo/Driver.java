package JsonToPojo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Driver 
{
    public static void main(String[] args) 
    {
        try 
        {
            ObjectMapper mapper = new ObjectMapper();
            Student theStudent = mapper.readValue(new File("data/sample.json"), Student.class);
            System.out.println("FirstName = " + theStudent.getFirstName());
            System.out.println("LastName = " + theStudent.getLastName());
            Address theaAddress = theStudent.getAddress();
            System.out.println("Street = " + theaAddress.getStreet());
            for(String temp : theStudent.getLanguages()) {
                System.out.println(temp);
            }
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
