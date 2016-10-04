package br.com.ahsr.tortugalpha.model;

/**
 * Created by Allyson on 24/09/2016.
 */

public class PeopleType {

    private String name;
    private String description;
    private DocumentsType documentsType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DocumentsType getDocumentsType() {
        return documentsType;
    }

    public void setDocumentsType(DocumentsType documentsType) {
        this.documentsType = documentsType;
    }
}
