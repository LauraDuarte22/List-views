package co.edu.unipiloto.listviews;

public class ColorReciclaje {

    private String tipo;
    private String description;
    private int imageId;

    public static final ColorReciclaje[] colores={
            new ColorReciclaje("Color blanco","Residuos aprovechables limpios y secos, como plástico, vidrio, metales, papel y cartón. ",R.drawable.blanco),
            new ColorReciclaje("Color negro","Residuos no aprovechables como el papel higiénico, servilletas, papeles y cartones contaminados con comida, papeles metalizados y también deberán disponerse los residuos COVID-19 como tapabocas, guantes, entre otros. ",R.drawable.negro),
            new ColorReciclaje("Color verde","Residuos orgánicos aprovechables como los restos de comida, residuos de corte de césped y poda de jardín.",R.drawable.verde)

    };

    public ColorReciclaje(String tipo, String description, int imageId) {
        this.tipo = tipo;
        this.description = description;
        this.imageId = imageId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    @Override
    public String toString() {
        return this.tipo;
    }
}
