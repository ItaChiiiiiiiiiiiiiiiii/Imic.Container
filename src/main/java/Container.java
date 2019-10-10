public class Container {
    private String idContainer;
    private String lengthContainer;
    private String heightContainer;
    private String kindContainer;
    private boolean activeFlag;
    private String descriptionContainer;

    public void setIdContainer(String idContainer) {
        this.idContainer = idContainer;
    }

    public void setLengthContainer(String lengthContainer) {
        this.lengthContainer = lengthContainer;
    }

    public void setHeightContainer(String heightContainer) {
        this.heightContainer = heightContainer;
    }

    public void setKindContainer(String kindContainer) {
        this.kindContainer=kindContainer;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
    public void setDescriptionContainer(String descriptionContainer){
        this.descriptionContainer=descriptionContainer;
    }
    public String getIdContainer() {
        return idContainer;
    }

    public String getLengthContainer() {
        return lengthContainer;
    }

    public String getHeightContainer() {

        return heightContainer;
    }

    public String getKindContainer() {

        return kindContainer;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }
    public String getDescriptionContainer(){
        return descriptionContainer;
    }
    @Override
    public String toString() {
        return "Container[ id = " + getIdContainer() + ", length =" + getLengthContainer() + ", height =" + getHeightContainer() + ", kind =" + getKindContainer() + ", status=" + isActiveFlag() + "]";
    }
}
