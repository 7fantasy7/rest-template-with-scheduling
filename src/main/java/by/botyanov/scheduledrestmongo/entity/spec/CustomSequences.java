package by.botyanov.scheduledrestmongo.entity.spec;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequences")
public class CustomSequences {

    @Id
    private String id;
    private Long seq;

    public String getId() {
        return id;
    }

    public CustomSequences setId(String id) {
        this.id = id;
        return this;
    }

    public Long getSeq() {
        return seq;
    }

    public CustomSequences setSeq(Long seq) {
        this.seq = seq;
        return this;
    }

}
