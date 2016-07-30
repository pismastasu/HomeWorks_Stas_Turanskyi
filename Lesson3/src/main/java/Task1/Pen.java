package Task1;

/**
 * Created by Stanislav on 30.07.2016.
 */
public class  Pen  {
    private String makerName;
    private String colour;
    private Short thickness;

    Pen (String makerName, String colour, Short thinkness){
        this.makerName = makerName;
        this.colour = colour;
        this.thickness = thinkness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (makerName != null ? !makerName.equals(pen.makerName) : pen.makerName != null) return false;
        if (colour != null ? !colour.equals(pen.colour) : pen.colour != null) return false;
        return thickness != null ? thickness.equals(pen.thickness) : pen.thickness == null;

    }

    @Override
    public int hashCode() {
        int result = makerName != null ? makerName.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (thickness != null ? thickness.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "makerName='" + makerName + '\'' +
                ", colour='" + colour + '\'' +
                ", thickness=" + thickness +
                '}';
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setThickness(Short thickness) {
        this.thickness = thickness;
    }

    public String getMakerName() {
        return makerName;
    }

    public String getColour() {
        return colour;
    }

    public Short getThickness() {
        return thickness;
    }


}
