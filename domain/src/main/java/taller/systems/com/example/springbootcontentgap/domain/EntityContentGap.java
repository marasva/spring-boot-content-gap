package taller.systems.com.example.springbootcontentgap.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class EntityContentGap {

    @Id
    private String id;

    private String objectName;

    @Lob
    private byte[] data;

    public EntityContentGap(String objectName, byte[] data) {
        this.objectName = objectName;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getobjectName() {
        return objectName;
    }

    public void setobjectName(String pageName) {
        this.objectName = objectName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}


