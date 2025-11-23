package br.com.hub.resource;

import br.com.hub.dao.CadastroDao;
import br.com.hub.dto.exception.ErroResponseDto;
import br.com.hub.dto.perfil.CadastroPerfilDto;
import br.com.hub.dto.perfil.DetalhesPerfilDto;
import br.com.hub.model.Cadastro;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.modelmapper.ModelMapper;

import java.net.URI;
import java.sql.SQLException;

@Path("/cadastros")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CadastroResource {

    @Inject
    CadastroDao cadastroDao;

    @Inject
    ModelMapper modelMapper;

    @POST
    public Response cadastrar(@Valid CadastroPerfilDto dto, @Context UriInfo uriInfo) {
        try {
            Cadastro cadastro = modelMapper.map(dto, Cadastro.class);
            cadastroDao.cadastrar(cadastro);

            DetalhesPerfilDto retorno = modelMapper.map(cadastro, DetalhesPerfilDto.class);

            URI uri = uriInfo.getAbsolutePath(); // sem ID, pois seu método ainda não retorna ID

            return Response.created(uri)
                    .entity(retorno)
                    .build();

        } catch (SQLException e) {
            return Response.serverError().entity(
                    new ErroResponseDto("Erro ao cadastrar perfil", e.getMessage())
            ).build();
        }
    }
}
