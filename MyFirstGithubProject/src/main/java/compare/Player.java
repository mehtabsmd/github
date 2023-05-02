package compare;


    public class Player implements Comparable {

        private int age;
        private int rank;
        private String name;

        public Player(int age, int rank, String name) {
            this.age = age;
            this.rank = rank;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "age=" + age +
                    ", rank=" + rank +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object otherPlayer) {

        Player player2 = (Player) otherPlayer;

        if (this.getAge() > player2.getAge()) {
            return 1;
        } else {
            return -1;
 }
}
}
