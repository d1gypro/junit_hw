class Singer {
    private String name;
    private String family;
    private int age;
    private int price;
    private int popularity;

    public Singer (String name, String family, int age, int price, int popularity) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.price = price;
        this.popularity = popularity;
    }

    public Singer () {
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override
    public String toString() {
        return "Person { " +
                "name='" + name + '\'' +
                ", family = '" + family + '\'' +
                ", age = " + age +
                ", price = " + price +
                ", popularity = " + popularity +
                "}\n";
    }
}