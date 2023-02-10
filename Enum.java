enum Season {
    SUMMER,
    SPRING,
    WINTER,
    AUTUMN,
    RAINY
}

public class Enum {

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
