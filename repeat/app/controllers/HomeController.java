package controllers;

import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject 
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }


    public Result index() {

        List<Client> clientList = Client.findAll();

        return ok(index.render(clientList));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result addClient(){

        Form<Client> clientForm = formFactory.form(Client.class);

        return ok(addClient.render(clientForm));
    }

    public Result addClientSubmit(){

        Client newClient;
        Address address = new Address();
        CV cv = new CV();

        Form<Client> newClientForm = formFactory.form(Client.class).bindFromRequest();

        if(newClientForm.hasErrors()){
            return badRequest(addClient.render(newClientForm));
        } else {
            newClient = newClientForm.get();
            

            String addName = newClientForm.field("address.addName").getValue().get();
            String eirCode = newClientForm.field("address.eirCode").getValue().get();
            address.setAddressName(addName);
            address.seteirCode(eirCode);
            address.save();

            newClient.setAddress(address);                   
            newClient.update();  

            String cvName = newClientForm.field("cv.cvName").getValue().get();
            String objective = newClientForm.field("cv.objective").getValue().get();
            String education = newClientForm.field("cv.education").getValue().get();
            String workExperience = newClientForm.field("cv.workExperience").getValue().get();
            cv.setCVName(cvName);
            cv.setCVObjective(objective);
            cv.setCVEducation(education);
            cv.setCVExperience(workExperience);
            cv.save();

            newClient.setCV(cv);                   
            newClient.update();  

            if (newClient.getId() == null){
                newClient.save();
            }
            else if (newClient.getId() != null) {
                newClient.update();
            }

            flash("success", "Client " + newClient.getName() + "was added");

            return redirect(controllers.routes.HomeController.index());

        }
    }

    
    public Result deleteClient(Long id) {
        
        Client.find.ref(id).delete();

        flash("success", "Client has been removed");

        return redirect(routes.HomeController.index());
    }
    
    @Transactional
    public Result updateClient(Long id){

        Client c;
        Form<Client> clientForm;
        try {
            c = Client.find.byId(id);

            clientForm = formFactory.form(Client.class).fill(c);
            
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addClient.render(clientForm));
    }

}
