package com.arc.lince.gateways.dtos.response;

import com.arc.lince.domains.Equipe;
import com.arc.lince.domains.Supervisor;

public record EquipeResponseDto(
        String nome,
        String descricao
){
    public static EquipeResponseDto fromEquipe(Equipe equipe){
        return new EquipeResponseDto(
                equipe.getNome(),
                equipe.getDescricao()
        );
    }
}
