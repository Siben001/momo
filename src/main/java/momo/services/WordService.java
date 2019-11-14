package momo.services;

import momo.Repositories.DictionaryRepository;
import momo.datamodel.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    private DictionaryRepository dictionaryRepository;


    public List<Word> getDictionary() {
        return dictionaryRepository.findAll();
    }

    public void saveWord(Word word) {
        dictionaryRepository.saveAndFlush(word);
    }

}
