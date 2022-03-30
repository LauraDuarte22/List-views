package co.edu.unipiloto.listviews;

public class Reciclaje {
    private String tipo;
    private String description;
    private int imageId;

    public static final Reciclaje[] tipos={
            new Reciclaje("Plastico","El plastico es un material no biodegradable, que tarda más de 200 años en degradarse cuando se libera en la naturaleza",R.drawable.plastico),
            new Reciclaje("Papel","El papel sí es un material biodegradable, pero como es uno de los materiales más utilizados en todo el mundo, es muy conveniente reciclarlo en lugar de obtenerlo de su fuente natural, la madera de los árboles",R.drawable.papel),
            new Reciclaje("Vidrio","El vidrio es probablemente el material que mejor se adapta al reciclado ya que puede ser reutilizado y procesado una cantidad infinita de veces.",R.drawable.vidrio),
            new Reciclaje("Baterías y pilas","El reciclaje de baterías y pilas resulta muy importante para el cuidado del medio ambiente, ya que generalmente éstas son fabricadas con materiales contaminantes como metales pesados y otros compuestos tóxicos que son muy nocivos si se liberan en la naturaleza",R.drawable.baterias),
            new Reciclaje("Aluminio","El aluminio es un metal muy utilizado cotidianamente en cualquier ámbito, principalmente en el papel de aluminio, latas y envases y en la construcción.", R.drawable.aluminio),

    };

    public Reciclaje(String tipo, String description, int imageId) {
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
