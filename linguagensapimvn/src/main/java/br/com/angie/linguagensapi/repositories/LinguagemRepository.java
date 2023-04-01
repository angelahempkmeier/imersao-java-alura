package br.com.angie.linguagensapi.repositories;

import br.com.angie.linguagensapi.entities.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
