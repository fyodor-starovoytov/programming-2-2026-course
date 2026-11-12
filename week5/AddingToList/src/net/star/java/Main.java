import net.star.java.List;
void main() {
        List<String> list = new List<>(11);
        list.add("Jaana0");
        list.add("Unto1");
        list.add("Jarmo2");
        list.add("Irmeli3");
        list.add("Ville4");
        list.add("Seppo5");
        list.add("Aino6");
        list.add("Ville7");
        list.add("Matti8");
        list.add("Jorma9");
        list.add("Pentti10");

        IO.println(list.size());
        IO.println(list);
        IO.println(list.get(10));

        IO.println(list.get(8));
        list.remove(8);
        IO.println(list);
        IO.println(list.size());
        IO.println(list.get(8));
}

