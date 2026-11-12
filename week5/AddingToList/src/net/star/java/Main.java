import net.star.java.List;

void main() {
        net.star.java.List<String> list = new List<>(2);

        list.add("Aino");
        list.add("Ville");
        IO.println(list);
        IO.println(list.size());

        list.add("Matti");
        IO.println(list.size());

        IO.println(list);
}
