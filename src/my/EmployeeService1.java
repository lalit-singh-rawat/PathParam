
package my;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/employee1")
public class EmployeeService1 {
 
    @GET
    @Path("{empId}")
    public Response getEmployeeById(@PathParam("empId") String empId){
         
        return Response.status(200).entity("Got employee with id : " + empId).build();
    }
     
    @GET
    @Path("{branch}/{department}")
    public Response getEmployeeList(@PathParam("branch") String branchName,
                                    @PathParam("department") String deptName){
         
 String resp = "Total number of employees in the "+deptName+" department from "
                        +branchName+" is 100";
        return Response.status(200).entity(resp).build();
    }
}

/*In the above example, if you use "http://localhost:7002/PathParam/rest/employee1/123" URI pattern, getEmployeeById() method will be invoked, and you will get "Got employee with id : 123" as a response.

Using @PathParam, you can access multiple values as well. Look at getEmployeeList() method in the above example, if you use "http://localhost:7002/PathParam/rest/employee1/bangalore/accounts" URI pattern, then getEmployeeByName() method will be invoked and you will get "Total number of employees in the accounts department from bangalore is 100" as a response.*/