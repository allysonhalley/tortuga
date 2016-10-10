package br.com.ahsr.tortuga30.model;

/**
 * Created by Allyson on 24/09/2016.
 */

public class DocumentsType extends TemplateAtributes {

    private String name;
    private String description;
    private String number;
    private String mask;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
