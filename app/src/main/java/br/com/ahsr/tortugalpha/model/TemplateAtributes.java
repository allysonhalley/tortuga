package br.com.ahsr.tortugalpha.model;

/**
 * Created by Allyson on 24/09/2016.
 */

public abstract class TemplateAtributes {

    private String id;
    private boolean type; /*true é principal false não é;*/
    private boolean isAble; /*estão ou não ativado;*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isAble() {
        return isAble;
    }

    public void setAble(boolean able) {
        isAble = able;
    }

}
