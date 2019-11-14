package momo.Repositories;

import momo.datamodel.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends JpaRepository<Word, Long> {

}