package com.pb.rest;

import com.pb.rest.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DK on 13.08.2017.
 */

@Path("/product")
public class ProductService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {
        return new ArrayList<Product>(){{
            add(new Product("dima", 23));
            add(new Product("vlad", 9));
            add(new Product("alla", 43));
        }};
    }

    /*
    @GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getAllMessages() {
		List<Message> messages = Data.getData();
		if (messages == null) {
			throw new RuntimeException("Can't load all messages");
		}
		return messages;
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessageById(@PathParam("id") long id) {
		Message message = Data.findMessageById(id);
		if (message == null) {
			throw new RuntimeException("can't find mesage with id = " + id);
		}
		return message;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void addMessage(JAXBElement<Message> message) {
		if (Data.addMesage(message.getValue()) != true) {
			throw new RuntimeException("can't add mesage with id = "
					+ message.getValue().getMessageId());
		}
	}

	@DELETE
	@Path("{id}")
	public void deleteMessage(@PathParam("id") long id) {
		if (Data.deleteMessageById(id) != true) {
			throw new RuntimeException("can't delete mesage with id = " + id);
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void updateMessage(JAXBElement<Message> message) {
		if (Data.updateMessage(message.getValue()) != true) {
			throw new RuntimeException("can't update mesage with id = "
					+ message.getValue().getMessageId());
		}
	}
     */
}
