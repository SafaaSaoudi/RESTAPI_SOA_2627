package ressourcesrest;

import entities.Option;
import metiers.OptionBusiness;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("options")
public class restOption {
   public OptionBusiness optB= new OptionBusiness();

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response getAllOptions(){
      List <Option>l= optB.getListeOptions();
      return Response.status(200).entity(l).build();
   }
}
