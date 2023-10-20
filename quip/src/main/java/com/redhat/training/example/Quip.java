package com.redhat.training.example;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;


@Path("/")
public class Quip {

@GET
@Produces("text/plain")
public Response index() throws Exception {
    String host = InetAddress.getLocalHost().getHostName();
<<<<<<< HEAD
    return Response.ok("I came, I saw, I conquered...\n").build();
=======
    return Response.ok("here to rule! ...\n").build();
>>>>>>> 3b2380a14100bbe1afc6b5fa59a66f7a5a1b8af2
  }

@GET
@Path("/ready")
@Produces("text/plain")
public Response ready() throws Exception {
    return Response.ok("OK\n").build();
  }

}

