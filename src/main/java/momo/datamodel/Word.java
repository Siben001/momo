package momo.datamodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="dictionary")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="word")
    private String word;
    @Column(name="definition")
    private String definition;
    @Column(name = "example")
    private String example;

    public Word() {}

    public Word(String word, String definition, String example) {
        this.word = word;
        this.definition = definition;
        this.example = example;
    }

    @Override
    public String toString() {
        return String.format(
                "Word[id=%d, word='%s', definition='%s', example='%s']",
                id, word, definition, example);
    }


}
