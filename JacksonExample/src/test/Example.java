package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Example", propOrder = {
    "metaData"
})
public class Example {
    protected MetaData metaData;
    
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData value) {
        this.metaData = value;
    }
}