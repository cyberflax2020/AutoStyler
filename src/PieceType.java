public class PieceType {
    public enum T {
        Coat, Pants, Shoes, Sweater, Base, Middles, Caps, Accessories
    }

    private T type;

    public PieceType(String type) {
        switch (type) {
            case "Coat" -> this.type = T.Coat;
            case "Pants" -> this.type = T.Pants;
            case "Shoes" -> this.type = T.Shoes;
            case "Sweater" -> this.type = T.Sweater;
            case "Base" -> this.type = T.Base;
            case "Middles" -> this.type = T.Middles;
            case "Caps" -> this.type = T.Caps;
            case "Accessories" -> this.type = T.Accessories;
        }
    }

    public T getType() {
        return type;
    }
}

