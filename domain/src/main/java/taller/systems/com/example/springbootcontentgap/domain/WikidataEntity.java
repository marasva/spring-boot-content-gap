package taller.systems.com.example.springbootcontentgap.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class WikidataEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String pageName;

    @Lob
    private byte[] data;

    public WikidataEntity(String pageName, byte[] data) {
        this.pageName = pageName;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWikidataName() {
        return pageName;
    }

    public void setWikidataName(String pageName) {
        this.pageName = pageName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


}
