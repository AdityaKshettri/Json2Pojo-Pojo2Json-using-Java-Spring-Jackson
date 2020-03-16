package PojoToJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;

public class Driver 
{
    public static void main(String[] args) 
    {
        try 
        {
            Student theStudent = new Student(1, "Aditya", "Kshettri", true);
            System.out.println(theStudent);
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            mapper.writeValue(new File("data/output.json"), theStudent);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
