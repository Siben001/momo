package momo.controller;

import momo.datamodel.Word;
import momo.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private WordService wordService;

    @GetMapping
    public List<Word> getDictionary() {
        List<Word> res = wordService.getDictionary();
        return res;
    }

    @PostMapping
    public void saveWord(Word word) {
        wordService.saveWord(word);
    }

}
