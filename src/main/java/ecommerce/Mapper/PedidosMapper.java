package ecommerce.Mapper;

import ecommerce.Dto.*;
import ecommerce.Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PedidosMapper {


    public static PedidosModel toModelPedidos(PedidosDto pedidosDto) {
        PedidosModel entity = new PedidosModel();
        List<PedidosModel> pedidosModel = Collections.singletonList(new PedidosModel());
        List<EnderecosModel> enderecosModel = Collections.singletonList(new EnderecosModel());
        List<ProdutoModel> produtoModelList = Collections.singletonList(new ProdutoModel());
        ProdutoModel produtoModel = new ProdutoModel();
        entity.setValor_total(pedidosDto.valor_total());
        entity.setData_pedido(pedidosDto.data_pedido());
        entity.setStatus(pedidosDto.status());
        entity.setUsuario(UsuarioDtoToModel(pedidosDto.usuario(),pedidosModel,enderecosModel,produtoModelList));
        entity.setPagamentos(PagamentoDtoToModel(pedidosDto.pagamentos(),entity));
        //entity.setItensPedidos(ItensPedidoDtoToModel(pedidosDto.itensPedidos(),entity,produtoModel));
        return entity;
    }

    private static List<ItensPedidoModel> ItensPedidoDtoToModel(List<ItensPedidoDto> itensPedidoDtos,
                                                                PedidosModel pedidosModel,
                                                                ProdutoModel produtoModel
                                                                ) {
        return itensPedidoDtos
                .stream()
                .map(itensPedidoDto -> {
                    ItensPedidoModel entity = new ItensPedidoModel();
                    entity.setTamanho(itensPedidoDto.tamanho());
                    entity.setQuantidade(itensPedidoDto.quantidade());
                    entity.setPreco(itensPedidoDto.preco());
                    entity.setCor(itensPedidoDto.cor());
                    entity.setPedido(pedidosModel);
                    entity.setProduto(produtoModel);
                    return entity;
                }).collect(Collectors.toList());

    }

    private static List<PagamentosModel> PagamentoDtoToModel(List<PagamentosDto> pagamentosDto, PedidosModel pedidosModel) {
       return pagamentosDto
               .stream()
               .map(pagamentosDto1 -> {
           PagamentosModel entity = new PagamentosModel();
           entity.setValor(pagamentosDto1.valor());
           entity.setStatus(pagamentosDto1.status());
           entity.setMetodo_pagamento(pagamentosDto1.metodo_pagamento());
           entity.setData_pagamento(pagamentosDto1.data_pagamento());
           entity.setPedido(pedidosModel);
           return entity;
                 }).collect(Collectors.toList());

    }

    private static UsuarioModel UsuarioDtoToModel(UsuarioDto usuarioDtos,
                                                  List<PedidosModel> pedidosModel,
                                                  List<EnderecosModel> enderecosModel,
                                                  List<ProdutoModel> produtoModel) {
        UsuarioModel entity = new UsuarioModel();
        entity.setSobrenome(usuarioDtos.sobrenome());
        entity.setNome(usuarioDtos.nome());
        entity.setRole(usuarioDtos.role());
        entity.setSenha(usuarioDtos.senha());
        entity.setTelefone(usuarioDtos.telefone());
        entity.setEmail(usuarioDtos.email());
        entity.setPedidos(pedidosModel);
        entity.setEnderecos(enderecosModel);
        entity.setCarrinho(produtoModel);

        return entity;
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
