package ecommerce.Mapper;

import ecommerce.Dto.EnderecoResponse;
import ecommerce.Dto.EnderecosDto;
import ecommerce.Dto.UsuarioDto;
import ecommerce.Dto.UsuarioResponse;
import ecommerce.Model.EnderecosModel;
import ecommerce.Model.UsuarioModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static UsuarioModel toModel(UsuarioDto usuarioDto) {
        UsuarioModel entity = new UsuarioModel();
        entity.setEmail(usuarioDto.email());
        entity.setSobrenome(usuarioDto.sobrenome());
        entity.setNome(usuarioDto.nome());
        entity.setTelefone(usuarioDto.telefone());
        entity.setSenha(usuarioDto.senha());
        entity.setRole(usuarioDto.role());
        entity.setCriadoEm("21/08/2002");
        entity.setEnderecos(toModel(usuarioDto.enderecos(), entity));
        return entity;
    }

    private static List<EnderecosModel> toModel(List<EnderecosDto> enderecosDtos, UsuarioModel usuarioModel) {
        return enderecosDtos
                .stream()
                .map(enderecoDTO -> {
                    EnderecosModel enderecosModel = new EnderecosModel();
                    enderecosModel.setLogradouro(enderecoDTO.logradouro());
                    enderecosModel.setNumero(enderecoDTO.numero());
                    enderecosModel.setComplemento(enderecoDTO.complemento());
                    enderecosModel.setPais(enderecoDTO.pais());
                    enderecosModel.setEstado(enderecoDTO.estado());
                    enderecosModel.setCriado_em("21/08/2002");
                    enderecosModel.setCodigo_postal(enderecoDTO.codigo_postal());
                    enderecosModel.setCidade(enderecoDTO.cidade());
                    enderecosModel.setBairro(enderecoDTO.bairro());
                    enderecosModel.setUsuario(usuarioModel);
                    return enderecosModel;
                })
                .collect(Collectors.toList());
    }

    public static UsuarioResponse toResponse(UsuarioModel usuarioModel) {
        List<EnderecoResponse> enderecoResponse = new ArrayList<>();
        usuarioModel.getEnderecos().forEach(endereco -> enderecoResponse.add(new EnderecoResponse(endereco.getEndereco_id().toString())));
        return new UsuarioResponse(
                usuarioModel.getNome(),
                usuarioModel.getSobrenome(),
                enderecoResponse
        );
    }
}
