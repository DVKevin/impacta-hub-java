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
    private CadastroDao cadastroDao;

    @Inject
    private ModelMapper modelMapper;

    @POST
    public Response cadastrar(@Valid CadastroPerfilDto dto, @Context UriInfo uriInfo) {
        try {
            Cadastro cadastro = modelMapper.map(dto, Cadastro.class);
            cadastroDao.cadastrar(cadastro);

            // Retorna o DTO de detalhes (pra usar no front)
            DetalhesPerfilDto retorno = modelMapper.map(cadastro, DetalhesPerfilDto.class);

            URI uri = uriInfo.getAbsolutePath(); // ainda sem ID pois sua DAO não retorna ID

            return Response.created(uri) // Status Code 201
                    .entity(retorno)
                    .build();

        } catch (SQLException e) {
            return Response.serverError().entity(
                    new ErroResponseDto("Erro ao cadastrar perfil", e.getMessage())
            ).build();
        }
    }
}

