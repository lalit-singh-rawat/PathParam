
package my;
 import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 import javax.ws.rs.core.MediaType;
@Path("/employee")
public class EmployeeService {
 
    @GET
    @Path("{empId: [0-9]+}")
@Produces(MediaType.TEXT_PLAIN)
    public Response getEmployeeById(@PathParam("empId") String empId){
         
        return Response.status(200).entity("Got employee with id : " + empId).build();
    }
     
    @GET
    @Path("/name/{empName: [a-zA-Z\\s]+}")
@Produces(MediaType.TEXT_PLAIN)
    public Response getEmployeeByName(@PathParam("empName") String name){
         
        return Response.status(200).entity("Got employee with name : " + name).build();
    }
}

/*In the above example, if you use "http://localhost:7002/PathParam/rest/employee/123" URI pattern, getEmployeeById() method will be invoked, and you will get "Got employee with id : 123" as a response.

If you use "http://localhost:7002/PathParam/rest/employee/name/ducat" URI pattern, then getEmployeeByName() method will be invoked and you will get "Got employee with name : ducat" as a response.*/